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
	
	public void addAcademyUnit(String n, int c, String d){
		  AcademicUnit au = new AcademicUnit(n, c, d);

		  if(root==null){
			root = au;
		  }else{
		     AcademicUnit current = root;
		     boolean added = false;
		      
		     while(!added){
		           
		           if(au.compareTo(current) > 0){
		               if(current.getRight() == null){
		                  current.setRight(au);
		                  added = true;
		               }else{
		 	          current = current.getRight();
		              }
		           }else{
				if(current.getLeft() == null){
		                  current.setLeft(au);
		                  added = true;
		               }else{
		 	          current = current.getLeft();
		               }
			   } 
		      }
		  }
		}
	public AcademicUnit search(int c) {
		return null;
	}
	
	public void delete(int c) {
		
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

	public AcademicUnit getRoot() {
		return root;
	}

	public void setRoot(AcademicUnit root) {
		this.root = root;
	}
	
}
