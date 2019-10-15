package com.sys.common;

import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

/**

* Copyright (C),2017, Guangzhou ChangLing info. Co., Ltd.

* FileName: JedisUtils.java

* reids通用类

* @author hey
    * @Date    2017年11月24日 下午2:54:42

* @version 1.00

*/
public class JedisUtils {

    private static final Logger logger = LogManager.getLogger(JedisUtils.class);

    private static JedisPool jedisPool = new JedisPool("localhost");

    private static Jedis jedis = null;
    
    private static String pw = "123456";
    
    private JedisUtils() {
    }

    /**
    * 务必使用过之后要jedis.close()关闭连接
    * @return
    * @author hey
    * @Date    2017年8月14日下午12:12:15
    * @version 1.00
    */
    public static Jedis getJedis() {
        return jedisPool.getResource();
    }

    /**
    * 向key指向的set集合中插入若干条数据
    * @param key 
    * @param members
    * @author hey
    * @Date    2017年8月14日下午12:12:57
    * @version 1.00
    */
    public static void sadd(String key, String... members) {
        //redis操作发生异常时要把异常捕获，不要响应正常的业务逻辑
        try {
            jedis = getJedis();
            jedis.auth(pw);
            jedis.sadd(key, members);
            logger.debug("sadd：向缓存中添加数据，key：{} value：{}", key, members);
        } catch (Exception e) {
            logger.error("sadd：向缓存中添加数据时出现异常，key：{} value：{}", key, members);
        } finally {
            //保证jedis被关闭（归还给连接池）
            closeQuietly(jedis);
        }
    }

    /**
    * 从key指向的set集合中取出所有数据并删除此key指向的set集合
    * @param key
    * @return
    * @author hey
    * @Date    2017年8月14日下午12:13:23
    * @version 1.00
    */
    @SuppressWarnings("unchecked")
    public static Set<String> smembersAndDel(String key) {
        Set<String> set = null;
        try {
            jedis = getJedis();
            jedis.auth(pw);
            Transaction tx = jedis.multi();
            tx.smembers(key);
            tx.del(key);

            List<Object> result = tx.exec();
            if (result == null || result.isEmpty()) {
                logger.error("smembersAndDel：从缓存中取出数据以及删除数据的事务失败");
            } else {
                set = (Set<String>) result.get(0);
                logger.debug("smembersAndDel：从缓存中取出数据同时删除了key，key：{}，value：{}", key, set);
            }

        } catch (Exception e) {
            logger.error("smembersAndDel：从缓存中取出数据或者删除数据是出现异常", e);
        } finally {
            closeQuietly(jedis);
        }
        return set;
    }

    /**
    * 添加一对key:value，并设置过期时间
    * @param key 键
    * @param expire 过期时间
    * @param value 值
    * @author hey
    * @Date    2017年8月14日下午12:14:02
    * @version 1.00
    */
    public static void setex(String key, int expire, String value) {
        try {
            jedis = getJedis();
            jedis.auth(pw);
            jedis.setex(key, expire, value);
            logger.debug("setex：向缓存中添加数据，key：{}，value：{}，过期时间：{}秒", key, value, expire);
        } catch (Exception e) {
            logger.error("setex：向缓存中添加数据时出现异常，key：{}，value：{}，过期时间：{}秒", key, value, expire, e);
        } finally {
            //保证jedis被关闭（归还给连接池）
            closeQuietly(jedis);
        }
    }

    /**
    * 获得key指向的value
    * @param key
    * @return
    * @author hey
    * @Date    2017年8月14日下午12:14:30
    * @version 1.00
    */
    public static String get(String key) {
        String value = null;
        try {
            jedis = getJedis();
            jedis.auth(pw);
            value = jedis.get(key);
            logger.debug("get：从缓存中获取数据，key：{}，value：{}", key, value);
        } catch (Exception e) {
            logger.error("get：从缓存中获取数据时出现异常，key：{}，value：{}", key, value, e);
        } finally {
            //保证jedis被关闭（归还给连接池）
            closeQuietly(jedis);
        }
        return value;
    }
    
    /**
    * 设置值，如果key存在就覆盖原有的值
    * @param key 
    * @param value
    * @author hey
    * @Date    2017年10月18日上午9:41:28
    * @version 1.00
    */
    public static void set(String key, String value){
        try {
            jedis = getJedis();
            jedis.auth(pw);
            jedis.set(key, value);
            logger.debug("set：向缓存中添加数据，key：{}，value：{}", key, value);
        } catch (Exception e) {
            logger.error("set：向缓存中添加数据时出现异常，key：{}，value：{}", key, value, e);
        } finally {
            //保证jedis被关闭（归还给连接池）
            closeQuietly(jedis);
        }
    }
    
    /**
    * 查看某个key的剩余生存时间,单位【秒】.
    * @param key
    * @return  永久生存或者不存在的都返回-1
    * @author hey
    * @Date    2017年10月18日上午9:46:39
    * @version 1.00
    */
    public static Long ttl(String key){
    	 Jedis jedis = getJedis();
    	 jedis.auth(pw);
         Long expire = jedis.ttl(key);
         closeQuietly(jedis);
         return expire;
    }
    
    /**
    * 根据key，判断缓存中是否存在对应的value
    * @param key 缓存中的key
    * @return 返回true表示找到了对应的value
    * @author hey
    * @Date    2017年8月30日下午3:29:54
    * @version 1.00
    */
    public static boolean isExist(String key){
         Boolean exist = null;
         try {
             jedis = getJedis();
             jedis.auth(pw);
             exist = jedis.exists(key);
             if(exist){
             	logger.debug("根据此key:{}，可以在缓存中找到对应的value",key);
             	return true;
             } else {
            	logger.debug("根据此key:{}，并没有在缓存中找到对应的value",key);
            	return false;
             }
         } catch (Exception e) {
             logger.error("get：从缓存中获取数据时出现异常，key：{}", key,e);
             throw new RuntimeException(e);
         } finally {
             //保证jedis被关闭（归还给连接池）
             closeQuietly(jedis);
         }
    }

    /**
    * 根据key的前缀删除所有相关的key
    * @param keyPattern 参数支持正则表达式
    * @author hey
    * @Date    2017年8月14日下午12:15:48
    * @version 1.00
    */
    public static void del(String keyPattern) {
        try {
            jedis = getJedis();
            jedis.auth(pw);
            Set<String> keys = jedis.keys(keyPattern);
            logger.debug("要删除的key为：{}", keys);

            if (keys != null && keys.size() > 0) {
                String[] arr = new String[keys.size()];
                jedis.del(keys.toArray(arr));
            }
            logger.debug("del：从缓存中删除数据，keyPattern：{}", keyPattern);
        } catch (Exception e) {
            logger.error("del：从缓存中删除数据时出现异常，keyPattern：{}", keyPattern);
        } finally {
            //保证jedis被关闭（归还给连接池）
            closeQuietly(jedis);
        }
    }

    public static void closeQuietly(Jedis jedis) {
        if (jedis != null) {
            try {
                jedis.close();
            } catch (Exception e) {
                logger.error("关闭jedis连接时发生异常", e);
            }
        }
    }

}
