package work.testmvc2.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import work.testmvc2.service.ContractorService;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
		
		ContractorService contractorService = context.getBean(ContractorService.class);
		contractorService.addContractor();

		
		

	}

}
