package com.tcs.developmentbooks2ttd.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tcs.developmentbooks2ttd.enums.BooksEnum;
import com.tcs.developmentbooks2ttd.model.Books;
import com.tcs.developmentbooks2ttd.model.BooksInput;

@Service
public class BooksService {

	private static final double SINGLE_BOOK_PRICE = 50.0;;

	public List<Books> getAllBooks() {
		return Arrays.stream(BooksEnum.values()).map(bookEnum -> new Books(bookEnum.getId(), bookEnum.getTitle(),
				bookEnum.getAuthor(), bookEnum.getYear(), bookEnum.getPrice())).collect(Collectors.toList());
	}

	public double buyBooks(List<BooksInput> booksBought) {
		return booksBought.stream().mapToInt(book -> book.getQuantity()).sum() * SINGLE_BOOK_PRICE;
	}
}
