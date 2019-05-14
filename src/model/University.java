package model;
public class University {
	private String name;
	private String adress;
	private AcademicUnit root;
	public University(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
