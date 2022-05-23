create table cat_stat
(species varchar(20),
lv num(10) not null,
love num(10) not null,
hp num(10) not null,
clean num(10) not null,
sat num(10) not null,
constraint catstate_spe_pk primary key(species));

create table person
(id varchar(20) not null,
pw varchar(20) not null,
cat_name varchar(20) 
constraint per_id primary key(id));

create table cat
(name varchar(20) not null,
species varchar(20) not null,
p_id varchar(20) not null,
lv num(10) not null,
love num(10) not null,
hp num(10) not null,
clean num(10) not null,
sat num(10) not null,
constraint cat_name_pk primary key(name),
constraint cat_species_fk foreign key(species) references cat_stat(species),  
constraint cat_p_id_fk foreign key(p_id) references cat_stat(),
constraint cat_spe_ck check(species));