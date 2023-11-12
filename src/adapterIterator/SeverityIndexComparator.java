package adapterIterator;

import java.util.Comparator;

import domain.Symptom;

class SeverityIndexComparator implements Comparator<Symptom> {
    
	@Override
    public int compare(Symptom s1, Symptom s2) {
        return Integer.compare(s1.getSeverityIndex(), s2.getSeverityIndex());
    }
}

