package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Date;
import java.text.SimpleDateFormat;

import model.Animal;
import model.Personalmedical;
import model.Programare;
import util.DatabaseUtil;

public class Main {

	public static void main(String[] args) throws Exception {
		DatabaseUtil dbUtil = new DatabaseUtil();

		Animal b = new Animal();
		Personalmedical p = new Personalmedical();
		Programare prog = new Programare();

//		 p.setIdPersonalmedical(4);
//		 p.setFirstName("Popescu");
//		 p.setLastName("Maria");
//		 dbUtil.setUp();
//		 dbUtil.startTransaction();
//		 dbUtil.savePersonalmedical(p);
//		 dbUtil.commitTransaction();	

		// prog.setIdAnimalFK(1);
		// prog.setIdPersonalMedicalFK(2);

		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// java.util.Date date1 = dateFormat.parse("2012-12-13 14:54:30");
		// prog.setDate1(2012-12-12 20:20:20);

//		 prog.setIdProgramare(1);
//		 prog.setDataProgramare("20.dec.20118");
//		 prog.setOraProgramare("15:30:00");
//		 dbUtil.setUp();
//		 dbUtil.startTransaction();
//		 dbUtil.saveProgramare(prog);
//		 dbUtil.commitTransaction();	 
		/*
		 * b.setIdAnimal(14); b.setName("Grivei"); dbUtil.setUp();
		 * dbUtil.startTransaction(); dbUtil.saveAnimal(b); dbUtil.commitTransaction();
		 */
		Animal a = new Animal();

		a.setIdAnimal(14);
		a.setName("Twity");
		dbUtil.setUp();
		dbUtil.startTransaction();
		dbUtil.deleteAnimal(a);
		dbUtil.commitTransaction();

		dbUtil.printAllAnimalsFromDB();
		dbUtil.printAllProgramariFromDB();
		dbUtil.printAllPersonalMedicalFromDB();
		dbUtil.closeEntityManager();
	}
}
