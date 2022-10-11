import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,ebob=1,ekok=1;

        Scanner input = new Scanner(System.in);

        System.out.println("n1 sayısını giriniz");
        n1=input.nextInt();

        System.out.println("n2 sayısını giriniz");
        n2=input.nextInt();

       for(int i=1;i<=n1;i++){

            if (n1 % i==0 && n2 % i==0) {
               ebob = i;
            }

        }
        System.out.println("ebob: "+ebob);


        for (int i = 1; i <=(n1*n2); i++){
            if (i % n1==0 && i % n2==0){
                ekok=i;
                System.out.println("ekok : "+ekok);
                break;
            }
        }

    }

}