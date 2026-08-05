package no.nav.oebs.personhendelse.consumer.service;

import java.time.LocalDateTime;

import no.nav.oebs.personhendelse.consumer.db.entity.BaseHendelse;

/**
 * Basisklasse som arves av hendelsetjenestene for bruk av felles funksjonalitet.
 */
public class HendelseServiceBase {

	protected ServiceConfig serviceConfig;

	protected HendelseServiceBase(ServiceConfig serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

	/**
	 * Beregner kjøretidspunkt for neste retry.
	 */
	protected LocalDateTime getNextRetryTidspunkt(BaseHendelse hendelse) {
		int delayMins = serviceConfig.getRetryAttempt1DelayMins();

		if (hendelse.getRetryTeller() < serviceConfig.getRetryMaxAttempts()) {
			delayMins = serviceConfig.getRetryAttemptNDelayMins();
		}

		return LocalDateTime.now().plusMinutes(delayMins);
	}
}
