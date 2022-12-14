package com.tcs.developmentbooks2ttd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.developmentbooks2ttd.model.Books;
import com.tcs.developmentbooks2ttd.model.BooksInput;
import com.tcs.developmentbooks2ttd.model.PriceSummary;
import com.tcs.developmentbooks2ttd.service.BooksService;

@RestController
public class DevelopmentBooksController {

	@Autowired
	BooksService service;

	@GetMapping("/getAllBooks")
	public List<Books> getAllAvailableBooksName() {
		return service.getAllBooks();
	}
	
    @PostMapping("/buyBooks")
    public PriceSummary buyBooks(@RequestBody List<BooksInput> booksBought) {
        return service.calculateBooksCostWithDiscount(booksBought);
    }
}
