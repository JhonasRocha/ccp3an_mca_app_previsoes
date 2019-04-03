package br.usjt.Aula.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.Aula.model.PrevisaoTempo;
import br.usjt.Aula.repository.PrevisaoTemposRepository;
import service.PrevisaoTemposService;



@Controller
public class PrevisaoTemposController {
	
	private PrevisaoTemposRepository previsaoTemposRepo;
	
	@Autowired
	public PrevisaoTemposController (PrevisaoTemposRepository previsaoTemposRepo) {
	this.previsaoTemposRepo = previsaoTemposRepo;
	}
	
	private PrevisaoTemposService previsaoTemposService;
	
	public void setPrevisaoTemposRepo(PrevisaoTemposRepository previsaoTemposRepo) {
	this.previsaoTemposRepo = previsaoTemposRepo;
	}
	@GetMapping ("/previsaoTempos")
	public ModelAndView listarPrevisaoTempos () {
	
	ModelAndView mv = new ModelAndView ("lista_previsaotempos");
	
	mv.addObject(new PrevisaoTempo());
	
	List<PrevisaoTempo> previsaoTempos = previsaoTemposService.listarTodos();
	
	mv.addObject("previsaoTempos", previsaoTempos);
	
	return mv;
	
	}
	
	@PostMapping
	public String salvar (PrevisaoTempo previsaoTempo) {
		previsaoTemposService.salvar(previsaoTempo);
		return "redirect:/previsaoTempos";
	} 
}
