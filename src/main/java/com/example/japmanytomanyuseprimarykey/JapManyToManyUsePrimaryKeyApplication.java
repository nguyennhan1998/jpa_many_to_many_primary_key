package com.example.japmanytomanyuseprimarykey;

import com.example.japmanytomanyuseprimarykey.model.Book;
import com.example.japmanytomanyuseprimarykey.model.BookPublisher;
import com.example.japmanytomanyuseprimarykey.model.Publisher;
import com.example.japmanytomanyuseprimarykey.repository.BookPublisherRespository;
import com.example.japmanytomanyuseprimarykey.repository.BookRepository;
import com.example.japmanytomanyuseprimarykey.repository.PublisherRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JapManyToManyUsePrimaryKeyApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    PublisherRespository publisherRespository;
    @Autowired
    BookPublisherRespository bookPublisherRespository;

    public static void main(String[] args) {
        SpringApplication.run(JapManyToManyUsePrimaryKeyApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception{
        Book book1 = new Book("SpringBoot");
        Book book2 = new Book("javacore");
        bookRepository.saveAll(Arrays.asList(book1,book2));
        Publisher publisher1 = new Publisher("FptAptech");
        Publisher publisher2 = new Publisher("NXB-TG");
        publisherRespository.saveAll(Arrays.asList(publisher1,publisher2));
        BookPublisher bookPublisher1 = new BookPublisher(book1,publisher1, new Date());
        BookPublisher bookPublisher2 = new BookPublisher(book1,publisher2, new Date());
        bookPublisherRespository.saveAll(Arrays.asList(bookPublisher1,bookPublisher2));


    }
}
