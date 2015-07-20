package com.coffee.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	static final Logger logger = LoggerFactory.getLogger(LogTest.class);

	public static void main(String args[]) {
		logger.info("logger info.");
		logger.debug("logger debug.");
	}
}
