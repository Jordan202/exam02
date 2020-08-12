package Ex2;

public class Department {
	String deptname;
	int id;
	String leapt;
	String location;
	public Department() {
		
	}
	
public Department(String deptname,int id ) {
	
	this.id=id;
	thos.deptname=deptname;
	
	System.out.println(id+deptname);
	}


public Department(String leapt,String location,int id) {
	
	this.leapt=leapt;
	this.location=location;
	this.id=id;
}

public void print() {
	
	System.out.println();
	
}

public  void main(String[]args) {
	
	Department ob=new Department();
	ob.print();
}}



