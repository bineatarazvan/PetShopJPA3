package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the animal database table.
 * @Entity - ii spui ca mapezi tabela animal. se pune deasupra clasei
 * toate variabilele reprezinta coloanele tabelei animal
 * @Id - cheia primara a tabelei animal
 * @GeneratedValue - idAnimal va fi generat automat
 */
	@Entity
	@NamedQuery(name="Programare.findAll", query="SELECT p FROM Programare p")
public class Programare implements Serializable {
	private static final long serialVersionUID = 1L;
	//cheia primara tabelei programare
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idProgramare;
	private int idAnimalFK;
	private int idPersonalMedicalFK;

	private String dataProgramare;

	private String oraProgramare;

//	//bi-directional many-to-one association to Animal
//	@ManyToOne
//	@JoinColumn(name="idAnimalFK")
//	private Animal animal;

//	//bi-directional many-to-one association to Personalmedical
//	@ManyToOne
//	@JoinColumn(name="idPersonalMedicalFK")
//	private Personalmedical personalmedical;

	
	public int getIdProgramare() {
		return idProgramare;
	}


	public void setIdProgramare(int idProgramare) {
		this.idProgramare = idProgramare;
	}
	 
	public int getIdAnimalFK() {
		return idAnimalFK;
	}


	public void setIdAnimalFK(int idAnimalFK) {
		this.idAnimalFK = idAnimalFK;
	}


	public int getIdPersonalMedicalFK() {
		return idPersonalMedicalFK;
	}


	public void setIdPersonalMedicalFK(int idPersonalMedicalFK) {
		this.idPersonalMedicalFK = idPersonalMedicalFK;
	}
	
	
	
	public String getDataProgramare() {
		return this.dataProgramare;
	}

	public void setDataProgramare(String dataProgramare) {
		this.dataProgramare = dataProgramare;
	}

	public String getOraProgramare() {
		return this.oraProgramare;
	}

	public void setOraProgramare(String oraProgramare) {
		this.oraProgramare = oraProgramare;
	}

//	public Animal getAnimal() {
//		return this.animal;
//	}
//
//	public void setAnimal(Animal animal) {
//		this.animal = animal;
//	}
//
//	public Personalmedical getPersonalmedical() {
//		return this.personalmedical;
//	}
//
//	public void setPersonalmedical(Personalmedical personalmedical) {
//		this.personalmedical = personalmedical;
//	}

}