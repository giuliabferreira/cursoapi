create table cidade (
    id int not null primary key auto_increment,
    nomecidade varchar(100),
    uf char(2)
);

insert into cidade(nomecidade, uf) values (1, "Lençóis Paulista", "SP");
