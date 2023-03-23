create table aluno (
    id bigint not null primary key auto_increment,
    nomealuno varchar(100),
    idcurso int not null,
    idcidade int not null
);

insert into aluno(nomealuno, idcurso, idcidade) values (1, "Lilian Aparecida Bodo", "Logística", "Lençóis Paulista");

