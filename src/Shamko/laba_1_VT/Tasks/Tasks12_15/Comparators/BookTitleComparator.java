package Shamko.laba_1_VT.Tasks.Tasks12_15.Comparators;

import Shamko.laba_1_VT.Tasks.Tasks12_15.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book_1, Book book_2) {
        return book_1.getTitle().compareTo(book_2.getTitle());
    }
}