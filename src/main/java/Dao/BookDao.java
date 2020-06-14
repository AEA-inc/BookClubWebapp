package Dao;

import Model.Book;

import java.util.HashMap;

public class BookDao {
    HashMap<Integer, Book> bookHashMap = new HashMap();
    public void addBook(Book book){

        bookHashMap.put(book.getId(),book);
    }


}
