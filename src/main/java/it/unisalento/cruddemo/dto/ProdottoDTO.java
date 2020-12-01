package it.unisalento.cruddemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProdottoDTO {
	private String nome;
	private String descrizione;
	private Float prezzo;
}
