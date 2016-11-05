use school_life;
INSERT INTO school_life.CD_ROLE (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO school_life.CD_ROLE (role_name) VALUES ('ROLE_ALUNO');
INSERT INTO school_life.CD_ROLE (role_name) VALUES ('ROLE_PROF');
INSERT INTO school_life.CD_ROLE (role_name) VALUES ('ROLE_RESPON');

INSERT INTO `school_life`.`CD_USER`(`registration_user`,`email`,`password`,`name`,`birth_date`,`docs`,`id_role`)
VALUES(123456,'aluno@aluno.com','123','aluno',date(sysdate()),'',2);

INSERT INTO `school_life`.`CD_USER`(`registration_user`,`email`,`password`,`name`,`birth_date`,`docs`,`id_role`)
VALUES(123457,'prof@prof.com','123','professor',date(sysdate()),'',3);

INSERT INTO `school_life`.`CD_USER`(`registration_user`,`email`,`password`,`name`,`birth_date`,`docs`,`id_role`)
VALUES(123458,'admin@admin.com','123','administrador',date(sysdate()),'',1);

INSERT INTO `school_life`.`CD_USER`(`registration_user`,`email`,`password`,`name`,`birth_date`,`docs`,`id_role`)
VALUES(123459,'resp@resp.com','123','responsavel',date(sysdate()),'',4);

INSERT INTO `school_life`.`CD_DISC` (`name`,`description`) VALUES ('matematica','5º Ano');
INSERT INTO `school_life`.`CD_DISC` (`name`,`description`) VALUES ('portugues','5º Ano');
INSERT INTO `school_life`.`CD_DISC` (`name`,`description`) VALUES ('ciencias','5º Ano');
INSERT INTO `school_life`.`CD_DISC` (`name`,`description`) VALUES ('historia','5º Ano');
INSERT INTO `school_life`.`CD_DISC` (`name`,`description`) VALUES ('geografia','5º Ano');

INSERT INTO school_life.RL_USER_DISC (registration_user,id_disc) values (123456,2);
INSERT INTO school_life.RL_USER_DISC (registration_user,id_disc) values (123456,3);

INSERT INTO school_life.RL_STUDENT_RESP (registration_user, registration_user_resp) values (123456, 123459);

INSERT INTO `school_life`.`cd_grade`(`id_disc`,`registration_user`,`value`,`semester`) VALUES (2,123456,10.0,'2016/2');

INSERT INTO `school_life`.`cd_absence`(`absence_date`,`id_disc`,`registration_user`) VALUES (date(sysdate()), 2, 123456);
