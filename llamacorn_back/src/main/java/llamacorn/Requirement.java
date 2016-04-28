package llamacorn;

import javax.persistence.*;

public class Requirement {
	
	@Id
	@Column(name="REQ_ID")
	private long id;
	private String speciality;
	private String posology;
	private boolean renouvautor; //????????????????????????????
	private String vetopharma;
	private Contributor contributor;
		
	//@JoinColumn(name="OWNER_ID")	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="requirement")
	private Delivery delivery;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isRenouvautor() {
		return renouvautor;
	}

	public void setRenouvautor(boolean renouvautor) {
		this.renouvautor = renouvautor;
	}

	public Contributor getContributor() {
		return contributor;
	}

	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getPosology() {
		return posology;
	}

	public void setPosology(String posology) {
		this.posology = posology;
	}
	

	public String getVetopharma() {
		return vetopharma;
	}

	public void setVetopharma(String vetopharma) {
		this.vetopharma = vetopharma;
	}

	
}
