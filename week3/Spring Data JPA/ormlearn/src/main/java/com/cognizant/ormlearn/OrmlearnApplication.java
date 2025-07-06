package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmlearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmlearnApplication.class);
	private static CountryService countryservice;
	public static void main(String[] args) {
		SpringApplication.run(OrmlearnApplication.class, args);
		ApplicationContext context = SpringApplication.run(OrmlearnApplication.class, args);
		countryservice = context.getBean(CountryService.class);

		testGetAllCountries();
	}
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryservice.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

}
