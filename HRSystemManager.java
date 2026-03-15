package CompuWork.src;

import java.util.HashMap;
import java.util.Map;

public class HRSystemManager {
    private Map<String, Department> departments;
    private Map<String, Employee> employees;
    private PerformanceReporter reporter;

    public HRSystemManager(PerformanceReporter reporter) {
        this.departments = new HashMap<>();
        this.employees = new HashMap<>();
        this.reporter = reporter;
    }

    public void registerEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void createDepartment(String id, String name) {
        departments.put(id, new Department(id, name));
    }

    public void assignEmployeeToDepartment(String employeeId, String departmentId) {
        try {
            Employee emp = employees.get(employeeId);
            Department dept = departments.get(departmentId);
            
            if (emp == null || dept == null) {
                throw new EmployeeAssignmentException("Invalid Employee ID or Department ID.");
            }
            dept.addEmployee(emp);
        } catch (EmployeeAssignmentException e) {
            System.err.println("Assignment failed: " + e.getMessage());
        }
    }

    public String getEmployeeReport(String employeeId) {
        try {
            Employee emp = employees.get(employeeId);
            return reporter.generateIndividualReport(emp);
        } catch (ReportGenerationException e) {
            return "Error generating report: " + e.getMessage();
        }
    }
}