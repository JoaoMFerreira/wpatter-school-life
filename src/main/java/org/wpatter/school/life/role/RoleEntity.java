package org.wpatter.school.life.role;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_ROLE")
@AttributeOverride(name = "id", column = @Column(name = "id_role"))
public class RoleEntity extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2405909223761302053L;
	
	@NotNull
	@Size(min = 4, max = 45)
	@Column(name = "role_name", length = 45, nullable = false)
	private String role_name;
	
	public RoleEntity(){
		
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

}
