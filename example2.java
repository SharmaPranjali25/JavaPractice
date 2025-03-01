import java.net.SocketPermission;

class Exp2{
    //1. method taking the arguments and returning the value
    public int method1(int x, String y){
        System.out.println("method 1");
        return 10;

    }
    //2 method not taking the arguments and not returning the value
    public void method2(){
        System.out.println("method 2");
    }
    //3 taking arguments with no return of values
    public void method3(String name){
        System.out.println("method3");

    }
// 4 method not taking arguments but returnig the value
public String method4(){
    System.out.println("method4");
    return "output";
}

    public static void main(String[] args){
        Exp2 obj= new Exp2();
        System.out.println(obj.method1(10,"one method"));
        obj.method2();
        obj.method3("three method");
        System.out.println(obj.method4());

    }
}