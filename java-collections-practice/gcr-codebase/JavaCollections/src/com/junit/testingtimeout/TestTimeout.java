package com.junit.testingtimeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TestTimeout {
Data d = new Data();
	
	@Timeout(50)
	@Test
	void show() throws InterruptedException {
		Thread.sleep(5000);
		d.printData();
	}
}
