package Abstraction;

abstract class MusicalInstrument {
String name;
public  MusicalInstrument(String name) {
	this.name=name;
}
public abstract void play();
}
class guitar extends MusicalInstrument{

	public guitar(String name) {
		super(name);
		
	}

	@Override
	public void play() {
		System.out.println("Playing the "+name +" guitar");
	}
	
}