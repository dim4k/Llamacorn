package llamacorn.model;

import javax.persistence.*;
@Entity
public class Requirement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String speciality;
	private String posology;
	private boolean renouvautor; //????????????????????????????
	private String vetopharma;


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
