package com.vyasaraj.logging;

import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.junit.Assert;
import org.junit.Test;

public class PatternFormatterTest {
	PatternFormatter patternFormatter = new PatternFormatter();

	@Test
	public void testSetTimeFormat() {
		String expected = "dd-MMM-yyy; HH:mm:ss";
		String result = patternFormatter.getTimeFormat();
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testSetLogPattern() {
		String expected = "[{0} - {1}] {2}: {3} \n";
		String result = patternFormatter.getLogPattern();
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFormatterWhenLevelIsSetTOWarning() {
		LogRecord record = new LogRecord(Level.WARNING, "A warning message");
		record.setMillis(1111);
		String expected = "[null - WARNING] 01-Jan-1970; 05:30:01: A warning message \n";
		String result = patternFormatter.format(record);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFormatterWhenLoggerNameIsSet() {
		LogRecord record = new LogRecord(Level.INFO, "A warning message");
		record.setMillis(1111);
		record.setLoggerName("com.vyasaraj.logging");
		String expected = "[com.vyasaraj.logging - INFO] 01-Jan-1970; 05:30:01: A warning message \n";
		String result = patternFormatter.format(record);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFormatterWhenLevelIsSetToFine() {
		LogRecord record = new LogRecord(Level.FINE, "A fine message");
		record.setMillis(123311313);
		record.setLoggerName("com.vyasaraj.logging");
		String expected = "[com.vyasaraj.logging - FINE] 02-Jan-1970; 15:45:11: A fine message \n";
		String result = patternFormatter.format(record);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFormatterWhenLevelIsSetToSevere() {
		LogRecord record = new LogRecord(Level.SEVERE, "A fine message");
		record.setMillis(111121);
		record.setLoggerName("com.vyasaraj.logging");
		String expected = "[com.vyasaraj.logging - SEVERE] 01-Jan-1970; 05:31:51: A fine message \n";
		String result = patternFormatter.format(record);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void testFormatterWhenLevelIsSetToFinist() {
		LogRecord record = new LogRecord(Level.FINEST, "A fine message");
		record.setMillis(1121212);
		record.setLoggerName("com.vyasaraj.logging");
		String expected = "[com.vyasaraj.logging - FINEST] 01-Jan-1970; 05:48:41: A fine message \n";
		String result = patternFormatter.format(record);
		Assert.assertEquals(expected, result);
	}

}
