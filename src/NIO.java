import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NIO {
    //
    public static void main(String args[]) {
       // String fileName = "C:\\Users\\alita\\IdeaProjects\\PerScholas2023\\src\\testingFile.txt";
        
        //System.out.println(NIO.readFile("C:\\Users\\alita\\IdeaProjects\\PerScholas2023\\src\\testingFile.txt"));
        NIO.readFile("C:\\Users\\alita\\IdeaProjects\\PerScholas2023\\src\\cars.csv");
    }


    public static ArrayList<String[]> readFile(String fileName) {

               ArrayList<String[]> list = new ArrayList<String[]>();
        try {
            Scanner scanner = new Scanner(fileName);
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");
                list.add(line);
            }
            for (String[] line : list) {

                System.out.println("Car Name :" + line[0]);
                System.out.println("MPG :" + line[1]);
                System.out.println("Cylinder :" + line[2]);
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

      return list;


    }
}





































