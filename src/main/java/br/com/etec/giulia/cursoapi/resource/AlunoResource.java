package br.com.etec.giulia.cursoapi.resource;

import br.com.etec.giulia.cursoapi.model.Aluno;
import br.com.etec.giulia.cursoapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarTodosAlunos() {
        return alunoRepository.findAll();
    }


}
