package DesignPatterns;

public class BuilderPattern {
	// Private Felder
    private String teig;
    private String soße;
    private String käse;
    private String topping;

    // Private Konstruktor, nur der Builder kann diesen aufrufen
    private BuilderPattern(Builder builder) {
        this.teig = builder.teig;
        this.soße = builder.soße;
        this.käse = builder.käse;
        this.topping = builder.topping;
    }

    // Statische innere Klasse Builder
    public static class Builder {
        // Dieselben Felder wie in der äußeren Klasse
        private String teig;
        private String soße;
        private String käse;
        private String topping;

        // Methoden für das Setzen der Felder, die den Builder zurückgeben
        public Builder teig(String teig) {
            this.teig = teig;
            return this;
        }

        public Builder soße(String soße) {
            this.soße = soße;
            return this;
        }

        public Builder käse(String käse) {
            this.käse = käse;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        // Die build-Methode erstellt das Pizza-Objekt
        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    // Methode, um die Pizza anzuzeigen
    public void anzeigen() {
        System.out.println("Pizza mit " + teig + " Teig, " + soße + " Soße, " +
                käse + " Käse und " + (topping != null ? topping : "ohne") + " Topping.");
    }
    
    public static void main(String[] args) {
        // Erstellen einer Pizza mit allen Zutaten
    	BuilderPattern pizza1 = new BuilderPattern.Builder()
            .teig("Dünn")
            .soße("Tomaten")
            .käse("Mozzarella")
            .topping("Salami")
            .build();

        // Erstellen einer Pizza ohne Topping
    	BuilderPattern pizza2 = new BuilderPattern.Builder()
            .teig("Dick")
            .soße("Tomaten")
            .build();

        pizza1.anzeigen();  // Ausgabe: Pizza mit Dünn Teig, Tomaten Soße, Mozzarella Käse und Salami Topping.
        pizza2.anzeigen();  // Ausgabe: Pizza mit Dick Teig, Tomaten Soße, Cheddar Käse und ohne Topping.
    }
}
