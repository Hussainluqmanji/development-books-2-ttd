package com.tcs.developmentbooks2ttd.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.developmentbooks2ttd.enums.BooksEnum;

@Service
public class BooksService {

	public List<BooksEnum> getAllBooks() {
		return Arrays.asList(BooksEnum.values());
	}
}
