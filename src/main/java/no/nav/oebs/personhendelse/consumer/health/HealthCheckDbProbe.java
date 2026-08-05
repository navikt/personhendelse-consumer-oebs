package no.nav.oebs.personhendelse.consumer.health;

import org.springframework.stereotype.Component;

import no.nav.oebs.personhendelse.consumer.db.repository.LoggRepository;

/**
 * Helsesjekk som brukes for å sjekke at databasen er tilgjengelig for applikasjonen.
 */
@Component
public class HealthCheckDbProbe {

	private LoggRepository loggRepository;

	HealthCheckDbProbe(LoggRepository loggRepository) {
		this.loggRepository = loggRepository;
	}

	/**
	 * Pinger databasen ved å forsøke en spørring mot kall-loggen, men henter ingen data.
	 */
	public void pingDatabase() {
		loggRepository.pingKallLogg();
	}
}
