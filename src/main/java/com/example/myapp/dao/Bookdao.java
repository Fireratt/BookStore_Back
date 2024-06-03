package com.example.myapp.dao; 

import org.springframework.stereotype.* ; 
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate ; 
import com.example.myapp.BookList;
import com.example.myapp.data.Book;

public interface Bookdao {

    Book[] findByPage(int page) ; 

    Book findByBookId(int Book_Id) ; 

    Book save(Book result) ; 

    Book[] SearchByName(String name) ;

    int modifyBook(int book_id , String name , String author , int Storage) ;
    
    int modifyCover(int book_id , String cover) ; 

    int addBook(String name ,double price ,String author, String description , int storage , String isbn , String cover) ; 

    int deleteBook(int book_id) ; 
}   