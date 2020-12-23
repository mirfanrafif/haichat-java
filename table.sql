-- we don't know how to generate root <with-no-name> (class Root) :(
create table user
(
	id int auto_increment
		primary key,
	nama varchar(255) null,
	username varchar(255) null,
	password varchar(255) null
);

create table kontak
(
	id int auto_increment
		primary key,
	id_user1 int null,
	id_user2 int null,
	constraint kontak_user_id_fk
		foreign key (id_user1) references user (id),
	constraint kontak_user_id_fk_2
		foreign key (id_user2) references user (id)
);

