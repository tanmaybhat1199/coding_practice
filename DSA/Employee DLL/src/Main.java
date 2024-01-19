
public class Main {
	
        public static void main(String []args)
        {
        
		Employee e1 = new Employee("A", 34, 15500); //name, age & salary
		Employee e2 = new Employee("B", 31, 15600);
		Employee e3 = new Employee("C", 32, 15100);
		Employee e4 = new Employee("D", 30, 15200);
		Employee e5 = new Employee("E", 31, 15300);

		DLinkedList employeeList1 = new DLinkedList();
		employeeList1.InsertFirst(e1);
		employeeList1.Append(e2);
		employeeList1.InsertAtMid(e3);
		

		DLinkedList employeeList2 = new DLinkedList();
		employeeList2.Append(e4);
		employeeList2.InsertFirst(e5);
		employeeList2.Append(new Employee("F", 31, 15900));

		System.out.println(employeeList1);
		System.out.println(employeeList2);

	//	employeeList1.AppendList(employeeList2);
		employeeList1.DeleteOlderThan31();
		DLinkedList.printCommanEmployees(employeeList1, employeeList2);

		DLinkedList employeeList3 = DLinkedList.concat(employeeList1, employeeList2);
		System.out.println(employeeList3);
	

        }
}
