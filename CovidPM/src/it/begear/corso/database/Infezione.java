package it.begear.corso.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infezione")
public class Infezione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "id_utente")
	private int id_utente;

	public Infezione() {}

	public int getId() {
		return id;
	}

	public int getId_utente() {
		return id_utente;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}
	
}