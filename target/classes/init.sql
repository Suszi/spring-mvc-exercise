create table client (id bigint generated by default as identity (start with 1), name varchar(255), primary key (id), picture blob);
insert into client(id, name) values (default, 'John Doe');
insert into client(id, name) values (default, 'Jane Doe');
insert into client(id, name) values (default, 'Jonnie Doe');