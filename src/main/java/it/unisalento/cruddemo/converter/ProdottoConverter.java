package it.unisalento.cruddemo.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unisalento.cruddemo.domain.Prodotto;
import it.unisalento.cruddemo.dto.ProdottoLightDTO;

@Service
public class ProdottoConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ProdottoLightDTO toLightDTO(Prodotto prodotto) {
		return this.modelMapper.map(prodotto, ProdottoLightDTO.class);
	}
}
