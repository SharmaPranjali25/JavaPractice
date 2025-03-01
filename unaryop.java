//unary operators
class Exp5{
    public static void main(String[] args){
        int i=0;
        System.out.println(i++); //0
        System.out.println(i);//1
        System.out.println(i--);//1
        System.out.println(i); //0

        System.out.println(++i); //1
        System.out.println(--i);//0
        i+=20; //20
        System.out.println(i);
        i*=3; //60
        System.out.println(i);
    }
}