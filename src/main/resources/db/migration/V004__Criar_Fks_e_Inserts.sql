-- Chave estrangeira da tabela curso para aluno.
Alter table aluno add constraint FK_curso_aluno foreign key (idcurso) references curso(id);


-- Chave estrangeira da tabela cidade para aluno.
Alter table aluno add constraint FK_cidade_aluno foreign key (idcidade) references cidade(id);



insert into curso (nomecurso) values ("Logística");

insert into curso (nomecurso) values ("Química");



insert into cidade (nomecidade, uf) values ("Lençóis Paulista", "SP");

insert into cidade (nomecidade, uf) values ("Porto Alegre", "RS");



insert into aluno (nomealuno, idcurso, idcidade) values ("Lilian Aparecida", 2, 1);

insert into aluno (nomealuno, idcurso, idcidade) values ("Magno Júnior", 1, 2);
