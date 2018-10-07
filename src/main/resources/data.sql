insert into users (id, login, password, first_name, last_name , e_mail, enabled) VALUES (1,'seratic', '$2a$10$X/LsmAgaZiQFIjmInKdW2eZmkh4BeURMBVDmdbj3WrzAT0eYl45m.', 'pepito', 'perez', 'dannysenju@gmail.com',1);
insert into users (id, login, password, first_name, last_name, e_mail, enabled) VALUES (2,'test', '$2a$10$X/LsmAgaZiQFIjmInKdW2eZmkh4BeURMBVDmdbj3WrzAT0eYl45m.', 'pablo', 'parra', 'dannysenju@gmail.com',1);

insert into authority (id, name) values (1, 'admin');
insert into authority (id, name) values (2, 'test');

insert into users_authority (id_user, id_authority) values (1, 1);
insert into users_authority (id_user, id_authority) values (2, 2);


INSERT INTO candidate (id, career, email, first_name, last_name, phone) VALUES ('1', 'ingenieria', 'd', 'carlos', 'perez', '1');
INSERT INTO candidate (id, career, email, first_name, last_name, phone) VALUES ('2', 'medicin', 'd', 'tania', 'xxx', '2');

INSERT INTO aspiring_test (id_test, date_test, detail_test, quali_test, candidate_id) VALUES ('1', '2018-10-10', 'detalle', '3', '1');
INSERT INTO aspiring_test (id_test, date_test, detail_test, quali_test, candidate_id) VALUES ('2', '2018-10-10', 'detalle', '4', '2');
	