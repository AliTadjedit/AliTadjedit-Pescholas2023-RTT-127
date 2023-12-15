
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

    public class LearnArrays{


        public static void main(String[]args){

            //****************************Question1*******************************

            int []arr= new int[3];
            arr[0]=1;
            arr[1]=2;
            arr[2]=3;
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);

            //********************************Question2*********************

            int[] arr1 = {13, 5, 7, 68, 2};
            if(!(arr1.length%2==0)){
                System.out.println(arr1[arr1.length/2]);
            }else{
                int mid1=arr1[(arr1.length/2)-1];
                int mid2=arr1[(arr1.length/2)];
                System.out.println(mid1);
                System.out.println(mid2);
            }

            // ************************************************Question3*************************
            String[]arr2= {"red","green","bleu","yellow"};
            System.out.println("the lenght of arr2is :" + arr2.length);
            String []newArr2=arr2.clone();
            System.out.println(Arrays.toString(newArr2));


            //*************************************Question4**************

            int []arr3=new int[5];
            for(int i=0;i<arr3.length;i++){
                arr3[i]= i;
            }

            System.out.println(arr3[0]);
            System.out.println(arr3[arr3.length-1]);
            //System.out.println(arr3[arr3.length]);//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
            //arr3[5]=5;//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
            //System.out.println(arr3[5]);
            //****************************question5*****************************
            int []arr4=new int[5];
            for(int i=0;i<arr3.length;i++){
                arr4[i]= i;

            }System.out.println(Arrays.toString(arr4));

            //****************************question6*****************************
            int []arr5=new int[5];
            for(int i=0;i<arr3.length;i++){
                arr5[i]= i*2;

            } System.out.println(Arrays.toString(arr5));
            //****************************question7*****************************

            int [] myArr = {5,8,9,10,11,5};
            int midEl = (myArr.length-1)/2;// array index start with 0
            int j = midEl;
            if(myArr.length %2 ==0){
                myArr[j] = myArr[midEl+2];
                j++;
                midEl = midEl+2;
            }

            for(int i=midEl;i<myArr.length;i++){
                myArr[j] = myArr[i+1];
                j++;
            }
            System.out.print(myArr);

        }
    }


