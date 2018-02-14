package com.sudhir.beans;

import java.util.Date;

public class WishGeneratorConstructorInjection {
	private Date date;

	public WishGeneratorConstructorInjection(Date date) {
		this.date = date;
	}



	public void printMessage(String user) {
		int hours = date.getHours();
		if(hours<12)
			System.out.println("Gm, "+user);
		else if(hours<16)
			System.out.println("GA, "+user);
		else if(hours<20)
			System.out.println("GE, "+user);
		else
			System.out.println("GN, "+user);
	}
}
