class Exp8{
    public static void main(String[] args){
        int age= 22;
        int wt=60;
        int ht=172;
        if(age>=22){
            if(wt>=55 && wt<=65){
                if(ht>=170){
                    System.out.println("submit application is successful");

                }
                else{
                    System.out.println("Ht not matching");
                }

            }
            else{
                System.out.println("Wt is not matching");
            }

        }else{
            System.out.println("age not matching");
        }
    }
}