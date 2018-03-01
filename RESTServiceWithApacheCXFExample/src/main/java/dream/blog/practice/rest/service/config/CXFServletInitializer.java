package dream.blog.practice.rest.service.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;

public class CXFServletInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException{
		Dynamic servlet = container.addServlet("cxfServlet", CXFServlet.class);
		servlet.addMapping("/rest/api/*");
		servlet.setLoadOnStartup(1);
	}

}
