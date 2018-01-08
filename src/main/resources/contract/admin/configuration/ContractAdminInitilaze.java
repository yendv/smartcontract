/**
 * 
 */
package admin.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author YenDV
 *
 */
public class ContractAdminInitilaze extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { HibernateConfigure.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ContractAdminConfigruration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
