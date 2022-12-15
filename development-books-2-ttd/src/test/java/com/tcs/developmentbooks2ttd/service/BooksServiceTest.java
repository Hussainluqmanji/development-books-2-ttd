package com.tcs.developmentbooks2ttd.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooks2ttd.enums.BooksEnum;
import com.tcs.developmentbooks2ttd.enums.EnumTest;

public class BooksServiceTest {

	@Test
	public void booksShouldGetFiveDevelopmentBooks() {
		BooksService service = new BooksService();
		List<BooksEnum> books = service.getAllBooks();
		assertEquals(5, books.size());
	}

	@Test
	public void booksShouldBeEqualToAvailableDevelopmentBooks() {
		BooksService service = new BooksService();
		List<BooksEnum> books = service.getAllBooks();
		assertEquals(EnumTest.CLEAN_CODE.name(), books.get(0).name());
		assertEquals(EnumTest.THE_CLEAN_CODER.name(), books.get(1).name());
		assertEquals(EnumTest.CLEAN_ARCHITECTURE.name(), books.get(2).name());
		assertEquals(EnumTest.TEST_DRIVEN_DEVELOPMENT.name(), books.get(3).name());
		assertEquals(EnumTest.WORKING_WITH_LEGACY_CODE.name(), books.get(4).name());
	}
}
