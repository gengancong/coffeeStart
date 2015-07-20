package com.coffee.study.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	static final Logger logger = LoggerFactory.getLogger(LogTest.class);

	public static void main(String args[]) {

		logger.trace("logger trace.");
		logger.debug("logger debug.");
		logger.info("logger info.");
		logger.warn("logger warn.");
		logger.error("logger error.");
	}
}
