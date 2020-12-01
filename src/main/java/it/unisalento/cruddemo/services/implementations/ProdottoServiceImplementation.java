package it.unisalento.cruddemo.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unisalento.cruddemo.converter.ProdottoConverter;
import it.unisalento.cruddemo.dto.ProdottoDTO;
import it.unisalento.cruddemo.dto.ProdottoLightDTO;
import it.unisalento.cruddemo.exceptions.ProdottoNotFound;
import it.unisalento.cruddemo.repository.ProdottoRepository;
import it.unisalento.cruddemo.services.interfaces.ProdottoServiceInterface;

@Service
public class ProdottoServiceImplementation implements ProdottoServiceInterface {

	@Autowired
	private ProdottoRepository prodottoRepository;
	
	@Autowired
	private ProdottoConverter prodottoConverter;
	
	@Override
	public List<ProdottoLightDTO> getListOfProducts() {
		ArrayList<ProdottoLightDTO> prodottiLight = (ArrayList<ProdottoLightDTO>) this.prodottoRepository.findAll()
				.stream()
				.map(prodotto -> this.prodottoConverter.toLightDTO(prodotto))
				.collect(Collectors.toList());
		return prodottiLight;
	}

	@Override
	public ProdottoDTO getProductById(int id) throws ProdottoNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProdottoDTO save(ProdottoDTO prodotto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) throws ProdottoNotFound {
		// TODO Auto-generated method stub
		return false;
	}

}
