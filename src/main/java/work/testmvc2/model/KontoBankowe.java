package work.testmvc2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KontoBankowe {

	@Id
	@GeneratedValue
	private Long id;
	private String nazwaBanku;
	private String nrKonta;
	private String SWIFT;
	private KodWaluty waluta;
	
}
