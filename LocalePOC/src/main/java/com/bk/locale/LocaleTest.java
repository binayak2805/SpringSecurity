package com.bk.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {

	public static void main(String[] args) {
		
		Locale locale = new Locale("de","DE");
		
		ResourceBundle rsb=ResourceBundle.getBundle("App",locale);
		System.out.println(rsb.getString("label1"));

	}

}
