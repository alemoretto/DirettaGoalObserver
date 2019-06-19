package it.direttagoal;

import it.direttagoal.observer.DatiPartitaDisplay;
import it.direttagoal.observer.RisultatoCorrenteDisplay;
import it.direttagoal.subject.DirettaGoal;

public class TestDirettaGoal {

	public static void main(String[] args) {

		DirettaGoal direttaGoal = new DirettaGoal();
		RisultatoCorrenteDisplay risultatoDisplay = new RisultatoCorrenteDisplay(direttaGoal);
		DatiPartitaDisplay datiPartitaDisplay = new DatiPartitaDisplay(direttaGoal);

		direttaGoal.setRisultati(24, "Totti", 24, "1-0");
		System.out.println("..................................");
		direttaGoal.setRisultati(38, "De Rossi", 38, "2-0");

	}

}
