DROP SCHEMA IF EXISTS school_life;

CREATE SCHEMA IF NOT EXISTS school_life DEFAULT CHARACTER SET utf8 ;
USE school_life ;

CREATE TABLE `CD_ROLE` (
  `id_role` int(11) NOT NULL AUTO_INCREMENT,
  `name_role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_role`)

) ;

CREATE TABLE `CD_USER` (
  `registration_user` int(11) NOT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(90) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `docs` blob,
  `id_role` int(11) DEFAULT NULL,
  PRIMARY KEY (`registration_user`),
  KEY `id_role` (`id_role`),
  CONSTRAINT `CD_USER_ibfk_1` FOREIGN KEY (`id_role`) REFERENCES `CD_ROLE` (`id_role`)
)
;

CREATE TABLE `CD_DISC` (
  `id_disc` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(90) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `registration_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_disc`),
  KEY `registration_user` (`registration_user`),
  CONSTRAINT `CD_DISC_ibfk_1` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`)
) ;

CREATE TABLE `RL_STUDENT_DISC` (
  `registration_user` int(11) DEFAULT NULL,
  `id_role` int(11) DEFAULT NULL,
  KEY `registration_user` (`registration_user`),
  KEY `id_role` (`id_role`),
  CONSTRAINT `RL_STUDENT_DISC_ibfk_1` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`),
  CONSTRAINT `RL_STUDENT_DISC_ibfk_2` FOREIGN KEY (`id_role`) REFERENCES `CD_ROLE` (`id_role`)
) ;

CREATE TABLE `RL_STUDENT_RESP` (
  `registration_user` int(11) DEFAULT NULL,
  `registration_user_resp` int(11) DEFAULT NULL,
  KEY `registration_user` (`registration_user`),
  KEY `registration_user_resp` (`registration_user_resp`),
  CONSTRAINT `RL_STUDENT_RESP_ibfk_1` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`),
  CONSTRAINT `RL_STUDENT_RESP_ibfk_2` FOREIGN KEY (`registration_user_resp`) REFERENCES `CD_USER` (`registration_user`)
) ;

CREATE TABLE `CD_GRADE` (
  `id_grade` int(11) NOT NULL,
  `id_disc` int(11) DEFAULT NULL,
  `registration_user` int(11) DEFAULT NULL,
  `nota` double DEFAULT NULL,
  `semestre` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_grade`),
  KEY `id_disc` (`id_disc`),
  KEY `registration_user` (`registration_user`),
  CONSTRAINT `CD_GRADE_ibfk_1` FOREIGN KEY (`id_disc`) REFERENCES `CD_DISC` (`id_disc`),
  CONSTRAINT `CD_GRADE_ibfk_2` FOREIGN KEY (`registration_user`) REFERENCES `CD_USER` (`registration_user`)
) ;

CREATE TABLE `CD_MATERIAL` (
  `id_disc` int(11) DEFAULT NULL,
  `material` blob,
  KEY `id_disc` (`id_disc`),
  CONSTRAINT `CD_MATERIAL_ibfk_1` FOREIGN KEY (`id_disc`) REFERENCES `CD_DISC` (`id_disc`)
) ;

CREATE TABLE `CD_QUESTION` (
  `id_question` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) DEFAULT NULL,
  `options` varchar(600) DEFAULT NULL,
  `answer` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id_question`)
)
