package com.book.store.comparator;

import java.util.Comparator;

import com.book.store.entity.Book;

public class SortByAuthorName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.getAuthorName().compareTo(o1.getAuthorName());
	}

}

