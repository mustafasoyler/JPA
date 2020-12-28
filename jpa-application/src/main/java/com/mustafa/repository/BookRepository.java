package com.mustafa.repository;

import com.mustafa.jpaFactory.Impl.jpaFactoryImpl;
import com.mustafa.model.Book;

public interface BookRepository {
    com.mustafa.jpaFactory.Impl.jpaFactory jpaFactory =new jpaFactoryImpl();

    void save(Book book);
    void  delete(Book book);
    Book find(int id);
    Book update(Book book);
}
