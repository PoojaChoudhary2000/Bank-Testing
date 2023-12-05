package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro = new Properties();

	public ReadConfig() {

		File src = new File("C:\\javaProgram\\inetBankingV2\\Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getApplicationUrl() {
		String url = pro.getProperty("BASEURL");
		return url;

	}

	public String getUsername() {
		String Username = pro.getProperty("USERNAME");
		return Username;

	}

	public String getPassword() {
		String password = pro.getProperty("PASSWORD");
		return password;

	}

	public String getChromepath() {
		String chromepath = pro.getProperty("CHROMEPATH");
		return chromepath;

	}
}
