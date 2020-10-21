package com.xl.java.week6;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.ToString;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author 1
 * @Date 2020/10/15
 **/
public class TestBook {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id("20029222")
                .name("ala")
                .phone(Phone.builder()
                        .brand("iPhone")
                        .price(10000)
                        .build())
                .build();
        Book[] books = new Book[]{
                Book.builder().bookName("Java").build(),
                Book.builder().bookName("JavaWeb").build(),
                Book.builder().bookName("JavaScript").build()
        };
        student.setBooks(books);
        for (Book book : student.getBooks()) {
            System.out.println(book);
        }
        //--------------------------------------
//        List<Book> list = new ArrayList<Book>(Arrays.asList(student.getBooks()));
//        list.forEach( books -> System.out.println(books.getBookName()));

    }
}
