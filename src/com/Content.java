package com;

public class Content extends Book {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    @Override
    public String showInfo() {
        return "Content: " + content;
    }
}
