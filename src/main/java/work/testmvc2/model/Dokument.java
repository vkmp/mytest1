package work.testmvc2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dokument {

	@Id
	@GeneratedValue
	private Long id;
	private String nazwa;
	private String numer;
	private Date dataWaznosci;
	
}
