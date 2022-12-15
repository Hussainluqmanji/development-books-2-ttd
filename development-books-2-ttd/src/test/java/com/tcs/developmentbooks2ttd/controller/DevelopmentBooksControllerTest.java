package com.tcs.developmentbooks2ttd.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooks2ttd.enums.BooksEnum;
import com.tcs.developmentbooks2ttd.service.BooksService;

public class DevelopmentBooksControllerTest {

	@Test
	public void getAllBooks() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		controller.service = new BooksService();
		List<BooksEnum> books = controller.getAllAvailableBooksName();
		assertEquals(5, books.size());
	}
}
