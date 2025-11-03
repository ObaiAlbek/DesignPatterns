package DesignPatterns;

/* - Erzeugung neuer Objekte nicht im Konstruktor einer Klasse durchführen, sondern durch eine statische Methode
 * 
 * Verwendung Eine Fabrikmethode: 
 *  - erzeugt bei jedem Aufruf neue Objekte
 *  - unterbindet den direkten Zugriff auf die Konstruktoren einer Klasse
 * 
 * Eigenschaften: 
 *  - einem privaten Konstruktor
 *  - einer öffentlichen statischen Methode die den privaten Konstruktor nutzt
 * 
 * 
 */

public class Factory_method {
	
	// Privater Konstruktor: Verhindert Instanziierung
	private Factory_method() {
	}
	
	// public statische Methode zum Erstellen neuer Objekt
	public static Car createCar(String type) {
		switch (type) {
		case "Sedan":
			return new SedanCar();
		case "Small":
			return new SmallCar();
		case "Sport":
			return new SportCar();
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {

		Car sedan = Factory_method.createCar("Sedan");
		Car small = Factory_method.createCar("Small");
		Car sport = Factory_method.createCar("Sport");

		System.out.println("Price of Sedan Car: $" + sedan.getPrice());
		System.out.println("Price of Small Car: $" + small.getPrice());
		System.out.println("Price of Sport Car: $" + sport.getPrice());

	}

}

// oder Interface
abstract class Car{
	public abstract int getPrice();
}

class SedanCar extends Car {
    @Override
    public int getPrice() {
        return 100000;
    }
}

class SmallCar extends Car {
    @Override
    public int getPrice() {
        return 50000;
    }
}

class SportCar extends Car {
    @Override
    public int getPrice() {
        return 250000;
    }
}

