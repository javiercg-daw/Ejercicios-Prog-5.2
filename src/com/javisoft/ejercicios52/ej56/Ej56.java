package com.javisoft.ejercicios52.ej56;


public class Ej56 {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(8, 8);
        Rectangle oblong = new Rectangle(12, 8);
        Rectangle niceRectangle = new Rectangle(420, 69);
        Rectangle[] rectArr = {square, oblong, niceRectangle};

        for (Rectangle r : rectArr) {
            System.out.println(r.toString());
        }

    }
}
