package it.direttagoal.subject;

import java.util.ArrayList;
import java.util.List;

import it.direttagoal.observer.Observer;

public class DirettaGoal implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int minutoGoal;
	private String marcatore;
	private int minutoCorrente;
	private String risultatoAggiornato;
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(minutoGoal, marcatore, minutoCorrente, risultatoAggiornato);
		}
	}
	
	public void risultatoIsChanged() {
		notifyObservers();
	}
	
	public void setRisultati(int minutoGoal, String marcatore, int minutoCorrente, String risultatoAggiornato) {
		this.minutoGoal = minutoGoal;
		this.marcatore = marcatore;
		this.minutoCorrente = minutoCorrente;
		this.risultatoAggiornato = risultatoAggiornato;
		risultatoIsChanged();
				
	}

}
