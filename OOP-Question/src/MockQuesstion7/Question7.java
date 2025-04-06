package MockQuesstion7;
/*
  WAP to create class name as Employee with field id,name and salary and create Employee object and create clone for employee object 
 */

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp[]=new Employee[3];
		Employee clonedEmployess[]=new Employee[3];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++) {
			System.out.println("ENter id,name,slary");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int salary=sc.nextInt();
			emp[i]=new Employee(id,name,salary);
			
			try {
				clonedEmployess[i]=(Employee) emp[i].clone();
			}catch (Exception e) {
				System.out.println("Clonig not support this class");
			}
		}
		System.out.println("Original Employee");
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Cloned Employees");
		for(Employee e:clonedEmployess) {
			System.out.println(e);
		}
	}
}	
