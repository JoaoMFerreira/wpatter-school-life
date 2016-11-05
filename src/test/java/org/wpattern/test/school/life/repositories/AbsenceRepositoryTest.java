package org.wpattern.test.school.life.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpatter.school.life.absence.AbsenceEntity;
import org.wpatter.school.life.absence.AbsenceRepository;
import org.wpattern.test.school.life.utils.AbstractTest;

public class AbsenceRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(AbsenceRepositoryTest.class);

	@Autowired
	private AbsenceRepository absenceRepository;

	@Test
	public void findAllTest() {
		List<AbsenceEntity> users = this.absenceRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

}

