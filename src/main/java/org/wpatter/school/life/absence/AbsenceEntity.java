package org.wpatter.school.life.absence;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_ABSENCE")
@AttributeOverride(name = "id", column = @Column(name = "id_absence"))
public class AbsenceEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8009467280830377056L;

	public AbsenceEntity() {

	}

	public AbsenceEntity(Long id_disc, Long registration_user,
			Date absenceDate, String semester) {
		super();
		this.id_disc = id_disc;
		this.registration_user = registration_user;
		this.absenceDate = absenceDate;
	}

	@NotNull
	@Column(name = "id_disc", length = 11, nullable = false)
	private Long id_disc;

	@NotNull
	@Column(name = "registration_user", length = 11, nullable = false)
	private Long registration_user;

	@NotNull
	@Column(name = "absence_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date absenceDate;

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

	public Date getAbsenceDate() {
		return absenceDate;
	}

	public void setAbsenceDate(Date absenceDate) {
		this.absenceDate = absenceDate;
	}

}
