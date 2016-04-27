package llamacorn;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
public class Customer {

	@Id
	@Column(name="CUST_ID")
	private long id;
	private Date creation;
	private String gender;
	private String lastname;
	private String name;
	private String adress;
	private String zipcode;
	private String city;
	private String phonepro;
	private String cellphone;
	private String mail;
	private String notes;
	private Date rlcvacc;
	private Date rlmail;
	private String clientRef;
	private String vetRef;
	
	@OneToMany(mappedBy="customer")
	private List<Animal> animals;

	public void addAnimal(Animal animal){
		this.animals.add(animal);
		if(animal.getOwner()!= this){
			animal.setOwner(this);
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhonepro() {
		return phonepro;
	}

	public void setPhonepro(String phonepro) {
		this.phonepro = phonepro;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getRlcvacc() {
		return rlcvacc;
	}

	public void setRlcvacc(Date rlcvacc) {
		this.rlcvacc = rlcvacc;
	}

	public Date getRlmail() {
		return rlmail;
	}

	public void setRlmail(Date rlmail) {
		this.rlmail = rlmail;
	}

	public String getClientRef() {
		return clientRef;
	}

	public void setClientRef(String clientRef) {
		this.clientRef = clientRef;
	}

	public String getVetRef() {
		return vetRef;
	}

	public void setVetRef(String vetRef) {
		this.vetRef = vetRef;
	}

	public List<Animal> getAnimals() {
		return animals;
	}
	
	
}
