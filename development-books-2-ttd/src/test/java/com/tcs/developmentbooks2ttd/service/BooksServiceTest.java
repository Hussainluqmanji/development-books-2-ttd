package com.tcs.developmentbooks2ttd.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tcs.developmentbooks2ttd.enums.BooksEnum;
import com.tcs.developmentbooks2ttd.enums.EnumTest;
import com.tcs.developmentbooks2ttd.model.Books;
import com.tcs.developmentbooks2ttd.model.BooksInput;
import com.tcs.developmentbooks2ttd.model.PriceSummary;

public class BooksServiceTest {

	BooksService service;

	@BeforeEach
	public void setUp() {
		service = new BooksService();
	}

	@Test
	public void booksShouldGetFiveDevelopmentBooks() {
		List<Books> books = service.getAllBooks();
		assertEquals(5, books.size());
	}

	@Test
	public void booksShouldBeEqualToAvailableDevelopmentBooks() {
		List<Books> books = service.getAllBooks();
		assertEquals(EnumTest.CLEAN_CODE.getTitle(), books.get(0).getTitle());
		assertEquals(EnumTest.THE_CLEAN_CODER.getTitle(), books.get(1).getTitle());
		assertEquals(EnumTest.CLEAN_ARCHITECTURE.getTitle(), books.get(2).getTitle());
		assertEquals(EnumTest.TEST_DRIVEN_DEVELOPMENT.getTitle(), books.get(3).getTitle());
		assertEquals(EnumTest.WORKING_WITH_LEGACY_CODE.getTitle(), books.get(4).getTitle());
	}

	@Test
	public void booksShouldHaveAllTheDetails() {
		List<Books> books = service.getAllBooks();
		assertEquals(BooksEnum.CLEAN_CODE.getId(), books.get(0).getId());
		assertEquals(BooksEnum.CLEAN_CODE.getAuthor(), books.get(0).getAuthor());
		assertEquals(BooksEnum.CLEAN_CODE.getTitle(), books.get(0).getTitle());
		assertEquals(BooksEnum.CLEAN_CODE.getYear(), books.get(0).getYear());
		assertEquals(BooksEnum.CLEAN_CODE.getPrice(), books.get(0).getPrice(), 0.0);
	}
	
    @Test
    public void buyBookShouldReturnPrice() {
        List<BooksInput> books = new ArrayList<BooksInput>();
        books.add(new BooksInput(1, 1));
        PriceSummary result = service.calculateBooksCostWithDiscount(books);
        assertEquals(50.0, result.getFinalPrice(), 0.0);
    }
    
    @Test
    public void buyTwoDiffBookAndGetDiscount() {
        List<BooksInput> books = new ArrayList<BooksInput>();
        books.add(new BooksInput(1, 1));
        books.add(new BooksInput(2, 1));
        PriceSummary result = service.calculateBooksCostWithDiscount(books);
        assertEquals(95.0, result.getFinalPrice(), 0.0);
    }
    
    @Test
    public void buyThreeDiffBookAndGetDiscount() {
        List<BooksInput> books = new ArrayList<BooksInput>();
        books.add(new BooksInput(1, 1));
        books.add(new BooksInput(2, 1));
        books.add(new BooksInput(3, 1));
        PriceSummary result = service.calculateBooksCostWithDiscount(books);
        assertEquals(135.0, result.getFinalPrice(), 0.0);
    }
    
    @Test
    public void buyFourDiffBookAndGetDiscount() {
        List<BooksInput> books = new ArrayList<BooksInput>();
        books.add(new BooksInput(1, 1));
        books.add(new BooksInput(2, 1));
        books.add(new BooksInput(3, 1));
        books.add(new BooksInput(4, 1));
        PriceSummary result = service.calculateBooksCostWithDiscount(books);
        assertEquals(160.0, result.getFinalPrice(), 0.0);
    }
}
