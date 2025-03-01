import java.util.Scanner;
class Swistat{
  //puclic int add(injt x , int y)
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter option selected: ");
        String opt= sc.nextLine();
        System.out.println("Enter x: ");
        int x= sc.nextInt();
        System.out.println("Enter y: ");
        int y= sc.nextInt();

        switch(opt){
            case "+":  
            System.out.println(x+y);
            break;
            case "-": 
            System.out.println(x-y);
            break;
            case "*": 
            System.out.println(x*y);
            break;
            default:
            System.out.println("No statement");

        }
    }
}