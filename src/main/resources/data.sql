insert into users (id, login, password, first_name, last_name , e_mail, enable) VALUES (1,'seratic', 'd404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db', 'pepito', 'perez', 'dannysenju@gmail.com',1);
insert into users (id, login, password, first_name, last_name, e_mail, enable) VALUES (2,'test', 'd404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db', 'pablo', 'parra', 'dannysenju@gmail.com',1);

insert into authority (name) values ('admin');
insert into authority (name) values ('test');

insert into users_authority (id_user, id_authority) values (1, 1);
insert into users_authority (id_user, id_authority) values (2, 2);	