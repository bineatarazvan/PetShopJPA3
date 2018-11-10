package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the animal database table.
 * @Entity - ii spui ca mapezi tabela animal. se pune deasupra clasei
 * toate variabilele reprezinta coloanele tabelei animal
 * @Id - cheia primara a tabelei animal
 * @GeneratedValue - idAnimal va fi generat automat
 */
@Entity
@NamedQuery(name="Personalmedical.findAll", query="SELECT p FROM Personalmedical p")
public class Personalmedical implements Serializable {
	private static final long serialVersionUID = 1L;
//cheia primara tabelei personal medical
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPersonalmedical;

	private String firstName;

	private String lastName;

	public Personalmedical() {
	}

	public int getIdPersonalmedical() {
		return this.idPersonalmedical;
	}

	public void setIdPersonalmedical(int idPersonalMedical) {
		this.idPersonalmedical = idPersonalMedical;
	}

	public String getFirstName() {
		return this.firstName;
	} 

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}