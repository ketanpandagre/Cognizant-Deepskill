package org.example;

import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        BookRepository bookRepository=context.getBean("bookRepository",BookRepository.class);
        bookRepository.getBookName();
        bookService.printBook();
    }
}