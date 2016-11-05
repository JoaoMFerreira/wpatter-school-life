package org.wpattern.test.school.life.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpatter.school.life.discipline.DisciplineEntity;
import org.wpatter.school.life.discipline.DisciplineRepository;
import org.wpattern.test.school.life.utils.AbstractTest;

public class DisciplineRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(DisciplineRepositoryTest.class);

	@Autowired
	private DisciplineRepository discRepository;

	@Test
	public void findAllTest() {
		List<DisciplineEntity> users = this.discRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

}

