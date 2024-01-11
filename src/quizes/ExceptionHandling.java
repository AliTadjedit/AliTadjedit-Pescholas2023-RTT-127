package quizes;

import java.util.Scanner;

public class ExceptionHandling extends Throwable {
public static void main(String[]args) throws Exception {
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int p=scanner.nextInt();
    int total;

    if (n==0 && p==0)
    { throw new Exception("Java.lang.Exception: n and p should not be zero.");}
    else if(n<0||p<0){
        throw new Exception("java.lang.Exception: n or p should not be negative.");
    }else{
        try{
            total=(int)Math.pow(n,p);
            System.out.println(total);
        } catch(Exception e){
            System.out.println(e);
        }
    }}}


