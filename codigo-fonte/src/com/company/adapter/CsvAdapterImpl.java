package com.company.adapter;

// ADAPTER --> Realiza a adaptação do ADAPTEE para o TARGET
public class CsvAdapterImpl implements TextFormattable {

    CsvFormattable csvFormattable;

    public CsvAdapterImpl(CsvFormattable csvFormatter) {
        this.csvFormattable = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return csvFormattable.formatCsvText(text);
    }
}
