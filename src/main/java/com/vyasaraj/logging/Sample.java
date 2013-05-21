package com.vyasaraj.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Sample {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Sample.class.getName());
		logger.setUseParentHandlers(false);
		PatternFormatter formatter = new PatternFormatter();
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(formatter);
		logger.addHandler(handler);
		logger.info(" Example of creating custom formatter.");
		logger.warning("A warning message");
		logger.severe(" A severe message.");
	}
}