import java.util.Scanner;

class SmartCard{
    int emp_id;
    public void MarkAttendance(Employee e){
        emp_id = e.getEmpId();
        System.out.print("Employee "+emp_id+" is marked present");
    }
    public int getEmpIdn(Employee e){
        return e.empid;
    }
}

class Employee{
    int empid;
    Employee(){
        System.out.println("Enter Employee Id :");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextInt();
    }
    int getEmpId(){
        return empid;
    }
    public void login(SmartCard sc){
        int eid = sc.getEmpIdn(this);
        System.out.println("Login Successful for employee" + empid);
    }
}



public class AssociationDemo {
    public static void main(String args[]){
        Employee e = new Employee();
        SmartCard sc = new SmartCard();
        sc.MarkAttendance(e);
        e.login(sc);
    }
}
