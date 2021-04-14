package com.example.japmanytomanyuseprimarykey.repository;

import com.example.japmanytomanyuseprimarykey.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Integer> {


}
