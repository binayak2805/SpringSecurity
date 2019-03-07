package com.bk.a;

import com.bk.b.B;
import com.bk.err.MyException;

public class A {

	private B b;

	public A(B b) {
		this.b = b;
	}

	public String m1() throws MyException {
		// use b
		String msg=null;
		
			msg = b.m3("binayak", 943854582);

		return msg;

	}

}
