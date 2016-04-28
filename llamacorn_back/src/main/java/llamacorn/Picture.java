package llamacorn;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Picture {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date date;
	private String title;
	private String description;

	public Picture(long id, Date date, String title, String description) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.description = description;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
