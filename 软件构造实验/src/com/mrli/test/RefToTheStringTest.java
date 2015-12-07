package com.mrli.test;

import com.mrli.objects.RefToTheString;
import com.mrli.objects.UserLogData;

/**
 * ≤‚ ‘RefToTheString
 * @author MrLi
 *
 */

public class RefToTheStringTest {

	public static void main(String[] args) {

		RefToTheString rtts = new RefToTheString("com.mrli.objects.UserLogData");
		System.out.println(rtts.toAttributes());
		System.out.println(new UserLogData().toAttributes());
		
	}

}
