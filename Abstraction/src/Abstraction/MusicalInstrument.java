package abstraction;

/**
 * Represents an abstract MusicalInstrument with a name. Provides an abstract
 * method to play the instrument.
 * 
 * @author C Sandeep Aithal
 */
abstract class MusicalInstrument {
	String name;

	/**
	 * Constructs a MusicalInstrument object with the specified name.
	 */
	public MusicalInstrument(String name) {
		this.name = name;
	}

	/**
	 * Abstract method to play the instrument.
	 */
	public abstract void play();
}

/**
 * Represents a Guitar, which is a type of MusicalInstrument. Overrides the play
 * method to provide specific behavior for a guitar.
 */
class Guitar extends MusicalInstrument {

	/**
	 * Constructs a Guitar object with the specified name.
	 */
	public Guitar(String name) {
		super(name);
	}

	/**
	 *Prints a message indicating that the guitar is being
	 * played.
	 */
	@Override
	public void play() {
		System.out.println("Playing the " + name + " guitar");
	}
}
