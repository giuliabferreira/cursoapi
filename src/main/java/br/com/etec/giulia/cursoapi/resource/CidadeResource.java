package br.com.etec.giulia.cursoapi.resource;

import br.com.etec.giulia.cursoapi.model.Cidade;
import br.com.etec.giulia.cursoapi.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

    @Autowired
    private CidadeRepository cidadeRepository;

    @GetMapping()
    public List<Cidade> listarTodasCidades() {
        return cidadeRepository.findAll();

    }
}
