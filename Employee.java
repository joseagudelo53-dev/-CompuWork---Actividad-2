package CompuWork.src;

import java.util.UUID;

public abstract class Employee {
    protected String id;
    protected String name;
    protected String position;
    protected double performanceScore; // Métrica base 0.0 a 100.0

    public Employee(String name, String position) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.position = position;
        this.performanceScore = 0.0;
    }
  
public String getId() { return id; }
    public String getName() { return name; }
    public double getPerformanceScore() { return performanceScore; }
    public void setPerformanceScore(double score) { this.performanceScore = score; }
    
    public abstract String getEmployeeTypeDetails();
}