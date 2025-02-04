package abstraction;

/**
 * A test class to demonstrate the use of the MusicalInstrument and Guitar classes with abstraction.
 * 
 * This class creates an instance of a Guitar and plays it using the abstract MusicalInstrument reference.
 * 
 * @author C Sandeep Aithal
 */
public class MusicalInstrumentTest {
    public static void main(String[] args) {
        // Create a Guitar object with the specified name and assign it to a MusicalInstrument reference
        MusicalInstrument m1 = new Guitar("Fender");
        
        // Play the musical instrument
		m1.play();
	}
}
