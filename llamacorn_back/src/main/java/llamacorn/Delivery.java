package llamacorn;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

public class Delivery {
	
	@Id
	@Column(name="DELI_ID")
	private long id;
	private Date consdate;
	private String motif;
	private String notes;
	private String temperature;
	private String report;
	private String recommandations;
	private Contributor contributor;
	

	@OneToMany(fetch=FetchType.LAZY, mappedBy="delivery")
	//@JoinColumn(name="DELI_ID")
	private List<Requirement> requirements;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="delivery")
	//@JoinColumn(name="DELI_ID")
	private List<Picture> pictures;
	
	public Delivery(long id, Date consdate, String motif, String notes, String temperature, String report,
			String recommandations, Contributor contributor) {
		super();
		this.id = id;
		this.consdate = consdate;
		this.motif = motif;
		this.notes = notes;
		this.temperature = temperature;
		this.report = report;
		this.recommandations = recommandations;
		this.contributor = contributor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getConsdate() {
		return consdate;
	}

	public void setConsdate(Date consdate) {
		this.consdate = consdate;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
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

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getRecommandations() {
		return recommandations;
	}

	public void setRecommandations(String recommandations) {
		this.recommandations = recommandations;
	}

	public Contributor getContributor() {
		return contributor;
	}

	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}
	
	
	
}
