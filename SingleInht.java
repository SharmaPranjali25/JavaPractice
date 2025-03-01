package p1;
class ParentA{
	int id=10;
	String name="Pranjali";
	public void userdet() {
		System.out.println("ID: "+id+"Name: "+name);
	}
}
class ChildB extends ParentA{
	String city="Mandi";
	public void stdInfo() {
		System.out.println("ID:"+id+" Name:"+name+" City: "+city);
	}
	
}
//multi-level inhertance
class ChildC extends ChildB{
	public void  method3() {
		System.out.println("Bottom -most class ");
	}
	

public class SingleInht {
	public static void main(String[] args) {
		ChildB obj1= new ChildB();
		obj1.stdInfo();
		ChildC obj2= new ChildC();
		obj2.method3();
		
	}
	
}

}
