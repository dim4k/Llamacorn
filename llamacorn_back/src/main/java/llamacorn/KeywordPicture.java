package llamacorn;

import java.util.List;

import javax.persistence.*;

public class KeywordPicture {

	@Id
	@Column(name="KEYP_ID")
	private long id;
	private String keyword;
	
	@ManyToMany(mappedBy="keyword_picture")
	private List<Picture> pictures;
	
	public KeywordPicture(long id, String keyword) {
		super();
		this.id = id;
		this.keyword = keyword;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
