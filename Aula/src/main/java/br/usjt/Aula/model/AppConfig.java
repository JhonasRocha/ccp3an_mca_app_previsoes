package br.usjt.Aula.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
@Bean

@Override
public void addInterceptors(InterceptorRegistry registry) {
 registry.addInterceptor(
 new LoginInterceptor()).
 addPathPatterns("/**").
 excludePathPatterns("/login", "/", "/fazerLogin");
}
}

