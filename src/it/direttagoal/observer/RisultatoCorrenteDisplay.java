package it.direttagoal.observer;

import it.direttagoal.subject.Subject;

public class RisultatoCorrenteDisplay implements Observer, DisplayElement {

	private int minutoCorrente;
	private String risultatoAggiornato;
	private Subject direttaGoal;
	
	public RisultatoCorrenteDisplay(Subject direttaGoal) {
		this.direttaGoal = direttaGoal;
		direttaGoal.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Goooal !!! " + minutoCorrente + " è di " + risultatoAggiornato);
	}
	
	@Override
	public void update(int minutoGoal, String marcatore, int minutoCorrente, String risultatoAggiornato) {
		this.minutoCorrente = minutoCorrente;
		this.risultatoAggiornato = risultatoAggiornato;
		display();
	}
	
	public String getRisultatoCorrente() {
		return risultatoAggiornato;
	}
	public void setRisultatoCorrente(String risultatoCorrente) {
		this.risultatoAggiornato = risultatoCorrente;
	}
	public Subject getDirettaGoal() {
		return direttaGoal;
	}
	public void setDirettaGoal(Subject direttaGoal) {
		this.direttaGoal = direttaGoal;
	}
	
	
	
	
}
