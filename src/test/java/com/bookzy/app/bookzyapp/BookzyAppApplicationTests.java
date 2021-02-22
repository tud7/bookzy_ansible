package com.bookzy.app.bookzyapp;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookzyAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAlwaysTrue() {
		assertTrue(BookzyAppApplication.alwaysTrue());
	}

}
