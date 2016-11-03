package org.wpatter.school.life;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpatter.school.life.utils.BaseEntity;

@Entity
@Table(name = "CD_ROLE")
@AttributeOverride(name = "id", column = @Column(name = "id_role"))
public class RoleEntity extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2405909223761302053L;
	
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
