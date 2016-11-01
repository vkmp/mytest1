package work.testmvc2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Firma {

	@Id
	@GeneratedValue
	private Long id;
	private String nazwaSymbol;
	private String nazwaSkrocona;
	private String nazwa;
	private Address adres;
	private String nip;
	private Contact telefon;
	private KontoBankowe kontoBankowe;
	
	private Dokument OCP;
	private Dokument wypisLicencji;
	
}
