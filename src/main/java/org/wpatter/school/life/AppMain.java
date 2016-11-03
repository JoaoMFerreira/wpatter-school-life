package org.wpatter.school.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wpatter.school.life.utils.AppContex;

@SpringBootApplication
public class AppMain {

		public static void main(String[] args) {
			SpringApplication.run(AppContex.class, args); // Classe para subida do spring
		}
	
}
