package com.tcs.developmentbooks2ttd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Books {

	private int id;

	private String title;

	private String author;

	private int year;

	private double price;
}
