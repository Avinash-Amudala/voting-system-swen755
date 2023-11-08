package com.yourdomain.votingsystem.dto;

public class ChoiceDto {
    private Long id;
    private String text;

    // Getters
    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }
}

