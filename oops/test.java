class Employee{
	int eno = 111;
	String ename = "sangram";
	float esal = 50000.0f;
	String eaddr = "bangaluru";
	
	public void displayEmoDetails(){
		System.out.println("Employee Details");
		System.out.println("___________________");
		System.out.println("Employeee Number      :" + eno);
		System.out.println("Employee name         :" + ename);
		System.out.println("Employee salary       :" + esal);
		System.out.println("Employee address      :" + eaddr);
	}
}
class test{
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.displayEmoDetails();
		Student stu = new Student();
		stu.displayStudentDetails();
	}
}

class Student{
	int sno = 121;
	String sname = "sangram";
	float smark = 7.2f;
	String sbranch = "CSE";
	
	public void displayStudentDetails(){
		System.out.println("Student Details");
		System.out.println("------------------");
		System.out.println("Student Number     :" + sno);
		System.out.println("Student Name       :" + sname);
		System.out.println("Student Mark       :" + smark);
		System.out.println("Student Branch     :" + sbranch);
	}
}