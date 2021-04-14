package com.example.japmanytomanyuseprimarykey.controller;

import com.example.japmanytomanyuseprimarykey.model.Book;
import com.example.japmanytomanyuseprimarykey.repository.BookPublisherRespository;
import com.example.japmanytomanyuseprimarykey.repository.BookRepository;
import com.example.japmanytomanyuseprimarykey.repository.PublisherRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository;
    PublisherRespository publisherRepositor;
    BookPublisherRespository bookPublisherRepository;
    @RequestMapping("/")
    public String index(Model model){
        List<Book> books = (List<Book>) bookRepository.findAll();
        model.addAttribute("books",books);
        return "index";
    }
    @RequestMapping(value = "add")
    public String addBook(Model model){
        model.addAttribute("book",new Book());
        return "add";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Book book){
        bookRepository.save(book);
        return "redirect:/";
    }
}
