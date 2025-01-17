package org.example.model.fill;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

public interface FillBehavior {
    void draw(Graphics2D g);

    void setColor(Color c);

    Color getColor();

    void setShape(RectangularShape s);

    RectangularShape getShape();

    FillBehavior clone();
}