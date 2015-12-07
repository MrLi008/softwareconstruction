package com.mrli.test;

import com.mrli.dboperator.BridgeOfDataAndFrame;
import com.mrli.objects.UserLogData;

public class BridgeOfDataAndFrameTest {

	public static void main(String[] args) {

		System.out.println(
				BridgeOfDataAndFrame.isSame(
						new UserLogData("MrLi", "1234568")));
	}

}
 