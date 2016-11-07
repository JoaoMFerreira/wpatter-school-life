package org.wpatter.school.life.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpatter.school.life.utils.GenericService;
import org.wpatter.school.life.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PUBLIC_ROOT_PATH)
public class UserService extends GenericService<UserEntity, Long> {
	
}
