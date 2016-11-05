package org.wpatter.school.life.student.resp;

import javax.persistence.Column;

import org.wpatter.school.life.utils.BaseKey;

public class StudentResponsibleKey extends BaseKey {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2611770441659528774L;

	@Column(name = "registration_user", length = 11, nullable = false)
	private Long registration_user;

	@Column(name = "registration_user_resp", length = 11, nullable = false)
	private Long registration_user_resp;

	public StudentResponsibleKey() {
		
	}
	
	public StudentResponsibleKey(Long registration_user,
			Long registration_user_resp) {
		super();
		this.registration_user = registration_user;
		this.registration_user_resp = registration_user_resp;
	}
	public Long getRegistration_user() {
		return registration_user;
	}

	public void setRegistration_user(Long registration_user) {
		this.registration_user = registration_user;
	}

	public Long getRegistration_user_resp() {
		return registration_user_resp;
	}

	public void setRegistration_user_resp(Long registration_user_resp) {
		this.registration_user_resp = registration_user_resp;
	}


}
