package it.polito.tdp.libretto.model;

import java.util.*;

public class LibrettoModel {
	private List<Esame> esami;
	
	public LibrettoModel (){
		this.esami= new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti verificando che non sia già presente nella lista
	 * @param e
	 * @return true se inserito false se non è stato inserito perchè già presente
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			esami.add(e);
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Ricerca se esiste un esame col codice specificato, altrimenti restituisce null
	 * @param codice
	 * @return
	 */
	public Esame trovaEsame(String codice){
		int pos = esami.indexOf(new Esame(codice, null, null));
		if(pos == -1){
			return null;
		}
		else{
			return esami.get(pos);
		}
	}
}
