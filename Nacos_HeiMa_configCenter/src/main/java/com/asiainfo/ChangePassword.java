package com.asiainfo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * nacos使用BCrypt算法来加密密码。
 * nacos更改密码的方法：
 * 1、使用BCrypt算法对明文进行加密（需要导入spring-security-core的jar包）
 * 2、得到上一步的密文，到nacos数据库找到users表，更改里面的密文密码字段即可
 */
public class ChangePassword {
	public static void main(String[] args) {
		String encode = new BCryptPasswordEncoder().encode("zzw1234");
		System.out.println(encode);
	}
}
