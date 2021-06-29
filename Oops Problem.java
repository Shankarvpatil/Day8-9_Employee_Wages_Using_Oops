class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome "); 
        Attendance employee = new Attendance();
        employee.isPresent();
        
    }
}
class Attendance {
    int Full_Time = 1;
    double empCheck = Math.floor(Math.random() * 10) % 2;
    void isPresent(){
        if( empCheck == Full_Time ) 
			System.out.println("Employee is present");	
		else 
			System.out.println("Employee is absent");
        
    }
