package org.wpattern.test.school.life.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpatter.school.life.role.RoleEntity;
import org.wpatter.school.life.role.RoleRepository;
import org.wpattern.test.school.life.utils.AbstractTest;

public class RoleRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(RoleRepositoryTest.class);

	@Autowired
	private RoleRepository roleRepository;

	@Test
	public void findAllTest() {
		List<RoleEntity> users = this.roleRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

}

