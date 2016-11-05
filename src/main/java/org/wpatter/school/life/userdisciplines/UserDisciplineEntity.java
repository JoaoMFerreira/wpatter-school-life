package org.wpatter.school.life.userdisciplines;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "RL_USER_DISC")
public class UserDisciplineEntity extends BaseEntity<UserDisciplineKey>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8983976399485454666L;

}
