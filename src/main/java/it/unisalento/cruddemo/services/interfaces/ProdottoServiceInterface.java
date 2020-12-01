package it.unisalento.cruddemo.services.interfaces;

import java.util.List;

import it.unisalento.cruddemo.dto.ProdottoDTO;
import it.unisalento.cruddemo.dto.ProdottoLightDTO;
import it.unisalento.cruddemo.exceptions.ProdottoNotFound;

public interface ProdottoServiceInterface {
	List<ProdottoLightDTO> getListOfProducts();
	ProdottoDTO getProductById(int id) throws ProdottoNotFound;
	ProdottoDTO save(ProdottoDTO prodotto);
	boolean delete(int id) throws ProdottoNotFound;
}
