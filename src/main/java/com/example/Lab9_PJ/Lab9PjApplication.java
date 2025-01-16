package com.example.Lab9_PJ;

import com.example.Lab9_PJ.jdbc.Masina;
import com.example.Lab9_PJ.jdbc.MasinaJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Lab9PjApplication implements CommandLineRunner {

	@Autowired
	MasinaJdbcDao dao;

	private Logger logger = LoggerFactory.getLogger(Lab9PjApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(Lab9PjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("Toate masinile: ");
		dao.findAll().forEach(System.out::println);

		logger.info("Toate masinile -> {}", dao.findAll());

		System.out.println();

		System.out.println("Adaugare masina: "+ dao.insert(new Masina("TM45TTT","Mercedes",2006,"portocaliu",44444)));

		logger.info("Adaugare masina -> {}", dao.insert(new Masina("TM46TTT","Mercedes",2006,"portocaliu",44444)));

		System.out.println();

		System.out.println("Toate masinile:");
		dao.findAll().forEach(System.out::println);

		logger.info("Toate masinile -> {}", dao.findAll());

		System.out.println();

		System.out.println("Stergere masina: "+ dao.deleteByNr_inmatriculare("TM45TTT"));

		logger.info("Stergere masina -> {} ", dao.deleteByNr_inmatriculare("TM45TTT"));

		System.out.println();

		System.out.println("Toate masinile");
		dao.findAll().forEach(System.out::println);

		logger.info("Toate masinile -> {}", dao.findAll());

		System.out.println();

		System.out.println("Cautare dupa nr_inmatriculare: "+dao.findByNr_inmatriculare("TM07ESY"));

		logger.info("Cautare dupa nr_inmatriculare -> {} ", dao.findByNr_inmatriculare("TM07ESY"));

		System.out.println();

		System.out.println("Nr masini cu o anumita marca: "+ dao.nr_masini_marca("Mercedes").size());

		logger.info("Nr masini cu o anumita marca -> {} ", dao.nr_masini_marca("Mercedes").size());

		System.out.println();

		System.out.println("Nr masini sub 100000 km: "+dao.sub_100_000km().size());

		logger.info("Nr masini sub 100000 km -> {} ", dao.sub_100_000km().size());

		System.out.println();

		System.out.println("Masini mai noi de 5 ani: ");
		dao.noi_de_peste_5_ani().forEach(System.out::println);

		logger.info("Masini mai noi de 5 ani -> {}",dao.noi_de_peste_5_ani());

	}

}
