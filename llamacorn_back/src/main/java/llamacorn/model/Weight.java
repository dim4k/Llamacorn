package llamacorn.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Weight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date date;
	private int weight;
	private String comment;
	
	public Weight(long id, Date date, int weight, String comment) {
		super();
		this.id = id;
		this.date = date;
		this.weight = weight;
		this.comment = comment;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
