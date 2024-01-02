package practice_Assignment_Polymorphism_Interfacepractice;

import java.lang.reflect.AccessFlag;
import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {


        LibraryUser kidUser = new KidUser(10, "Kids");
        kidUser.registerAccount();
        kidUser.requestBook();


        LibraryUser adultUser = new AdultUser(23, "fiction");
        adultUser.registerAccount();
        adultUser.requestBook();


    }

}
