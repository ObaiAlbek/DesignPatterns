# 🎨 DesignPatterns

Dieses Repository enthält verschiedene **Design-Pattern-Implementierungen in Java**, die wichtige Entwurfsmuster der objektorientierten Softwareentwicklung demonstrieren.  
Jedes Beispiel zeigt ein konkretes Muster (Pattern) und erklärt dessen Zweck, Aufbau und Vorteile anhand von Code.

---

## 📁 Projektstruktur

```

DesignPatterns/
├── Adapter.java             # Beispiel für das Adapter-Pattern
├── BuilderPattern.java      # Beispiel für das Builder-Pattern
├── Composite.java           # Beispiel für das Composite-Pattern
├── Dekorator.java           # Basis für das Dekorator-Pattern
├── DekoratorKaffe.java      # Beispiel: Kaffee mit Dekorator-Muster
├── Factory_method.java      # Beispiel für das Factory Method Pattern
└── README.md                # Diese Datei

````

---

## 🧠 Lernziele

- Verständnis der **Grundprinzipien von Design Patterns**  
- Anwendung von **objektorientierten Konzepten** (Abstraktion, Vererbung, Polymorphie)  
- Erkennen, wann und warum ein bestimmtes Pattern sinnvoll ist  
- Vergleich verschiedener Entwurfsmuster und deren Einsatzgebiete  

---

## ⚙️ Implementierte Design Patterns

### 🔹 **Adapter Pattern**
Ermöglicht es, zwei inkompatible Klassen miteinander zu verbinden, indem ein Adapter eine gemeinsame Schnittstelle bereitstellt.  
👉 *Beispiel:* Anpassung einer alten API an eine neue Schnittstelle.

**Vorteil:** Wiederverwendung bestehender Klassen ohne Änderung ihres Codes.

---

### 🔹 **Builder Pattern**
Ermöglicht den schrittweisen Aufbau komplexer Objekte, ohne deren interne Struktur offenzulegen.  
👉 *Beispiel:* Erzeugung von Objekten mit vielen optionalen Parametern.

**Vorteil:** Klare Trennung von Objektkonstruktion und Repräsentation.

---

### 🔹 **Composite Pattern**
Erlaubt es, Objekte zu Baumstrukturen zusammenzufassen und einheitlich zu behandeln.  
👉 *Beispiel:* Dateien und Ordner in einem Dateisystem.

**Vorteil:** Vereinfachte Arbeit mit hierarchischen Strukturen.

---

### 🔹 **Decorator Pattern**
Ermöglicht das dynamische Hinzufügen von Funktionen zu Objekten, ohne deren Klasse zu verändern.  
👉 *Beispiel:* `DekoratorKaffe.java` – Hinzufügen von Milch oder Zucker zu einem Kaffeeobjekt.

**Vorteil:** Flexibles Verhalten zur Laufzeit, offene Erweiterung ohne Änderung bestehender Klassen.

---

### 🔹 **Factory Method Pattern**
Definiert eine Schnittstelle zur Objekterstellung, überlässt aber den Subklassen die Entscheidung, welche Klasse instanziiert wird.  
👉 *Beispiel:* Verschiedene Produkttypen mit gemeinsamer Factory-Methode.

**Vorteil:** Erhöhte Flexibilität und bessere Entkopplung von konkreten Implementierungen.

---

## ▶️ Ausführung

Jede Pattern-Klasse kann einzeln kompiliert und getestet werden:

```bash
javac Adapter.java
java Adapter
````

Oder führe das Projekt direkt in einer IDE (z. B. IntelliJ IDEA, Eclipse oder VS Code) aus.

---

## 💡 Beispielausgabe (Decorator Pattern)

```text
Kaffee bestellt.
+ Milch hinzugefügt.
+ Zucker hinzugefügt.
Gesamtpreis: 3.50 €
```

## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)


