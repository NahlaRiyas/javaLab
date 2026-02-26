import java.util.Scanner;

class Employee {
	int eNo;
	String eName;
	double eSalary;

	void readData(Scanner sc) {
		System.out.print("Enter Employee Number: ");
		eNo = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Name: ");
                eName = sc.nextLine();

		System.out.print("Enter employee salary:");
		eSalary=sc.nextDouble();
	}

	void displayData() {
		System.out.println("Employee Number :" + eNo);
		System.out.println("Employee name : " + eName);
		System.out.println("Employee salary : " + eSalary);
	}
}

public class EmployeeSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("enter number of employees: ");
		int n = sc.nextInt();

		Employee[] emp=new Employee[n];

		for (int i=0;i<n;i++){
			System.out.println("enter details of Employee " + (i+1));
			emp[i] = new Employee();
			emp[i].readData(sc);
		}

		System.out.print("\n Enter Employee number to search:");
	        int searchNo = sc.nextInt();

                 boolean found = false;
                 for (int i = 0; i < n; i++) {
                     if (emp[i].eNo == searchNo) {
                        System.out.println("\nEmployee Found:");
                        emp[i].displayData();
                        found = true;
                        break;
                     }
                 }  

                 if (!found) {
                    System.out.println("\nEmployee with number " + searchNo + " not found.");
                 } 
		 
	         sc.close();
       	}
}
