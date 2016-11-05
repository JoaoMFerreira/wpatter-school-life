package org.wpatter.school.life.material;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_MATERIAL")
@AttributeOverride(name = "id", column = @Column(name = "id_disc"))
public class MaterialEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6225060090771126022L;

	@Column(name = "material", length = 255)
	private String material;

	public MaterialEntity() {

	}

	public MaterialEntity(String material) {
		super();
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
