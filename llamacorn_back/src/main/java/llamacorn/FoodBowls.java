package llamacorn;

import java.util.Date;

import javax.persistence.*;

public class FoodBowls {

	@Id
	@Column(name="FOBL_ID")
	private long id;
	private Date date;
	private String aliment;
	private Contributor contributor;
	
	public FoodBowls(long id, Date date, String aliment, Contributor contributor) {
		super();
		this.id = id;
		this.date = date;
		this.aliment = aliment;
		this.contributor = contributor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAliment() {
		return aliment;
	}

	public void setAliment(String aliment) {
		this.aliment = aliment;
	}

	public Contributor getContributor() {
		return contributor;
	}

	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}
	
	
	
	
	
}
