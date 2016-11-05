package org.wpatter.school.life.userdisciplines;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.wpatter.school.life.utils.BaseKey;

@Embeddable
public class UserDisciplineKey extends BaseKey {

	private static final long serialVersionUID = 201602010536L;

	@Column(name = "registration_user", length = 11, nullable = false)
	private Long registration_user;

	@Column(name = "id_disc", length = 11, nullable = false)
	private Long id_disc;

	public UserDisciplineKey() {
	}

	public UserDisciplineKey(Long registration_user, Long id_disc) {
		super();
		this.registration_user = registration_user;
		this.id_disc = id_disc;
	}

	public Long getRegistration_user() {
		return registration_user;
	}

	public void setRegistration_user(Long registration_user) {
		this.registration_user = registration_user;
	}

	public Long getId_disc() {
		return id_disc;
	}

	public void setId_disc(Long id_disc) {
		this.id_disc = id_disc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_disc == null) ? 0 : id_disc.hashCode());
		result = prime
				* result
				+ ((registration_user == null) ? 0 : registration_user
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDisciplineKey other = (UserDisciplineKey) obj;
		if (id_disc == null) {
			if (other.id_disc != null)
				return false;
		} else if (!id_disc.equals(other.id_disc))
			return false;
		if (registration_user == null) {
			if (other.registration_user != null)
				return false;
		} else if (!registration_user.equals(other.registration_user))
			return false;
		return true;
	}

}
