package it.unisalento.cruddemo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.cruddemo.dto.ProdottoLightDTO;
import it.unisalento.cruddemo.services.interfaces.ProdottoServiceInterface;

@RestController
@RequestMapping("/api/prodotto")
public class ProdottoRestController {
	
	@Autowired
	private ProdottoServiceInterface prodottoService;
	
	@GetMapping(value = "/lista")
	public @ResponseBody List<ProdottoLightDTO> getListOfProducts() {
		return this.prodottoService.getListOfProducts();
	}
}
