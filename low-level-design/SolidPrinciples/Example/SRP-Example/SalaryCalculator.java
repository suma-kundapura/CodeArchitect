class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double salary = 0.0;
        if (employee.getDesignation().equals("Developer")) {
            salary = employee.getWorkingHours() * 1000;
        } else if (employee.getDesignation().equals("Manager")) {
            salary = employee.getWorkingHours() * 2000;
        }
        return salary;
    }
}