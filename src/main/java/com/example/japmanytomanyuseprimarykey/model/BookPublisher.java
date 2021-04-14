package com.example.japmanytomanyuseprimarykey.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Getter
@Setter
public class BookPublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "publisher_id")

    private Publisher publisher;
    private Date publishDate;

    public BookPublisher(Book book,Publisher publisher,Date publisherDate) {
        this.book = book;
        this.publisher = publisher;
        this.publishDate = publisherDate;
    }
}

