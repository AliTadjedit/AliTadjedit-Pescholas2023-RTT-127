package practice_Assignment_Polymorphism_Interfacepractice;

public class KidUser implements LibraryUser {

    int age;
    String bookType;

    KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;

    }

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("You have successfully registered under a Kids Account As a Kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
