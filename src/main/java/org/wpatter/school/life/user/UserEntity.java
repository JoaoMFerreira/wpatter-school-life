package org.wpatter.school.life.user;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_USER")
@AttributeOverride(name = "id", column = @Column(name = "registration_user"))
public class UserEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -251643754181562435L;

	private String login;
	private String password;
	private String name;
	private Date birthDate;
	private String docs;

	public UserEntity() {

	}

	public UserEntity(String login, String password, String name, Date birthDate, String docs) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
		this.birthDate = birthDate;
		this.docs = docs;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getDocs() {
		return docs;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

}
