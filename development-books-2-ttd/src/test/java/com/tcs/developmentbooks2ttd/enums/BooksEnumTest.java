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
		assertEquals(BooksEnum.CLEAN_CODE.getId(), cleanCodeBook.getId());
		assertEquals(BooksEnum.CLEAN_CODE.getAuthor(), cleanCodeBook.getAuthor());
		assertEquals(BooksEnum.CLEAN_CODE.getTitle(), cleanCodeBook.getTitle());
		assertEquals(BooksEnum.CLEAN_CODE.getYear(), cleanCodeBook.getYear());
		assertEquals(BooksEnum.CLEAN_CODE.getPrice(), cleanCodeBook.getPrice(), 0.0);
	}
}
