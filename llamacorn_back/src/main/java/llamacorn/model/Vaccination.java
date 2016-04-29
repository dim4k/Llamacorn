package llamacorn.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Vaccination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date datevacc;
	private String vaccin;
	private String notes;
	private String temperature;//controle saisie num mais stock string
	private String consvacc;
	private String cerfa;
	private String type;
	private String labo;
	private String cerfa1; //première injection du vaccin
	private Date date1;
	private String type1;
	private String lot;
	
	
	public Vaccination(long id, Date datevacc, String vaccin, String notes, String temperature,
			String consvacc, String cerfa, String type, String labo, String cerfa1,
			Date date1, String type1, String lot) {
		super();
		this.id = id;
		this.datevacc = datevacc;
		this.vaccin = vaccin;
		this.notes = notes;
		this.temperature = temperature;
		this.consvacc = consvacc;
		this.cerfa = cerfa;
		this.type = type;
		this.labo = labo;
		this.cerfa1 = cerfa1;
		this.date1 = date1;
		this.type1 = type1;
		this.lot = lot;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDatevacc() {
		return datevacc;
	}
	public void setDatevacc(Date datevacc) {
		this.datevacc = datevacc;
	}
	public String getVaccin() {
		return vaccin;
	}
	public void setVaccin(String vaccin) {
		this.vaccin = vaccin;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getConsvacc() {
		return consvacc;
	}
	public void setConsvacc(String consvacc) {
		this.consvacc = consvacc;
	}
	public String getCerfa() {
		return cerfa;
	}
	public void setCerfa(String cerfa) {
		this.cerfa = cerfa;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabo() {
		return labo;
	}
	public void setLabo(String labo) {
		this.labo = labo;
	}
	public String getCerfa1() {
		return cerfa1;
	}
	public void setCerfa1(String cerfa1) {
		this.cerfa1 = cerfa1;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	
	
	

}
