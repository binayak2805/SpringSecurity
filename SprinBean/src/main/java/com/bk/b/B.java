package com.bk.b;

import com.bk.err.MyException;

public class B {
	private String name;

	public String m3(String name, int no) throws MyException {
         if(!name.equals("binayak")) {
        	 throw new MyException("name is not matched");
         }
		return "Your name is " + name + " number is " + no;

	}

}
