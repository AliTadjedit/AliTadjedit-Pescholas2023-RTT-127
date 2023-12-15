import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
    int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
    int sum = 0;
    Double average;

    // access all elements using for each loop
    // add each element in sum
        for (int number: numbers) {
        sum += number; //addition number0+number1+number2........
        int   sum1=sum++;

    }

    // get the total number of elements
    int arrayLength = numbers.length;

    // calculate the average
    // convert the average from int to double
    average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
       System.out.println("Average = " + average);



    //**********************insert Array********************************


    int i, element;
    int[] arr = new int[11];
    Scanner scan = new Scanner(System.in);

            System.out.print("Enter 10 Elements: ");
    //System.out.print("array size is: "+ arr.length);

            for(i=0; i<10; i++)
    arr[i] = scan.nextInt();

            System.out.print("Enter an Element to Insert: ");
    element = scan.nextInt();
    // arr[arr.length-1] = element;
    arr[i] = element;

            System.out.println("\nNow the new array is: ");
            for(i=0; i<11; i++)
            System.out.print(arr[i]+ " ");
}
    }

