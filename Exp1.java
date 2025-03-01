package p1;

public class Exp1 {
	private int pin=175024;
	int phone= 98765432;
	protected int wifip= 1234;
public int citypin= 567790;

public void display() {
	System.out.println(pin);
	System.out.println(phone);
	System.out.println(wifip);
	System.out.println(citypin);
}
//MAIN
public static void main(String[] args) {
	Exp1 obj= new Exp1();
	obj.display();
	Exp2 obj1= new Exp2();
	obj1.display();
}

}

class Exp2 extends Exp1{
	public void display() {
		//System.out.println(pin);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}
}
