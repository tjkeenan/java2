public class Employee {

    private int empNum;
    private double empSalary;
    private final double PAY_RATE;
    final int HOURS_WORKED = 40;

    public Employee(int empNum, double payRate) {

        this.empNum = empNum;
        this.PAY_RATE = payRate;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int emp) {
        empNum = emp;
    }

    public double getEmpSalary() {
        return this.HOURS_WORKED * this.PAY_RATE;
    }

}
