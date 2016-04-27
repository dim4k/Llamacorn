package llamacorn;

import javax.persistence.*;

public class Requirement {
	
	@Id
	@Column(name="REQ_ID")
	private long id;
	private String speciality;
	private String posology;
	private String renouvautor; //????????????????????????????
	private String vetopharma;
	
	public Requirement(long id, String speciality, String posology, String renouvautor, String vetopharma) {
		super();
		this.id = id;
		this.speciality = speciality;
		this.posology = posology;
		this.renouvautor = renouvautor;
		this.vetopharma = vetopharma;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getRenouvautor() {
		return renouvautor;
	}

	public void setRenouvautor(String renouvautor) {
		this.renouvautor = renouvautor;
	}

	public String getVetopharma() {
		return vetopharma;
	}

	public void setVetopharma(String vetopharma) {
		this.vetopharma = vetopharma;
	}

	
}
