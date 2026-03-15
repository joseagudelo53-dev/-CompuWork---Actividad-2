package CompuWork.src;

public interface PerformanceReporter {
    String generateIndividualReport(Employee employee) throws ReportGenerationException;
    String generateDepartmentReport(Department department) throws ReportGenerationException;
}