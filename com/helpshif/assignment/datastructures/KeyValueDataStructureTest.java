package com.helpshif.assignment.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KeyValueDataStructureTest {

	private KeyValueDataStructure keyValueDS = new KeyValueDataStructure();
	
	/**
	 * testing the insert-retrive functionality
	 * the retrive value should be matched as expected
	 */
	@Test
	public void testInsertAndRetrive() {
		
		keyValueDS.insert(100, "helpshift");
		keyValueDS.insert(300, "google");
		
		assertEquals("helpshift", keyValueDS.retrive(100), "Failed to retrive correct value");
		assertEquals("google", keyValueDS.retrive(300), "Failed to retrive correct value");
		
	}

}
