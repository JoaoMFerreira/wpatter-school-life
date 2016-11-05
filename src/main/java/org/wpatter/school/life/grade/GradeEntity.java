package org.wpatter.school.life.grade;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_GRADE")
@AttributeOverride(name = "id", column = @Column(name = "id_grade"))
public class GradeEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8009467240830377056L;

	@Column(name = "id_disc", length = 11, nullable = false)
	private Long id_disc;

	@Column(name = "registration_user", length = 11, nullable = false)
	private Long registration_user;

	@Column(name = "value")
	private double value;

	@Column(name = "semester")
	private String semester;

	public GradeEntity() {
	
	}

	public GradeEntity(Long id_disc, Long registration_user, double value,
			String semester) {
		super();
		this.id_disc = id_disc;
		this.registration_user = registration_user;
		this.value = value;
		this.semester = semester;
	}

	
	
	public Long getId_disc() {
		return id_disc;
	}

	public void setId_disc(Long id_disc) {
		this.id_disc = id_disc;
	}

	public Long getRegistration_user() {
		return registration_user;
	}

	public void setRegistration_user(Long registration_user) {
		this.registration_user = registration_user;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}


}
