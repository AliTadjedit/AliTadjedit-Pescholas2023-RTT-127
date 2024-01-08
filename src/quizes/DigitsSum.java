package quizes;

public class DigitsSum {
    public static void main(String[] args) {
    int num=1289;
    int sum=0;
     sum =sum+num%10;

        //System.out.println(num);
     num=num/10;
        System.out.println(sum);
        System.out.println(num);
      // int total= DigitsSum.getDigitsSum(2345);
       // System.out.println(total);
    }
      /*  public static int getDigitsSum (int largeNumber){

            int sum = 0;
            while (largeNumber != 0) {
                sum = sum + largeNumber % 10;
                largeNumber = largeNumber / 10;
            }


            return sum;

        }*/
    }
