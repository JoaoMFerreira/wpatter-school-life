package org.wpatter.school.life.user;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.wpatter.school.life.RoleEntity;
import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_USER")
@AttributeOverride(name = "id", column = @Column(name = "registration_user"))
public class UserEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -251643754181562435L;
	
	@NotNull
	@Size(min = 4, max = 128)
	@Column(name = "email", length = 128, nullable = false)
	private String email;
	
	@NotNull
	@Size(min = 4, max = 128)
	@Column(name = "password", length = 128, nullable = false)
	private String password;
	
	@NotNull
	@Size(min = 4, max = 128)
	@Column(name = "name", length = 128, nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "birth_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@NotNull
	@Column(name = "docs")
	private String docs;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_role", nullable=false)
	private RoleEntity role;

	public UserEntity() {

	}

	public UserEntity(String login, String password, String name, Date birthDate, String docs, RoleEntity role) {
		super();
		this.email = login;
		this.password = password;
		this.name = name;
		this.birthDate = birthDate;
		this.docs = docs;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String login) {
		this.email = login;
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

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

}
