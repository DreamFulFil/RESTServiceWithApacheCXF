package dream.blog.practice.rest.service.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author George-Chou
 * 
 * 從Servlet 3.0開始，專案內有實作ServletContainerInitializer的類別的話，
 * 就等同於傳統的Java Web App在web.xml裡面對Web Container作設定。
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
