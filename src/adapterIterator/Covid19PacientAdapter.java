package adapterIterator;

import java.util.List;


import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

import java.util.ArrayList;

public class Covid19PacientAdapter implements InvertedIterator {
    private final List<Symptom> symptomsList;
    private int currentIndex;

    public Covid19PacientAdapter(Covid19Pacient pacient) {
        this.symptomsList = new ArrayList<>(pacient.getSymptoms());
        this.currentIndex = symptomsList.size() - 1;
    }

    @Override
    public Symptom previous() {
        if (hasPrevious()) {
            return symptomsList.get(currentIndex--);
        }
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex >= 0;
    }

    @Override
    public void goLast() {
        currentIndex = symptomsList.size() - 1;
    }
}
