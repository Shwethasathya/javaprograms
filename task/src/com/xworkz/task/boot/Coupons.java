package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.HashSet;

public class Coupons {

	public static void main(String[] args) {

		String coupon = "percentage off coupon";
		String coupon1 = "amazon coupon";
		String coupon2 = "free shipping";
		String coupon3 = "free gift with purchase";
		String coupon4 = "promo code";
		String coupon5 = "bogo coupon";
		String coupon6 = "automatic coupon";
		String coupon7 = "gift card with purchase";
		String coupon8 = "mobile coupons";
		String coupon9 = "loyalti points";
		String coupon10 = "spin wheel";
		String coupon11 = "usage limit coupons";
		String coupon12 = "time limited coupons";
		
		Collection<String> hash = new HashSet<String>();
		
		hash.add(coupon12);
		hash.add(coupon1);
		hash.add(coupon2);
		hash.add(coupon3);
		hash.add(coupon4);
		hash.add(coupon5);
		hash.add(coupon6);
		hash.add(coupon7);
		hash.add(coupon8);
		hash.add(coupon9);
		hash.add(coupon10);
		hash.add(coupon11);
		hash.add(coupon);

		System.out.println("size of the collection is " +hash.size());
		
		hash.clear();
		
		System.out.println("after clearing");
	}

}
