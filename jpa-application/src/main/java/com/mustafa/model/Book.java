package com.mustafa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Book {
    @Id
    private int bookId;
    private String bookName;
    private int pageCount;
    private String topic;
    private String authorName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date publisherDate;

    public Book(){

    }

    public Book(int bookId, String bookName, int pageCount, String topic, String authorName, Date publisherDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.topic = topic;
        this.authorName = authorName;
        this.publisherDate = publisherDate;
    }



    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublisherDate() {
        return publisherDate;
    }

    public void setPublisherDate(Date publisherDate) {
        this.publisherDate = publisherDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", pageCount=" + pageCount +
                ", topic='" + topic + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisherDate=" + publisherDate +
                '}';
    }
}
