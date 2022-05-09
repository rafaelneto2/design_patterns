package com.company.adapter;

// CLIENT
public class NewLineFormatter implements TextFormattable {

    @Override
    public String formatText(String text) {
        return text.replace(".", "\n");
    }
}
