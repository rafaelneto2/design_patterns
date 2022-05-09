package com.company.adapter;

// CLIENT
public class CsvFormatter implements CsvFormattable {

    @Override
    public String formatCsvText(String text) {
        return text.replace(".", ",");
    }
}
