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
@NamedQuery(name="Animal.findAll", query="SELECT a FROM Animal a")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	//cheia primara tabelei animal
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAnimal;

	private String name;

//	//bi-directional many-to-one association to Programare
//	@OneToMany(mappedBy="animal")
//	private List<Programare> programares;

	public Animal() {
	}

	public int getIdAnimal() {
		return this.idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Programare> getProgramares() {
//		return this.programares;
//	}
//
//	public void setProgramares(List<Programare> programares) {
//		this.programares = programares;
//	}



}