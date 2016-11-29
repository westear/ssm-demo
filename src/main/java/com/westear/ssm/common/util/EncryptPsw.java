package com.westear.ssm.common.util;

import java.security.MessageDigest;

/**
 * 密码加密工具类
 * @author westear
 *
 */
public class EncryptPsw {

	public EncryptPsw(){}
	
	private static final String KEY_MD = "MD5";
	
	private static final String KEY_SHA = "SHA-256";
	
	/**
	 * 基于MD5，得到32位加密字符串
	 * @param psw	密码
	 * @return	32位加密字符串
	 */
	public static String encryptByMD(String psw){
		StringBuffer sb = new StringBuffer();
		try{
			MessageDigest md = MessageDigest.getInstance(KEY_MD);
			byte[] inputData = psw.getBytes("utf-8");
			md.update(inputData);
			byte byteData[] = md.digest();
			// 二进制转换为十六进制
			for(int i = 0; i < byteData.length; i++){
				sb.append(Integer.toString((byteData[i] & 0xff)+0x100, 16).substring(1));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	/**
	 * 基于SHA-256，得到64位加密字符串
	 * @param psw	密码
	 * @return	64位加密字符串
	 */
	public static String encryptBySHA(String psw){
		StringBuffer sb = new StringBuffer();
		try {
			byte[] inputData = psw.getBytes();
			MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
			messageDigest.update(inputData);
			byte byteData[] = messageDigest.digest();
			// 二进制转换为十六进制
			for(int i = 0; i < byteData.length; i++){
				sb.append(Integer.toString((byteData[i] & 0xff)+0x100, 16).substring(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		System.out.println("MD5加密后的字符串:"+EncryptPsw.encryptByMD("test123")+"==="+EncryptPsw.encryptByMD("westear514*").length());
		System.out.println("SHA-256加密后的字符串:"+EncryptPsw.encryptBySHA("test123*")+"==="+EncryptPsw.encryptBySHA("westear514*").length());
	}
}
