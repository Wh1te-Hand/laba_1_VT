package Shamko.laba_1_VT.Tasks.Tasks12_15.Comparators;

import Shamko.laba_1_VT.Tasks.Tasks12_15.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book_1, Book book_2){
        return Integer.compare(book_1.getPrice(), book_2.getPrice());
    }
}