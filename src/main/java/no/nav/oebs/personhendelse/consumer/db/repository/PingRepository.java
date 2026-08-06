package no.nav.oebs.personhendelse.consumer.db.repository;

/**
 * Egendefinerte metoder for NomsLogg-repository.
 */
public interface PingRepository {

	/**
	 * Kjører en select mot tabellen NomsLogg, uten å finne noen rader. Vil feile hvis databasen ikke er tilgjengelig.
	 */
	void pingKallLogg();
}
