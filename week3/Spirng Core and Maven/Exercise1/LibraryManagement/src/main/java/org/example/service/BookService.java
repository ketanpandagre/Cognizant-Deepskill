package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void printBook() {
        System.out.println("Book name is SpringBoot from Bookservice class");
    }
}
