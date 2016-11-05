package org.wpatter.school.life.discipline;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_DISC")
@AttributeOverride(name = "id", column = @Column(name = "id_disc"))
public class DisciplineEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123668369075190631L;

	public DisciplineEntity() {

	}

	public DisciplineEntity(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@NotNull
	@Size(min = 4, max = 128)
	@Column(name = "name", length = 128, nullable = false)
	private String name;

	@NotNull
	@Size(min = 4, max = 255)
	@Column(name = "description", length = 255, nullable = false)
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
