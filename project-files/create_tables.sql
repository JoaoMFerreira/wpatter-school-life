DROP SCHEMA IF EXISTS school_life;

CREATE SCHEMA IF NOT EXISTS school_life DEFAULT CHARACTER SET utf8 ;
USE school_life ;

CREATE TABLE `CD_ROLE` (
  `id_role` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_role`)

) ;

CREATE TABLE `CD_USER` (
  `registration_user` int(11) NOT NULL,
  `email` varchar(128) NOT NULL UNIQUE,
  `password` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL,
  `birth_date` date NOT NULL,
  `docs` blob,
  `id_role` int(11) NOT NULL,
  PRIMARY KEY (`registration_user`),
  KEY `id_role` (`id_role`),
  CONSTRAINT `CD_USER_ibfk_1` FOREIGN KEY (`id_role`) REFERENCES `CD_ROLE` (`id_role`)
)
;

CREATE TABLE `CD_DISC` (
  `id_disc` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(90) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `registration_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_disc`),
  KEY `registration_user` (`registration_user`),
  CONSTRAINT `CD_DISC_ibfk_1` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`)
) ;


CREATE TABLE `CD_ABSENCE` (
  `id_absence` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `id_disc` int(11) not null,
  `registration_user` int(11) not null,
  PRIMARY KEY (`id_absence`),
  KEY `id_disc` (`id_disc`),
  KEY `registration_user` (`registration_user`),
  CONSTRAINT `CD_ABSENCE_ibfk_1` FOREIGN KEY (`id_disc`) REFERENCES `CD_DISC` (`id_disc`),
  CONSTRAINT `CD_ABSENCE_ibfk_2` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`)
) ;


CREATE TABLE `RL_STUDENT_DISC` (
  `registration_user` int(11) NOT NULL,
  `id_disc` int(11) NOT NULL,
  PRIMARY KEY (`registration_user`, `id_disc`),
  CONSTRAINT `RL_STUDENT_DISC_ibfk_1` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`),
  CONSTRAINT `RL_STUDENT_DISC_ibfk_2` FOREIGN KEY (`id_disc`) REFERENCES `CD_DISC` (`id_disc`)
) ;

CREATE TABLE `RL_STUDENT_RESP` (
  `registration_user` int(11) NOT NULL,
  `registration_user_resp` int(11) NOT NULL,
  KEY `registration_user` (`registration_user`),
  KEY `registration_user_resp` (`registration_user_resp`),
  PRIMARY KEY (`registration_user`, `registration_user_resp`),
  CONSTRAINT `RL_STUDENT_RESP_ibfk_1` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`),
  CONSTRAINT `RL_STUDENT_RESP_ibfk_2` FOREIGN KEY (`registration_user_resp`) REFERENCES `CD_USER` (`registration_user`)
) ;

CREATE TABLE `CD_GRADE` (
  `id_grade` int(11) NOT NULL,
  `id_disc` int(11) NOT NULL,
  `registration_user` int(11) NOT NULL,
  `value` double NOT NULL,
  `semester` varchar(10) NOT NULL,
  PRIMARY KEY (`id_grade`),
  KEY `id_disc` (`id_disc`),
  KEY `registration_user` (`registration_user`),
  CONSTRAINT `CD_GRADE_ibfk_1` FOREIGN KEY (`id_disc`) REFERENCES `CD_DISC` (`id_disc`),
  CONSTRAINT `CD_GRADE_ibfk_2` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`)
) ;

CREATE TABLE `CD_MATERIAL` (
  `id_disc` int(11) NOT NULL,
  `material` blob,
  KEY `id_disc` (`id_disc`),
  CONSTRAINT `CD_MATERIAL_ibfk_1` FOREIGN KEY (`id_disc`) REFERENCES `CD_DISC` (`id_disc`)
) ;

CREATE TABLE `CD_QUESTION` (
  `id_question` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) NOT NULL,
  `options` varchar(600) NOT NULL,
  `answer` varchar(5) NOT NULL,
  PRIMARY KEY (`id_question`)
)
