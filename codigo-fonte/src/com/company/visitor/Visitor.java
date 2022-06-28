package com.company.visitor;

public interface Visitor {

    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);

}
