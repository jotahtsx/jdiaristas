package com.jotahdev.backend.core.enums;

public enum JIcon {
    
    TWF_CLEANING_1("twf-cleaning-1"),
    TWF_CLEANING_2("twf-cleaning-2"),
    TWF_CLEANING_3("twf-cleaning-3");

    private String title;

    private JIcon(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
