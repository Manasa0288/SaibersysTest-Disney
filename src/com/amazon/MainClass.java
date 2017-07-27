package com.amazon;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AmazonWebDriver AWD = new AmazonWebDriver();
		AWD.Website();
		CallingXpath CX = new CallingXpath();
		CX.Login();
		CX.Item();
		CheckOut CO = new CheckOut();
		CO.Address();
	}

}
