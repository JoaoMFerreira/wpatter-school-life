package org.wpattern.test.school.life.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpatter.school.life.grade.GradeEntity;
import org.wpatter.school.life.grade.GradeRepository;
import org.wpattern.test.school.life.utils.AbstractTest;

public class GradeRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(GradeRepositoryTest.class);

	@Autowired
	private GradeRepository gradeRepository;

	@Test
	public void findAllTest() {
		List<GradeEntity> users = this.gradeRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

}

