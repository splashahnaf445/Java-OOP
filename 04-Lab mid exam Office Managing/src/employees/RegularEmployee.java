package employees;

    public class RegularEmployee extends Employee {
        private double houseRent;
        private double medicalAllowance;
        public RegularEmployee(String name, int id, double basicSalary) {
            super(name, id, basicSalary);
            this.houseRent = 0.2*basicSalary;
            this.medicalAllowance = 0.15*basicSalary;

        }

        public double calculateSalary() {
            return houseRent + medicalAllowance+super.calculateSalary();
        }

}
