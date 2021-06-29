class EmployeeWage
{
	public static void main(String[] args)
	{
	   System.out.println("Welcome to Employee Wage Computation");
           Attendance employee = new Attendance();
           employee.isPresent();

	}
}
class Attendance extends Wage
{
    int empCheck = (int)Math.floor(Math.random() * 10) % 3;
    void isPresent()
    {
	int FullTime = 0;
	int Parttime = 1;
        switch(empCheck)
        {
	 case 0:
	 FullTime = 0;
            System.out.println("Employee is Present for full time ");
            System.out.println("Wage is "+dailyWage(8));
	    break;
         case 1:
	 Parttime = 1;
            System.out.println("Employee is Present for part time ");
            System.out.println("Wage is "+dailyWage(4));
            break;
         default:
            System.out.println("Employee is Absent ");
     	    break;
	}
     }
}
class Wage
   {
        final int wagePerHr = 20;
        int dailyWage(int workHr)
        {
            return wagePerHr * workHr;
        }
    }
