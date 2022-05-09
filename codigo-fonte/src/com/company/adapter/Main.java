package com.company.adapter;

public class Main {

    public static void main(String[] args) {

        String text = "Vamos.testar.se.o.adapter.funcionou.";
        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvFormattable = new CsvAdapterImpl(csvFormatter);
        System.out.println(csvFormattable.formatText(text));
    }
}
