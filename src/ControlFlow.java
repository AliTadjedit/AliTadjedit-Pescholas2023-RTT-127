



import java.util.Iterator;
import java.util.Scanner;

    public class ControlFlow {

        public static void main(String[] args) {

            int x;
            //x=7;
            x = 15;
            if (x < 10) {
                System.out.println("less than 10");
            }

            //****************************Question2*********************
            int x1;
            // x1=7;
            x1 = 15;
            if (x1 < 10) {
                System.out.println("less than 10");
            } else if (x1 > 10) {
                System.out.println("greater than 10");

            }

            //****************************Question3*********************

            int x2;
            //x2=15;
            x2 = 50;
            if (x2 < 10) {
                System.out.println("less than 10");
            } else if (x2 > 10 && x2 < 20) {
                System.out.println("Between 10 and 20");
            } else if (x2 >= 20) {
                System.out.println("Greater than or equal to 20");
            }

            //****************************Question4*********************
            int x3;
            //x3=15;
            x3 = 5;

            if (x3 < 10 || x3 > 20) {
                System.out.println("Out of range");
            } else if (x3 >= 10 && x3 >= 20) {
                System.out.println("In range");

            }

            //****************************Question5*********************
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your score: ");
            double score = scanner.nextDouble();
            if (score >= 90 && score <= 100) {
                System.out.println("your score is A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("your score is B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("your score is C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("your score is D");
            } else if (score > 0 && score < 60) {
                System.out.println("your score is F");
            } else {
                System.out.println("Out Of Range");
            }

            //****************************Question6*********************

            System.out.println("Please enter the number of the week day");
            int dayNum = scanner.nextInt();

            switch (dayNum) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Out Of Range");

            }
            //****************************Question7*********************
            System.out.println("Please enter your status");
            String status = scanner.next();
            System.out.println("Please enter your income");
            double income = scanner.nextDouble();

            if (status.equalsIgnoreCase("Single")) {
                if (income <= 8350) {
                    System.out.println("you have pay 10% of Taxes");
                } else if (income <= 33950) {
                    System.out.println("you have pay 15% of Taxes");
                } else if (income <= 82250) {
                    System.out.println("you have pay 25% of Taxes");
                } else if (income <= 171550) {
                    System.out.println("you have pay 28% of Taxes");
                } else if (income <= 372950) {
                    System.out.println("you have pay 33% of Taxes");
                } else if (income >= 372951) {
                    System.out.println("you have pay 35% of Taxes");
                }
            } else if (status.equalsIgnoreCase("MarriedFillingJointly")) {
                if (income <= 16700) {
                    System.out.println("you have pay 10% of Taxes");
                } else if (income <= 67900) {
                    System.out.println("you have pay 15% of Taxes");
                } else if (income <= 137050) {
                    System.out.println("you have pay 25% of Taxes");
                } else if (income <= 208850) {
                    System.out.println("you have pay 28% of Taxes");
                } else if (income >= 372950) {
                    System.out.println("you have pay 33% of Taxes");
                } else {
                    System.out.println("you have pay 35% of Taxes");
                }

            } else if (status.equalsIgnoreCase("MarriedFillingSeparately")) {
                if (income <= 8350) {
                    System.out.println("you have pay 10% of Taxes");
                } else if (income <= 33950) {
                    System.out.println("you have pay 15% of Taxes");
                } else if (income <= 68525) {
                    System.out.println("you have pay 25% of Taxes");
                } else if (income <= 104475) {
                    System.out.println("you have pay 28% of Taxes");
                } else if (income >= 186475) {
                    System.out.println("you have pay 33% of Taxes");
                } else {
                    System.out.println("you have pay 35% of Taxes");
                }
            }
            else if (status.equalsIgnoreCase("HaadOfHouseHold")) {
                if (income <= 11950) {
                    System.out.println("you have pay 10% of Taxes");
                } else if (income <= 45500) {
                    System.out.println("you have pay 15% of Taxes");
                } else if (income <= 117450) {
                    System.out.println("you have pay 25% of Taxes");
                } else if (income <= 190200) {
                    System.out.println("you have pay 28% of Taxes");
                } else if (income >= 372950) {
                    System.out.println("you have pay 33% of Taxes");
                } else {
                    System.out.println("you have pay 35% of Taxes");
                }
            }
        }
    }

