package com.book.store.comparator;

import java.util.Comparator;

import com.book.store.entity.Book;

public class SortByPriceHighToLow implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getPrice()-o2.getPrice();
	}

}
