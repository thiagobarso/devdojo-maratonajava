create database anime_store;

CREATE table anime_store.producer(
	id int not null auto_increment,
	name varchar(255) not null,
	primary key(id)
);

create table anime_store.anime(
 	id int not null auto_increment,
 	name varchar(300) not null,
 	episodes int not null,
 	producer_id int not null,
 	primary key (id),
 	index producer_id_idx (producer_id ASC) visible,
 	constraint producer_id foreign key (producer_id) references anime_store.producer(id)
 	on delete no action on update no action
);