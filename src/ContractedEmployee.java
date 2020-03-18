public class ContractedEmployee extends Employee {
  String federalTaxId;
  double hourlyRate;
  double numberOfHoursWorked;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public String getName() {
    return name;
  }

  public void calculatePay() {
  }

  public double getAverageMonthlySalary() {
    averageMonthlySalary = numberOfHoursWorked * hourlyRate; //the average monthly salary = hourly rate * number of hours worked
    return averageMonthlySalary;
  }
  // TODO fill in code here
}
