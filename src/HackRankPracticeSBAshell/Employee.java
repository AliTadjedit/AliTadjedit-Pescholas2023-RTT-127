package HackRankPracticeSBAshell;

public class Employee implements EmployeeInterface {


    int[] empIDs = new int[11];

    public Employee() {
        for (int i = 0; i < empIDs.length; i++) {
            empIDs[i] = 1;
        }
    }


    @Override
    public void calculateAvgAge(int[] age) {
        // TODO Auto-generated method stub
        empIDs = age;
        System.out.println("A new JIRA team has been formed");
        for (int i = 0; i < empIDs.length; i++) {
            System.out.println(empIDs[i] + " ");
            double sum = 0;
            for (int e : empIDs) {
                sum += e;
                sum /= (empIDs.length);
                System.out.println("\n The average age of the Jira team is %.2f\n" + sum);
            }
        }

    }

    @Override
    public void promoteEmployee(int id) {
        // TODO Auto-generated method stub
        if (empIDs[id - 1] > (-1)) {
            System.out.println("Employee with id:%d hasbeen promoted\n" + id);
            empIDs[id - 1] = -1;
        } else {
            System.out.println("Employee %d has already been promoted\n" + id);
        }
    }
}