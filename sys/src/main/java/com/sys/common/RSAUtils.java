package com.sys.common;


import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;  
import java.security.KeyPair;  
import java.security.KeyPairGenerator;  
import java.security.NoSuchAlgorithmException;  
import java.security.interfaces.RSAPrivateKey;  
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;  
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.PrivateKey;   
import java.security.PublicKey;   
    
import javax.crypto.Cipher;   
import java.util.HashMap;  
  
import javax.crypto.Cipher;  
import sun.misc.BASE64Decoder;   
import sun.misc.BASE64Encoder;   
  
/**

* Copyright (C),2017, Guangzhou ChangLing info. Co., Ltd.

* FileName: RSAUtils.java

* RSA加密通用类

* @author hey
    * @Date    2017年11月1日 下午4:43:35

* @version 1.00

*/
@SuppressWarnings({ "restriction", "unused" })
public class RSAUtils {  
	
    /**
    * 获取公钥和私钥
    * @return 返回的map中，包含公钥和私钥，可通过map.get("public")或者map.get("private")获取
    * @throws NoSuchAlgorithmException 使用JDK没有包含该加密算法
    * @author hey
    * @Date    2017年11月1日下午4:44:10
    * @version 1.00
    */
    public static HashMap<String, Object> getKeys() throws NoSuchAlgorithmException{  
        HashMap<String, Object> map = new HashMap<String, Object>();  
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");  
        keyPairGen.initialize(512);  
        KeyPair keyPair = keyPairGen.generateKeyPair();  
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();  
        map.put("public", publicKey);  
        map.put("private", privateKey);  
        return map;  
    }  
    
	/**
	* 根据公钥或者私钥，得到它们的字符串类型
	* @param key 公钥或者私钥
	* @return 返回key的字符串类型
	* @throws Exception 转型时出现异常
	* @author hey
	* @Date    2017年11月1日下午4:47:19
	* @version 1.00
	*/
	public static String getKeyString(Key key) throws Exception {   
        byte[] keyBytes = key.getEncoded();   
        String s = (new BASE64Encoder()).encode(keyBytes);   
        return s;   
    }   
  
    /**
    * 使用模和指数生成RSA公钥 
    * 注意：【此代码用了默认补位方式，为RSA/None/PKCS1Padding，不同JDK默认的补位方式可能不同，如Android默认是RSA
    * @param modulus 模
    * @param exponent 指数
    * @return
    * @author hey
    * @Date    2017年11月1日下午4:46:49
    * @version 1.00
    */
    public static RSAPublicKey getPublicKey(String modulus, String exponent) {  
        try {  
            BigInteger b1 = new BigInteger(modulus);  
            BigInteger b2 = new BigInteger(exponent);  
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");  
            RSAPublicKeySpec keySpec = new RSAPublicKeySpec(b1, b2);  
            return (RSAPublicKey) keyFactory.generatePublic(keySpec);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
 
    /**
    * 使用模和指数生成RSA私钥 
    * 注意：【此代码用了默认补位方式，为RSA/None/PKCS1Padding，不同JDK默认的补位方式可能不同，如Android默认是RSA 
    * /None/NoPadding】 
    * @param modulus 模
    * @param exponent 指数 
    * @return
    * @author hey
    * @Date    2017年11月1日下午4:48:45
    * @version 1.00
    */
    public static RSAPrivateKey getPrivateKey(String modulus, String exponent) {  
        try {  
            BigInteger b1 = new BigInteger(modulus);  
            BigInteger b2 = new BigInteger(exponent);  
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");  
            RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(b1, b2);  
            return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
  
    /**
    * 公钥加密 
    * @param data 需要加密的数据
    * @param publicKey 公钥
    * @return 返回加密后的密文
    * @throws Exception
    * @author hey
    * @Date    2017年11月1日下午4:49:05
    * @version 1.00
    */
    public static String encryptByPublicKey(String data, RSAPublicKey publicKey)  
            throws Exception {  
        Cipher cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);  
        // 模长  
        int key_len = publicKey.getModulus().bitLength() / 8;  
        // 加密数据长度 <= 模长-11  
        String[] datas = StringUtils.splitString(data, key_len - 11);  
        String mi = "";  
        //如果明文长度大于模长-11则要分组加密  
        for (String s : datas) {  
            mi += StringUtils.bcd2Str(cipher.doFinal(s.getBytes()));  
        }  
        return mi;  
    }  
  
    /**
    * 私钥解密
    * @param data 需要解密的数据
    * @param privateKey 私钥
    * @return 返回解密后的明文
    * @throws Exception
    * @author hey
    * @Date    2017年11月1日下午4:49:29
    * @version 1.00
    */
    public static String decryptByPrivateKey(String data, RSAPrivateKey privateKey)  
            throws Exception {  
        Cipher cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.DECRYPT_MODE, privateKey);  
        //模长  
        int key_len = privateKey.getModulus().bitLength() / 8;  
        byte[] bytes = data.getBytes();  
        byte[] bcd = ASCII_To_BCD(bytes, bytes.length);  
//        System.err.println(bcd.length);  
        //如果密文长度大于模长则要分组解密  
        String ming = "";  
        byte[][] arrays = splitArray(bcd, key_len);  
        for(byte[] arr : arrays){  
            ming += new String(cipher.doFinal(arr));  
        }  
        return ming;  
    }  
 
    /**
    * 
    * @param ascii 
    * @param asc_len
    * @return
    * @author hey
    * @Date    2017年11月1日下午4:50:18
    * @version 1.00
    */
    public static byte[] ASCII_To_BCD(byte[] ascii, int asc_len) {  
        byte[] bcd = new byte[asc_len / 2];  
        int j = 0;  
        for (int i = 0; i < (asc_len + 1) / 2; i++) {  
            bcd[i] = asc_to_bcd(ascii[j++]);  
            bcd[i] = (byte) (((j >= asc_len) ? 0x00 : asc_to_bcd(ascii[j++])) + (bcd[i] << 4));  
        }  
        return bcd;  
    }  
    private static byte asc_to_bcd(byte asc) {  
        byte bcd;  
  
        if ((asc >= '0') && (asc <= '9'))  
            bcd = (byte) (asc - '0');  
        else if ((asc >= 'A') && (asc <= 'F'))  
            bcd = (byte) (asc - 'A' + 10);  
        else if ((asc >= 'a') && (asc <= 'f'))  
            bcd = (byte) (asc - 'a' + 10);  
        else  
            bcd = (byte) (asc - 48);  
        return bcd;  
    }  
  
    /**
    * 拆分数组
    * @param data
    * @param len
    * @return
    * @author hey
    * @Date    2017年11月1日下午4:53:41
    * @version 1.00
    */
    public static byte[][] splitArray(byte[] data,int len){  
        int x = data.length / len;  
        int y = data.length % len;  
        int z = 0;  
        if(y!=0){  
            z = 1;  
        }  
        byte[][] arrays = new byte[x+z][];  
        byte[] arr;  
        for(int i=0; i<x+z; i++){  
            arr = new byte[len];  
            if(i==x+z-1 && y!=0){  
                System.arraycopy(data, i*len, arr, 0, y);  
            }else{  
                System.arraycopy(data, i*len, arr, 0, len);  
            }  
            arrays[i] = arr;  
        }  
        return arrays;  
    }  
}  