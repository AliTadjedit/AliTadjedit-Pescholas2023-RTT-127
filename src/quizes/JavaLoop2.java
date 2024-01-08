package quizes;

import java.util.Scanner;

public class JavaLoop2 {


    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int a= scanner.nextByte();
            int b= scanner.nextInt();
            int t=scanner.nextInt();

            for(int j=0;j<t;j++){
                a+=(int)Math.pow(2,j)*b;
                System.out.print(a+ " ");
            }
        }
        System.out.println();
    }
}
