package com.shubhamfirst.bookManagenment;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class BookControler {
    Map<Integer,Book> data = new HashMap<>();

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book){
        data.put(book.getBookId(),book);
        return "Book added successfully";
    }

    @GetMapping("/find-book")
    public Book getBook(@RequestParam int id){
        return data.get(id);
    }

    @GetMapping("/find-book/{id}")
    public Book getBookByParams(@PathVariable int id){
        return data.get(id);
    }

    @PutMapping("update-book/{bookId}")
    public String updateData(@PathVariable int bookId,@RequestParam(required = false) String title,@RequestParam int pages,@RequestParam String author){
        Book book = data.get(bookId);
        if(Objects.nonNull(title)){
            book.setTittle(title);
        }
        book.setPages(pages);
        book.setAuthor(author);
        return "Task Done";
    }

    @DeleteMapping("remove-book/{id}")
    public String deleteBook(@PathVariable int id){
        data.remove(id);
        return "Book deleted";
    }
}
