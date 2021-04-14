package com.example.japmanytomanyuseprimarykey.repository;

import com.example.japmanytomanyuseprimarykey.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRespository extends JpaRepository<Publisher,Integer> {
}
