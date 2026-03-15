package CompuWork.src;

public class Main {
    public static void main(String[] args) {
        // 1. Inicializar el sistema inyectando el generador de reportes
        PerformanceReporter reporter = new StandardPerformanceReporter();
        HRSystemManager manager = new HRSystemManager(reporter);

        // 2. Crear un departamento
        manager.createDepartment("DEP-01", "Desarrollo de Software");

        // 3. Crear empleados
        PermanentEmployee emp1 = new PermanentEmployee("Jose Agudelo", "Senior Developer", 4500.0, "Seguro Médico Total");
        emp1.setPerformanceScore(95.5); // Asignar calificación

        TemporaryEmployee emp2 = new TemporaryEmployee("Ana Gómez", "QA Tester", "2026-12-31", 25.0);
        emp2.setPerformanceScore(88.0);

        // 4. Registrar los empleados en el sistema general
        manager.registerEmployee(emp1);
        manager.registerEmployee(emp2);

        // 5. Asignar los empleados al departamento
        manager.assignEmployeeToDepartment(emp1.getId(), "DEP-01");
        manager.assignEmployeeToDepartment(emp2.getId(), "DEP-01");

        // 6. Probar la salida de reportes en consola
        System.out.println("----- PRUEBA DE REPORTE INDIVIDUAL -----");
        System.out.println(manager.getEmployeeReport(emp1.getId()));
    }
}