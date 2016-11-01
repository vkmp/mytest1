package work.testmvc2.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Kontrahenci")
@SecondaryTable(name = "Adresy", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_kontrahenta"))
public class Contractor {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nazwa", columnDefinition = "VARCHAR(255) NOT NULL")
	private String name;
	
	@Column(name = "nazwa_skrocona", columnDefinition = "VARCHAR(120)")
	private String shortName;

	@Embedded
	@Column(name = "adres", columnDefinition = "VARCHAR(255)")
	private Address address;

	@Column(name = "nip", columnDefinition = "VARCHAR(20)")
	private String NIP;

	
	// private Contact contact;

	// private Address shippingAddress;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getNIP() {
		return NIP;
	}

	public void setNIP(String nIP) {
		NIP = nIP;
	}


}
