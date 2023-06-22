package br.com.etec.giulia.cursoapi.repository.aluno;

import br.com.etec.giulia.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.giulia.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlunoRepositoryQuery {

    public Page<AlunoDto> Filtrar(AlunoFilter alunoFilter, Pageable pageable);

}
