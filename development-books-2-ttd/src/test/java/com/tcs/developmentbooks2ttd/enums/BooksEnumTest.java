package com.tcs.developmentbooks2ttd.enums;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BooksEnumTest {

	@Test
	public void booksEnumShouldContainFiveDevelopmentBooks() {
		assertEquals(5, BooksEnum.values().length);
	}

	@Test
	public void booksShouldHaveAllTheDetails() {
		BooksEnum cleanCodeBook = BooksEnum.CLEAN_CODE;
		assertEquals(EnumTest.CLEAN_CODE.getId(), cleanCodeBook.getId());
		assertEquals(EnumTest.CLEAN_CODE.getAuthor(), cleanCodeBook.getAuthor());
		assertEquals(EnumTest.CLEAN_CODE.getTitle(), cleanCodeBook.getTitle());
		assertEquals(EnumTest.CLEAN_CODE.getYear(), cleanCodeBook.getYear());
		assertEquals(EnumTest.CLEAN_CODE.getPrice(), cleanCodeBook.getPrice(), 0.0);
	}
}
