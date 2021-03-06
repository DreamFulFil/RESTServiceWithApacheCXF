package dream.blog.practice.rest.service.config;

import java.util.Arrays;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import dream.blog.practice.rest.service.resource.CarResource;
import dream.blog.practice.rest.service.resource.StudentResource;
import dream.blog.practice.rest.service.resource.impl.CarResourceImpl;
import dream.blog.practice.rest.service.resource.impl.StudentResourceImpl;

@Configuration
@ComponentScan(basePackages = { "dream.blog.practice.rest.service" }, excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })

// This class is for ContextLoader,
// which loads beans other than web components such as controller, view
// resolvers,...etc.
public class RootConfig {

	@Bean
	public SpringBus cxf() {   
		SpringBus springBus = new SpringBus();
	    return springBus;
	}
	
	@Bean
	public StudentResource studentResource() {
		return new StudentResourceImpl();
	}
	
	@Bean
	public CarResource carResource() {
		return new CarResourceImpl();
	}
	
	@Bean
	public JacksonJsonProvider jsonProvider(){
		return new JacksonJsonProvider();
	}

	@Bean
	public Server server() {
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
		factory.setBus(cxf());
		factory.setAddress("/v1");
		factory.setServiceBeans(Arrays.asList(studentResource(), carResource()));
		factory.setProvider(jsonProvider());
		return factory.create();
	}
}
