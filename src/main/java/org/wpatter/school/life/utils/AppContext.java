package org.wpatter.school.life.utils;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // configuração do spring
@EnableAutoConfiguration // configurações automaticas do spring
@ComponentScan(basePackages = {"org.wpatter.school.life"}) // Pacote base
public class AppContext {

}
