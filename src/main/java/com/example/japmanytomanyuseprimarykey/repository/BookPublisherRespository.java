package com.example.japmanytomanyuseprimarykey.repository;

import com.example.japmanytomanyuseprimarykey.model.Book;
import com.example.japmanytomanyuseprimarykey.model.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRespository extends JpaRepository<BookPublisher,Integer> {

}
