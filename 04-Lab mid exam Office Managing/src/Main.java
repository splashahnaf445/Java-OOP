
import departments.*;
import employees.RegularEmployee;

public class Main {
    public static void main(String[] args) {
        Department HR= new Department();
        RegularEmployee reg= new RegularEmployee("Sharmin Akter",102,35000);
        HR.addEmployee(reg);
        HR.showEmployees();
        HR.expenditure();
    }
}