package com.tcs.developmentbooks2ttd.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.tcs.developmentbooks2ttd.model.Books;
import com.tcs.developmentbooks2ttd.model.BooksInput;
import com.tcs.developmentbooks2ttd.service.BooksService;

public class DevelopmentBooksControllerTest {

	@Test
	public void getAllBooks() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		controller.service = new BooksService();
		List<Books> books = controller.getAllAvailableBooksName();
		assertEquals(5, books.size());
	}

	@Test
	public void buyBookShouldReturnPrice() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		controller.service = new BooksService();
        List<BooksInput> books = new ArrayList<BooksInput>();
        books.add(new BooksInput(1, 1));
        double result = controller.buyBooks(books);
		assertEquals(50, result, 0.0);
	}
}
