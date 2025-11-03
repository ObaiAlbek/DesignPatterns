package DesignPatterns;

interface Kaffe{
	
	String getBeschreibung();
	
	double getPreis();
}

class EinfacherKaffee implements Kaffe{

	@Override
	public String getBeschreibung() {
		return "Kaffe ";
	}

	@Override
	public double getPreis() {
		return 2.5;
	}
	
}

abstract class KaffeDekorator implements Kaffe {
	protected Kaffe kaffe;
	KaffeDekorator(Kaffe kaffe){
		this.kaffe = kaffe;
	}
	@Override
	public String getBeschreibung() {
		return kaffe.getBeschreibung();
	}

	@Override
	public double getPreis() {
		return kaffe.getPreis();
	}
}

class Milch extends KaffeDekorator{

	Milch(Kaffe kaffe) {
		super(kaffe);
	}
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung() + " + ,Milch";
	}

	@Override
	public double getPreis() {
		return super.getPreis() + 1.2;
	}
}

public class DekoratorKaffe {
	
	public static void main(String[] args) {
		Kaffe normaleKaffe = new EinfacherKaffee();
		Kaffe kaffeMitMilch = new Milch(normaleKaffe);
		System.out.println(kaffeMitMilch.getBeschreibung());
	}
}
