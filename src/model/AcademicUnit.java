package model;


public class AcademicUnit implements Comparable<AcademicUnit>{
	
	private String name;
	private int code;
	private String director;
	private AcademicUnit right;
	private AcademicUnit left;
	
	public AcademicUnit(String name, int code, String director) {
		this.name = name;
		this.code = code;
		this.director = director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public AcademicUnit getRight() {
		return right;
	}

	public void setRight(AcademicUnit right) {
		this.right = right;
	}

	public AcademicUnit getLeft() {
		return left;
	}

	public void setLeft(AcademicUnit left) {
		this.left = left;
	}


	@Override
	public int compareTo(AcademicUnit o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
