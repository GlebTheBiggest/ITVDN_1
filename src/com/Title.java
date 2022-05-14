package com;

public class Title extends Book {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    @Override
    public String showInfo() {
        return "Title: " + title;
    }
}
