package work.testmvc2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pracownik {

	@Id
	@GeneratedValue
	private Long id;
	private String nazwaSkrocona;
	private String nazwisko;	
	private String imie;
	private Long stanowisko_id;
	private Long firma_id;
	private Date zatrudnionyOd;
	private Date dataUrodzenia;
	private String miejsceUrodzenia;
	private String pesel;
	private String nrDowodu;
	private String wydawcaDowodu;
	private Address adresZamieszkania;
	private String telefonPrywatny;
	private Long telefonSluzbowy_id;
	private Date dataWaznosciBadanLekarskich;
	private String uwagi;
	
	
	private Long zestaw_id;
	private String nrPaszportu;
	private Date dataWaznosciPaszportu;
	private Date dataWaznosciWizyRUS;
	private Date dataWaznosciWizyBY;
	private String nrPrawaJazdy;
	private Date dataWaznosciPrawaJazdy;
	
	
}
