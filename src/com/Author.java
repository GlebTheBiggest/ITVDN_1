package com;

public class Author extends Book {
    private String nameOfAuthor;

    public Author(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    @Override
    public String showInfo() {
        return "Author: " + nameOfAuthor;
    }
}
