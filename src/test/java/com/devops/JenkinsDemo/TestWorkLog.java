package com.devops.JenkinsDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {
	
	Working w1 = new Working();
	
	@Test
	public void testAddToLog1(){
		
		assertEquals("Added Log For Remo", w1.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2(){
		
		assertEquals("Added Log For Prasanth", w1.addToLog("Prasanth"));
	}
	
	@Test
	public void testAddToLogins1(){
		
		assertEquals("Added LoginLog For Remo", w1.addLogins("Remo"));
	}
	
	@Test
	public void testAddToLogins2(){
		
		assertEquals("Added LoginLog For Prasanth", w1.addLogins("Prasanth"));
	}
	
	
}
