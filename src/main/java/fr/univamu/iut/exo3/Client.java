package fr.univamu.iut.exo3;

import fr.univamu.iut.exo3.components.Condensator;
import fr.univamu.iut.exo3.components.Diode;
import fr.univamu.iut.exo3.components.Resistor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component diode = new Diode();
		Component resistor = new Resistor();
		Component condensator = new Condensator();
		
		Circuit circuit = new Circuit(diode, resistor, condensator);
		
		
		Component diode2 = new Diode();
		Component resistor2 = new Resistor();
		Component condensator2 = new Condensator();
		
		Circuit circuit2 = new Circuit(diode2, resistor2, condensator2);
		
		circuit.addComponent(circuit2);
		
		circuit.execute();
	}

}
