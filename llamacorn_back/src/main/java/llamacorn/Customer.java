package llamacorn;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
//@Table(name="CUSTOMER")
public class Customer {

	@Id
	//@Column(name="CUST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date creation;
	private String gender;
	//@Column(name="NAME")
	private String firstname;
	private String name;
	private String adress;
	private String zipcode;
	private String city;
	private String phonepro;
	private String cellphone;
	private String mail;
	private String notes;
	private boolean rlcvacc;
	private boolean rlmail;
	private String clientRef;
	private String vetRef;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="owner")
	//@JoinColumn(name="OWNER_ID")
	private List<Animal> animals;
	
	
    protected Customer() {}
    
    
	public void addAnimal(Animal animal){
		this.animals.add(animal);
		if(animal.getOwner()!= this){
			animal.setOwner(this);
		}
	}


    public Customer(String firstName, String name) {
        this.name = name;
        this.firstname = firstName;
    }

    public Customer(String firstName, String name, Animal animal) {
        this.name = name;
        this.firstname = firstName;
        this.addAnimal(animal);
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
		return firstname;
	}

	public void setLastname(String firstname) {
		this.firstname = firstname;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isRlcvacc() {
		return rlcvacc;
	}

	public void setRlcvacc(boolean rlcvacc) {
		this.rlcvacc = rlcvacc;
	}

	public boolean isRlmail() {
		return rlmail;
	}

	public void setRlmail(boolean rlmail) {
		this.rlmail = rlmail;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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
	
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstname='%s', name='%s']",
                id, firstname, name);
    }
	
	
}
