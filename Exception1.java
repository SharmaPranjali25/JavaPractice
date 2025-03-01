package comp.exp;

public class Exception1 {
	public static void main(String[] args) {
		try {
		System.out.println("Hello");
		//System.out.println(10/0);//error 
		System.out.println(10/5);
		System.out.println("Java");
		
		int[] arr= {10,20,30,40};
		System.out.println(arr[6]);
		
		//String strings=null;
		String str="Java";
		System.out.println(str.charAt(6));
		//System.out.println(str.charAt(6));  //out of bond exception
		System.out.println("end");
		}
		//CATCH
		catch(ArithmeticException ae) {
			System.out.println("Don't Enter 0 in denominator");
		}
		catch(ArrayIndexOutOfBoundsException ie) {
			System.out.println("check array size");
		}
		catch(StringIndexOutOfBoundsException sie) {
			System.out.println("check string length");
		}
		
		catch(IndexOutOfBoundsException ie) {
			System.out.println("size of indexes");
		}
		
		catch(Exception e)
		{
			System.out.println("Check your inputs");
		}
	}

}
