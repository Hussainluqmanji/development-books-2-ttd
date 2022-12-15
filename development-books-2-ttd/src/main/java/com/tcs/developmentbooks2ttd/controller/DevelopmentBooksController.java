package com.tcs.developmentbooks2ttd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.developmentbooks2ttd.enums.BooksEnum;
import com.tcs.developmentbooks2ttd.service.BooksService;

@RestController
public class DevelopmentBooksController {

	@Autowired
	BooksService service;

	@GetMapping("/getAllBooks")
	public List<BooksEnum> getAllAvailableBooksName() {
		return service.getAllBooks();
	}
}
