package llamacorn;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

public class Picture {

	
	@Id
	@Column(name="PIC_ID")
	private long id;
	private Date date;
	private String title;
	private String description;
	private Contributor contributor;
	
    @ManyToMany
    @JoinTable(
	   name="PICT_KEY",
	   joinColumns=@JoinColumn(name="PICT_ID", referencedColumnName="PIC_ID"),
	   inverseJoinColumns=@JoinColumn(name="KEYP_ID", referencedColumnName="KEYP_ID"))
	private List<KeywordPicture> keyword;

	//@JoinColumn(name="OWNER_ID")	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="picture")
	private Delivery delivery;
		
	public Picture(long id, Date date, String title, String description, Contributor contributor) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.description = description;
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

	public Contributor getContributor() {
		return contributor;
	}

	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}
	
	
	
}
