package llamacorn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
//@Table(name="ANIMAL")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	//@Column(name="CREATION")
	private Date creation;
	//@Column(name="NAME")
	private String name;
	private String species;
	private String race;
	private String color;
	private String birthdate;
	private String certainty;//voir lib java.time
	private String gender;
	private boolean sterilization;
	private int chip;
	private int tattoo;
	private String affix;
	private boolean repro;
	private String note;
	private boolean dead;
	
	@ManyToOne(optional = false)
	private Customer owner;

	protected Animal() {}

    public Animal(String name, Customer owner) {
        this.name = name;
        this.owner = owner;
    }
    
    public Animal(String name) {
        this.name = name;
    }
    
    
    public Customer getOwner() {
		return this.owner;
	}
    
    public void setOwner(Customer customer) {
        this.owner = customer;
        if (!customer.getAnimals().contains(this)) { // warning this may cause performance issues if you have a large data set since this operation is O(n)
        	customer.getAnimals().add(this);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getCertainty() {
		return certainty;
	}

	public void setCertainty(String certainty) {
		this.certainty = certainty;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isSterilization() {
		return sterilization;
	}

	public void setSterilization(boolean sterilization) {
		this.sterilization = sterilization;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	public int getTattoo() {
		return tattoo;
	}

	public void setTattoo(int tattoo) {
		this.tattoo = tattoo;
	}

	public String getAffix() {
		return affix;
	}

	public void setAffix(String affix) {
		this.affix = affix;
	}

	public boolean isRepro() {
		return repro;
	}

	public void setRepro(boolean repro) {
		this.repro = repro;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
    @Override
    public String toString() {
        return String.format(
                "Animal[id=%d, name='%s']",
                id, name);
    }
	
	
	
}
