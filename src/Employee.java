public class Employee implements Payable{
  public String employeeId;
  public String name;
  public double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name; // TODO fill in code here
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    return "employee ID is: " + employeeId + ", employee name is: " + name + ", employee average monthly salary is: " + String.format("%.2f", averageMonthlySalary);
  }

  @Override
  public void calculatePay() {

  }
}
