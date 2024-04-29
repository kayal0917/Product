package com.chainsys.project;
import java.util.Scanner;

public class UserProduct {

	public static void main(String[] args) {

		user();
		
		productses i = new productses();
		i.checking();
		i.status();
		ProductTabb t=new ProductTabb();
		t.checkings();
		}

	public static int warrenty = 5;
	static String coupon = "SFDFDS122";

	public static void user() {
		ProductDetails p=new ProductDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("                      WELCOME TO Ash Mobiles");
        System.out.println("");
		System.out.println("Are you a Regular customer(yes/no)");
		String r = sc.next();
		String r1 = "yes", r2 = "no";

		if (r.equals(r1)) {
			p.m2();

		} else if (r.equals(r2)) {
			NoUserProduct n = new NoUserProduct();
			n.detailss();
			p.m2();

		}

	}

	public static void priceCalculation(int price, int quantity) {
		int totalPrice;

		totalPrice = price * quantity;

		double discount = totalPrice * 0.15;
		System.out.println("original price : " + totalPrice + " Discounted price : " + (totalPrice - discount));

	}
}
