package br.com.etec.giulia.cursoapi.repository.cidade;

import br.com.etec.giulia.cursoapi.model.Cidade;
import br.com.etec.giulia.cursoapi.repository.filter.CidadeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CidadeRepositoryQuery {

    public Page<Cidade> Filtrar(CidadeFilter cidadeFilter, Pageable pageable);

}
