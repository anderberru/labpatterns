package adapterIterator;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;
import java.util.Iterator;


import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       
    	SymptomFactory sf = new SymptomFactory();
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35, sf);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		pacient.addSymptomByName("tos seca", 2);
		pacient.addSymptomByName("fiebre", 1);

        
        Iterator sortedByNameIterator = Sorting.sortedIterator(new Covid19PacientAdapter(pacient), new SymptomNameComparator());

        
        Iterator sortedBySeverityIndexIterator = Sorting.sortedIterator(new Covid19PacientAdapter(pacient), new SeverityIndexComparator());

        
        System.out.println("Symptoms ordered by Name:");
        printIterator(sortedByNameIterator);

        System.out.println("\nSymptoms ordered by Severity Index:");
        printIterator(sortedBySeverityIndexIterator);
    }

    private static void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            Symptom symptom = (Symptom) iterator.next();
            System.out.println(symptom.getName() + " - Severity Index: " + symptom.getSeverityIndex());
        }
    }
}

