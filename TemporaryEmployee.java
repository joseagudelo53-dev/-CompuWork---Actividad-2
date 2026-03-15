package CompuWork.src;

public class TemporaryEmployee extends Employee {
    private String contractEndDate;
    private double hourlyRate;

    public TemporaryEmployee(String name, String position, String contractEndDate, double hourlyRate) {
        super(name, position);
        this.contractEndDate = contractEndDate;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeTypeDetails() {
        return "Temporary Employee. Contract ends: " + contractEndDate + ", Hourly Rate: " + hourlyRate;
    }
}