import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(in);
        out.print("n1 sayisi giriniz : ");
        int n1 = inp.nextInt();

        out.println("n2 sayisi giriniz : ");
        int n2 = inp.nextInt();

        for (int i = 1; i <= (n1*n2); i++){
            if(i%n1 == 0 && i%n2 == 0 ){
                out.println(i);
                break;
            }

        }
        /*
        int ebob = 1;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                out.println(i);
                ebob = i;

            }
        }
        out.println("==========");
        for(int k = n1; k >= 1; k-- ){
            if (n1%k==0 && n2%k==0){
                ebob = k;
                out.println(ebob);
                break;
            }
        }

         */
    }
}

