package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		Observable	pacient=new	Covid19Pacient("aitor",	35, sf);
		new	PacientObserverGUI(pacient);
		new	PacientSymptomGUI((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
		
		Observable	pacient2=new Covid19Pacient("mikel", 23, sf);
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI((Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);
		
		Observable	pacient3=new Covid19Pacient("ane", 19, sf);
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI((Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);
	}


}
