package DesignPatterns;

import java.util.*;

// Gemeinsames Interface für alle Formen (Shape)
interface Shape {
    // Methode, um die Form zu zeichnen, implementiert von allen Formen
    public void draw(String fillColor);
}

// Konkrete Implementierung der Shape-Schnittstelle: Dreieck
class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        // Zeichne ein Dreieck mit der angegebenen Farbe
        System.out.println("Zeichne Dreieck mit der Farbe " + fillColor);
    }
}

// Konkrete Implementierung der Shape-Schnittstelle: Kreis
class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        // Zeichne einen Kreis mit der angegebenen Farbe
        System.out.println("Zeichne Kreis mit der Farbe " + fillColor);
    }
}

// Composite-Klasse, die mehrere Formen (Shapes) enthalten kann
class Drawing implements Shape {

    // Liste, um alle enthaltenen Formen (Shapes) zu speichern
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        // Iteriere durch alle gespeicherten Formen und zeichne sie
        for (Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    // Methode, um eine neue Form zur Zeichnung hinzuzufügen
    public void add(Shape shape) {
        shapes.add(shape);
    }

    // Methode, um eine Form aus der Zeichnung zu entfernen
    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    // Methode, um alle Formen aus der Zeichnung zu entfernen
    public void clear() {
        System.out.println("Alle Formen aus der Zeichnung entfernen.");
        shapes.clear();
    }
}

// Hauptklasse zur Demonstration des Composite-Musters
public class Composite {

    public static void main(String[] args) {
        // Erstelle einige einzelne Formen
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        // Erstelle eine Zeichnung (Composite), die Formen enthalten kann
        Drawing drawing = new Drawing();
        drawing.add(triangle1); // Füge ein Dreieck hinzu
        drawing.add(triangle2); // Füge ein weiteres Dreieck hinzu
        drawing.add(circle);    // Füge einen Kreis hinzu

        // Zeichne alle Formen in der Zeichnung mit der Farbe Rot
        drawing.draw("Rot");

        // Entferne alle Formen aus der Zeichnung
        drawing.clear();

        // Füge nur bestimmte Formen wieder hinzu
        drawing.add(triangle1); // Füge ein Dreieck hinzu
        drawing.add(circle);    // Füge einen Kreis hinzu

        // Zeichne die neuen Formen mit der Farbe Grün
        drawing.draw("Grün");
    }
}

