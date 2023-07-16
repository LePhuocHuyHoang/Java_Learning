package Test;
import main.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();

        SanitationWorker sanitationWorker = new SanitationWorker("Võ Văn Hậu","Sanitation Worker",20,14);
        Receptionist receptionist = new Receptionist("Lê Thị Thảo","Receptionist",14,18);
        Manager manager = new Manager("Lê Phước Huy Hoàng","Manager", 31,2);
        Engineer softWareEngineer = new Engineer("La Văn Long","Software Engineer",25,5);
        Engineer netWorkEnggineer = new Engineer("Nguyễn Văn Hải","Network Engineer",7,6);
        Accountant accountant = new Accountant("Lí Thị Bầu","Accountant",14,1);

        employeeList.addEmployee(softWareEngineer);
        employeeList.addEmployee(sanitationWorker);
        employeeList.addEmployee(receptionist);
        employeeList.addEmployee(manager);
        employeeList.addEmployee(netWorkEnggineer);
        employeeList.addEmployee(accountant);
        int choice = 0;
        do {
            System.out.println("------------------");
            System.out.println("YOUR MINISTRY ? ");
            System.out.println(
                    "1.	Manager. \n"
                            + "2.	Accountant. \n"
                            + "0.  Exit the program."
            );
            choice = input.nextInt();
            input.nextLine();
            if(choice == 1){
                do {
                    System.out.println("--------------");
                    System.out.println("YOU WANT?");
                    System.out.println(
                            "1.	Read list salary. \n"
                                    + "2.	Read highest salary. \n"
                                    + "0.  Exit the program."
                    );
                    choice = input.nextInt();
                    input.nextLine();
                    if (choice == 1){
                        employeeList.readSalary();
                    } else if (choice == 2) {
                        employeeList.readHighestSalary();
                        employeeList.checkNullArray();
                    }
                }while (choice != 0);
            }
            else if (choice == 2) {
                do {
                    System.out.println("--------------");
                    System.out.println("YOU WANT?");
                    System.out.println(
                            "1.	Read list salary. \n"
                                    + "0.  Exit the program."
                    );
                    choice = input.nextInt();
                    input.nextLine();
                    if (choice == 1){
                        employeeList.readSalary();
                    }
                }while (choice != 0);
            }
        }while (choice != 0);
    }
}
