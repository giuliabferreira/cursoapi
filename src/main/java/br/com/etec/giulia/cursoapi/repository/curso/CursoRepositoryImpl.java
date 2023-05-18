package br.com.etec.giulia.cursoapi.repository.curso;

import br.com.etec.giulia.cursoapi.model.Curso;
import br.com.etec.giulia.cursoapi.repository.filter.CursoFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.util.Predicates;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

public class CursoRepositoryImpl implements CursoRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<Curso> Filtrar(CursoFilter cursoFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Curso> criteria = builder.createQuery(Curso.class);
        Root<Curso> root = criteria.from(Curso.class);

        Predicate[] predicates = criarRestricoes(cursoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomecurso")));

        TypedQuery<Curso> query = manager.createQuery(criteria);

        return null;
    }

    private Predicate[] criarRestricoes(CursoFilter cursoFilter, CriteriaBuilder builder, Root<Curso> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(cursoFilter.getNomecurso())) {
            predicates.add(builder.like(builder.lower(root.get("nomecurso")),
                    "%" + cursoFilter.getNomecurso().toLowerCase() + "%" ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

}
