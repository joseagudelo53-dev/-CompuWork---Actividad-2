package CompuWork.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Department {
    private String id;
    private String name;
    private List<Employee> employees;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getId() { return id; }

    public void addEmployee(Employee employee) throws EmployeeAssignmentException {
        if (employee == null) {
            throw new EmployeeAssignmentException("Cannot assign a null employee to the department.");
        }
        if (employees.contains(employee)) {
            throw new EmployeeAssignmentException("Employee is already assigned to this department.");
        }
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) throws EmployeeAssignmentException {
        if (!employees.remove(employee)) {
            throw new EmployeeAssignmentException("Employee not found in this department.");
        }
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }
}