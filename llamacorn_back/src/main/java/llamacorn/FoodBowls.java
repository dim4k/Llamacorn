package llamacorn;

import java.util.Date;

import javax.persistence.*;

@Entity
public class FoodBowls {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date date;
	private String aliment;
	
	public FoodBowls(long id, Date date, String aliment) {
		super();
		this.id = id;
		this.date = date;
		this.aliment = aliment;
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
	
	
	
	
	
}
