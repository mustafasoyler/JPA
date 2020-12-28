package com.mustafa.repository.Impl;

import com.mustafa.jpaFactory.Impl.jpaFactory;
import com.mustafa.jpaFactory.Impl.jpaFactoryImpl;
import com.mustafa.model.Book;
import com.mustafa.repository.BookRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookRepositoryImpl implements BookRepository {
    EntityManager entityManager = jpaFactory.getEntityManager();
    EntityTransaction transaction = jpaFactory.getEntityTransaction();


    public void save(Book book) {
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();

    }

    public void delete(Book book) {
        transaction.begin();

       this.entityManager.remove(book);
        transaction.commit();

    }

    public Book find(int id) {
        Book book =this.entityManager.find(Book.class,id);
        if (book !=null){
            return book;
        }
        return null;
    }

    public Book update(Book book) {
        Book updateBook =this.entityManager.merge(book);

        return updateBook;
    }
}
