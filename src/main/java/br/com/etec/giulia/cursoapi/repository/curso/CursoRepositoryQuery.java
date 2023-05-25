package br.com.etec.giulia.cursoapi.repository.curso;

import br.com.etec.giulia.cursoapi.model.Curso;
import br.com.etec.giulia.cursoapi.repository.filter.CursoFilter;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface CursoRepositoryQuery {

    public Page<Curso> Filtrar(CursoFilter cursoFilter, Pageable pageable);

    Page<Curso> Filtrar(CursoFilter cursoFilter, org.springframework.data.domain.Pageable pageable);
}
