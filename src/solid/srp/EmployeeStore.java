package solid.srp;

public interface EmployeeStore {
    Employee getEmployeeBuId(String id);
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}
