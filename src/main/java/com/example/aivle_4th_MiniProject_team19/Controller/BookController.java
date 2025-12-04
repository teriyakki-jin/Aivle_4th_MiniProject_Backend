package com.example.aivle_4th_MiniProject_team19.Controller;

import com.example.aivle_4th_MiniProject_team19.Entity.Book;
import com.example.aivle_4th_MiniProject_team19.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    private List<Book> getBookList() {
        System.out.println("getBookList()");
        return bookRepository.findAll();
    }

    @GetMapping("{bookId}")
    private Book getBook(@PathVariable(name = "bookId") Long bookId) {
        System.out.println("getBook()");
        return bookRepository.findById(bookId).orElse(new Book());
    }
}
