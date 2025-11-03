package DesignPatterns;

//Gemeinsame Schnittstelle
interface Kaffee {
	
 String beschreibung();
 double preis();
}

//Basisobjekt
class EinfacherKaffee implements Kaffee {
    @Override
    public String beschreibung() {
        return "Einfacher Kaffee";
    }

    @Override
    public double preis() {
        return 2.00; // Basispreis
    }
}

//Abstrakter Dekorator
abstract class KaffeeDekorator implements Kaffee {
    protected Kaffee kaffee;

    public KaffeeDekorator(Kaffee kaffee) {
        this.kaffee = kaffee;
    }

    @Override
    public String beschreibung() {
        return kaffee.beschreibung();
    }

    @Override
    public double preis() {
        return kaffee.preis();
    }
}

//Milch-Dekorator
class Milch extends KaffeeDekorator {
    public Milch(Kaffee kaffee) {
        super(kaffee);
    }

    @Override
    public String beschreibung() {
        return kaffee.beschreibung() + ", Milch";
    }

    @Override
    public double preis() {
        return kaffee.preis() + 0.50; // Preis für Milch hinzufügen
    }
}

//Zucker-Dekorator
class Zucker extends KaffeeDekorator {
    public Zucker(Kaffee kaffee) {
        super(kaffee);
    }

    @Override
    public String beschreibung() {
        return kaffee.beschreibung() + ", Zucker";
    }

    @Override
    public double preis() {
        return kaffee.preis() + 0.20; // Preis für Zucker hinzufügen
    }
}
public class Dekorator {

	 public static void main(String[] args) {
	        // Basis-Kaffee
	        Kaffee kaffee = new EinfacherKaffee();
	        System.out.println(kaffee.beschreibung() + " kostet: " + kaffee.preis() + "€");

	        // Kaffee mit Milch
	        kaffee = new Milch(kaffee);
	        System.out.println(kaffee.beschreibung() + " kostet: " + kaffee.preis() + "€");

	        // Kaffee mit Milch und Zucker
	        kaffee = new Zucker(kaffee);
	        System.out.println(kaffee.beschreibung() + " kostet: " + kaffee.preis() + "€");
	    }

}
