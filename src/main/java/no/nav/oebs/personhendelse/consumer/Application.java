package no.nav.oebs.personhendelse.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot applikasjonsklasse.
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty(
				"org.apache.avro.SERIALIZABLE_PACKAGES",
				"no.nav.person.pdl.leesah"
		);
		SpringApplication.run(Application.class, args);
	}
}
