package dream.blog.practice.rest.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(
		basePackages = { "dream.blog.practice.rest.service" }, 
		excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })

//This class is for ContextLoader, 
//which loads beans other than web components such as controller, view resolvers,...etc.
public class RootConfig {

	
}
