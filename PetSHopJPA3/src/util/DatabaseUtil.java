package util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Animal;
import model.Personalmedical;
import model.Programare;

public class DatabaseUtil {
	//functii CRUD pentru animal, programare si personal medical
	public static EntityManagerFactory entityManagerFactory;
	public static EntityManager entityManager;
	
	public void setUp() throws Exception {
		entityManagerFactory = Persistence.createEntityManagerFactory("PetSHopJPA3");
		entityManager = entityManagerFactory.createEntityManager();
	}
	//functie CREATE salveaza un animal in baza de date
	public void saveAnimal(Animal animal) {
		entityManager.persist(animal);
	}
	//functie DELETE sterge un animal in baza de date
	public void deleteAnimal(Animal animal) {
		Animal currentAnimal =animal;
		if (!entityManager.contains(animal)) {
		    currentAnimal = entityManager.merge(animal);
		}
		entityManager.remove(currentAnimal);
	}
	//functie CREATE salveaza o programare in baza de date
	public void saveProgramare(Programare programare) {
		entityManager.persist(programare);
	}
	
	//functie DELETE salveaza o programare in baza de date
	public void deleteProgramare(Programare programare) { 
		entityManager.remove(programare);
	}
	public void savePersonalmedical(Personalmedical personalMedical) {
		entityManager.persist(personalMedical);
	}

	public void deletePersonalmedical(Personalmedical personalMedical) {
		entityManager.remove(personalMedical);
	}
	public void startTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void closeEntityManager() {
		entityManager.close();
	}
	
	public void printAllAnimalsFromDB() {
		List<Animal>results = entityManager.createNativeQuery("Select * from PetShop.Animal", Animal.class).getResultList();
		for (Animal animal : results) {
			System.out.println("Animal :" + animal.getName() + " has ID: "+ animal.getIdAnimal());
		}
	}
	public void printAllProgramariFromDB() {
		List<Programare>results = entityManager.createNativeQuery("Select * from PetShop.Programare", Programare.class).getResultList();
		for (Programare programare : results) {
			System.out.println("Programarea din data de :" + programare.getDataProgramare() +"de  la ora" + programare.getOraProgramare() +" has ID: "+ programare.getDataProgramare());
		}
	}
	public void printAllPersonalMedicalFromDB() {
		List<Personalmedical>results = entityManager.createNativeQuery("Select * from PetShop.Personalmedical", Personalmedical.class).getResultList();
		for (Personalmedical personalMedical : results) {
			System.out.println("Doctorul :" + personalMedical.getFirstName() + " has ID: "+ personalMedical.getIdPersonalmedical());
		}
	}

}
