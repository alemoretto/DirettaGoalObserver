package it.direttagoal.observer;

import java.util.ArrayList;
import java.util.List;

import it.direttagoal.subject.Subject;

public class DatiPartitaDisplay implements Observer, DisplayElement {

	private int minutoCorrente;
	private String risultatoAggiornato;
	private List<Integer> minutoGoals = new ArrayList<>();
	private List<String> marcatori = new ArrayList<>();
	private Subject direttaGoal;

	public DatiPartitaDisplay(Subject direttaGoal) {
		this.direttaGoal = direttaGoal;
		direttaGoal.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Siamo al " + minutoCorrente + "' e il risultato è di " + risultatoAggiornato);
		if (marcatori.size() > 0) {
			String m = "Goal: ";
			for (int i = 0; i < marcatori.size(); i++) {
				m += marcatori.get(i) + "(" + minutoGoals.get(i) + "') ";
			}
			System.out.println(m);
		}
	}

	@Override
	public void update(int minutoGoal, String marcatore, int minutoCorrente, String risultatoAggiornato) {
		this.minutoCorrente = minutoCorrente;
		this.risultatoAggiornato = risultatoAggiornato;
		this.minutoGoals.add(minutoGoal);
		this.marcatori.add(marcatore);
		display();
	}

	public int getMinutoCorrente() {
		return minutoCorrente;
	}

	public void setMinutoCorrente(int minutoCorrente) {
		this.minutoCorrente = minutoCorrente;
	}

	public String getRisultatoAggiornato() {
		return risultatoAggiornato;
	}

	public void setRisultatoAggiornato(String risultatoAggiornato) {
		this.risultatoAggiornato = risultatoAggiornato;
	}

	public List<Integer> getMinutoGoals() {
		return minutoGoals;
	}

	public void setMinutoGoals(List<Integer> minutoGoals) {
		this.minutoGoals = minutoGoals;
	}

	public List<String> getMarcatori() {
		return marcatori;
	}

	public void setMarcatori(List<String> marcatori) {
		this.marcatori = marcatori;
	}

	public Subject getDirettaGoal() {
		return direttaGoal;
	}

	public void setDirettaGoal(Subject direttaGoal) {
		this.direttaGoal = direttaGoal;
	}

}
