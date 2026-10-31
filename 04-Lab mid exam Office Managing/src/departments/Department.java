
package departments;

import employees.*;

public class Department {
    public String departmentName;
    public RegularEmployee[] employeeList = new RegularEmployee[10];
    public int i = 0;

    public void addEmployee(RegularEmployee e) {
        employeeList[i] = e;
        i++;
    }

    public void showEmployees() {
        for (int k = 0; k < employeeList.length; k++) {
            if (employeeList[k] != null) {
                RegularEmployee emp = employeeList[k];
                System.out.println("Department HR");
                System.out.println("Name: " + emp.name + ", ID: " + emp.id + ",Total Salary: " + emp.calculateSalary()+"BDT");
            }
        }
    }


    public double sum = 0;

    public void expenditure() {

        for (int k = 0; k < employeeList.length; k++) {
            if (employeeList[k] != null) {
                sum += employeeList[k].calculateSalary();
            }
        }
        System.out.println("Total salary expenditure is: " + sum);
    }

}
/*class HRDepartment extends Department{
    public double sum=0;
    public void expenditure(){

        for(int k=0;k<employeeList.length;k++){
            sum+=employeeList[k].calculateSalary();
        }
    }
}*/

