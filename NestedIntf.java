package com.test;
interface Inf9{
	void add();
	//inside interface
	interface Inf10{
		void mul();
	}
	
}
class Impl7 implements Inf9.Inf10{
	@Override
	public void mul() {
		System.out.println("add()");
	}
	
	
}

public class NestedIntf {
	public static void main(String[] args) {
		Impl7 obj= new Impl7();
		obj.mul();
	}

}
