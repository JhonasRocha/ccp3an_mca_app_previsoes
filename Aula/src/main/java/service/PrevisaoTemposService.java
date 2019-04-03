package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Aula.model.PrevisaoTempo;
import br.usjt.Aula.repository.PrevisaoTemposRepository;

@Service
public class PrevisaoTemposService {
@Autowired
private PrevisaoTemposRepository previsaoTemposRepo;

public void salvar (PrevisaoTempo previsaoTempo) {
	previsaoTemposRepo.save(previsaoTempo);
}
public List <PrevisaoTempo> listarTodos (){
return previsaoTemposRepo.findAll();
}
}