package main;
import main.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Storage {
    private static int currentId = 1;
    private static HashMap<Integer, Book> books = new HashMap<>();

    public static List<Book> getAllBooks() {
        List<Book> booksList = new ArrayList<>();
        booksList.addAll(books.values());
        return booksList;
    }


    public static int addBooks(Book book) {
        int id = currentId += 1;
        book.setId(id);
        books.put(id, book);
        return id;
    }


    public static Book getBook(int bookId) {
        if (books.containsKey(bookId)) {
            return books.get(bookId);
        }
        return null;
    }

}
