package Daily_code.day2;

public class Employee {
    public String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double getAnnual(){
       return 12*getMonthlySalary();
    }

    public String getInfo() {
    return "姓名：" + name
        + "，月工资：" + getMonthlySalary()
        + "，年收入：" + getAnnual();
}
}
