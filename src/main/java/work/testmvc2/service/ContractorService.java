package work.testmvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.testmvc2.model.Address;
import work.testmvc2.model.Contractor;
import work.testmvc2.repository.ContractorRepository;

@Service
public class ContractorService {

	@Autowired
	private ContractorRepository contractorRepository;
	
	public Contractor addContractor() {
		
		Address address = new Address();
		address.setName("Jakas Nazwa Firmy Do Wysylki");
		address.setStreetName("ul.Koszykowa");
		address.setStreetNumber("157");
		address.setApartmentNumber("33B");
		address.setPostCode("00-100");
		address.setCity("Warszawa");
		address.setCountry("Polska");
		
		Contractor contractor = new Contractor();
		contractor.setName("Jakas Pelna Nazwa Firmy");
		contractor.setShortName("Jakas Firma");
		contractor.setAddress(address);
		contractor.setNIP("796-002-00-55");		
		
		contractorRepository.saveContractor(contractor);
		return contractor;
	}
}
