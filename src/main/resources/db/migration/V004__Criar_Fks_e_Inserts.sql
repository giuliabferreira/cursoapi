-- Chave estrangeira da tabela curso para aluno.
Alter table aluno add constraint FK_curso_aluno foreign key (idcurso) references curso(id);


-- Chave estrangeira da tabela cidade para aluno.
Alter table aluno add constraint FK_cidade_aluno foreign key (idcidade) references cidade(id);