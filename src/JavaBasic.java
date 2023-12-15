import java.text.DecimalFormat;

public class JavaBasic {






        public static void main(String[]args){
//__________________________________________________
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

            int t,m;
            t=5;
            m=10;
            int sum=t+m;
            System.out.println("the sum for the two int is : "+sum);

            //Q2
            double d=156.67;
            double d1=2356;
            double sum2=d+d1;
            System.out.println("the sum for the two doubles is : "+sum2);


            //Q3
            double z=285793.5;
            int i=34;

            //the sum var type should be double
            double sum3=z+i;
            System.out.println("the sum for the double and int is : "+sum2);

            //Question 4

            int i1, i2;
            i1=30;
            i2=90;
            int div=i2/i1;
            System.out.println("the div is : "+ div);
            // i2=90.5; //an error occurred saying incompatible type found :double required
            //correction: we need to convert the i2 variable to double type



            //Question 5
            double dou, doub;
            dou =4567.6;
            doub=64590.543;
            double divi=doub/dou;
            System.out.println("the div is : "+ divi);
            //cast the result to an integer
            int result =(int)divi;
            System.out.println("the div is : "+ result);

            //Question 6:
            int x,y;
            x=5;
            y=6;
            int q=y/x;
            System.out.println("the result of q is : "+q);
            double y1=y;
            q=(int)y1;
            System.out.println("the result of q after castiing is : "+q);


            //Question 7:

            final double PI = 3.1415926536;
            int radius=15;
            double length=PI * radius;
            System.out.println("the Circle Length is : "+ length);


            //Question 8:
            double coffee, cappuccino, espresso;

            coffee=2.99;
            cappuccino=6.25;
            espresso=2.75;
            double subtotal , totalSale;
            subtotal=(3*coffee)+(4*cappuccino)+(2*espresso);
            System.out.println("sales before Taxes is : "+ subtotal);
            final  double SALES_TAX=1.25;
            totalSale=subtotal*SALES_TAX;
            DecimalFormat decfor = new DecimalFormat("0.00");
            System.out.println("Sales after Taxes is : "+  decfor.format(totalSale));

        }

    }

