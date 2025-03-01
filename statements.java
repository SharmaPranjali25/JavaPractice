import java.util.Scanner;
class Exp6{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Most-Elligible for voter id");
        }
        else if(age==18){
            System.out.println("just eligible for voter id");
        }
        else{
            System.out.println("not eligible for voter id");
        }
    }
}