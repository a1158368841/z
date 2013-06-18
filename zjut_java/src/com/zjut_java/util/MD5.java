package com.zjut_java.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String md5(String str){
		 String s=str;
			if(s==null){
				return "";
			}else{
				String value = null;
				MessageDigest md5 = null;
				try {
					md5 = MessageDigest.getInstance("MD5");
					}catch (NoSuchAlgorithmException ex) {
						}
				sun.misc.BASE64Encoder baseEncoder = new sun.misc.BASE64Encoder();
				try {
					value = baseEncoder.encode(md5.digest(s.getBytes("utf-8")));
					} catch (Exception ex) {
					}
				return value;
				}
	}
	
}
