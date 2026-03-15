package CompuWork.src;

public class PermanentEmployee extends Employee {
    private double baseSalary;
    private String healthBenefits;

    public PermanentEmployee(String name, String position, double baseSalary, String healthBenefits) {
        super(name, position);
        this.baseSalary = baseSalary;
        this.healthBenefits = healthBenefits;
    }

    @Override
    public String getEmployeeTypeDetails() {
        return "Permanent Employee. Salary: " + baseSalary + ", Benefits: " + healthBenefits;
    }
}