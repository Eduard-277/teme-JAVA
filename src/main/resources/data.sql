drop table if exists carti;
create table carti(ISBN int primary key AUTO_INCREMENT, titlul varchar(50) not null, autorul varchar(50) not null);

insert into carti(autorul,titlul) values ("Yuval Noah Harari","Scurta istorie a omenirii");
insert into carti(autorul,titlul) values ("Yuval Noah Harari","Homo deus - Scurta istorie a viitorului");
insert into carti(autorul,titlul) values ("J.D. SALINGER","De veghe in lanul de secara");