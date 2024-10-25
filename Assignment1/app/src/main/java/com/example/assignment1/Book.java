package com.example.assignment1;

import java.io.Serializable;

public class Book implements Serializable {
    // The Book object will hold the details related to each book
    private String title;
    private String author;
    private String genre;
    private String pub_year;
    private String read_status;

    //All values are needed to make a new Book
    public Book(String title, String author, String genre, String pub_year, String read_status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pub_year = pub_year;
        this.read_status = read_status;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPub_year() {
        return pub_year;
    }

    public String getRead_status() {
        return read_status;
    }

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPub_year(String pub_year) {
        this.pub_year = pub_year;
    }

    public void setRead_status(String read_status) {
        this.read_status = read_status;
    }
}
