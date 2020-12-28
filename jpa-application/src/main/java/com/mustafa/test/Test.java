package com.mustafa.test;

import com.mustafa.model.Book;
import com.mustafa.repository.BookRepository;
import com.mustafa.repository.Impl.BookRepositoryImpl;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        BookRepository bookRepository =new BookRepositoryImpl();

        Book book1=new Book(100,"Dönüşüm",200,"Dram","Mustafa",createCustomDate(18,02,1998));
        Book book2=new Book(101,"YüzüklerinEfendisi",300,"BilimKurgu","Ali",createCustomDate(18,02,1998));

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
    public static Date createCustomDate(int day, int month, int year){
        Calendar calendar =Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.YEAR,year);

        return calendar.getTime();

    }
}
