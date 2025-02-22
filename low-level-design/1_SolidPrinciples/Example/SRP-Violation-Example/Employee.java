class Employee {
    private Long Id;
    private String name;
    private Double salary;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void saveEmployee(Employee employee) {
        // save employee to database
    }

    public Double calcualateSalary() {
        // calculate salary
        return 0.0;
    }

    public void generatePayslip() {
        // generate payslip
    }

}