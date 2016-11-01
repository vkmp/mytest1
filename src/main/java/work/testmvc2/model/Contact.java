package work.testmvc2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private Long id;
	private ContactType contactType;
	private String phoneNumber;
	
}
