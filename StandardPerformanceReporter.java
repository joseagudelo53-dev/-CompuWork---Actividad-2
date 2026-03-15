package CompuWork.src;

public class StandardPerformanceReporter implements PerformanceReporter {

    @Override
    public String generateIndividualReport(Employee employee) throws ReportGenerationException {
        if (employee == null) {
            throw new ReportGenerationException("Invalid employee data for report generation.");
        }
        StringBuilder report = new StringBuilder();
        report.append("--- Performance Report ---\n");
        report.append("Name: ").append(employee.getName()).append("\n");
        report.append("Score: ").append(employee.getPerformanceScore()).append("/100\n");
        report.append("Details: ").append(employee.getEmployeeTypeDetails()).append("\n");
        return report.toString();
    }

    @Override
    public String generateDepartmentReport(Department department) throws ReportGenerationException {
        if (department == null || department.getEmployees().isEmpty()) {
            throw new ReportGenerationException("Department is empty or invalid.");
        }
        
        double totalScore = 0;
        StringBuilder report = new StringBuilder();
        report.append("=== Department Report: ").append(department.getName()).append(" ===\n");
        
        for (Employee emp : department.getEmployees()) {
            report.append("- ").append(emp.getName()).append(": ").append(emp.getPerformanceScore()).append("\n");
            totalScore += emp.getPerformanceScore();
        }
        
        double average = totalScore / department.getEmployees().size();
        report.append("Average Department Score: ").append(average).append("\n");
        return report.toString();
    }
}