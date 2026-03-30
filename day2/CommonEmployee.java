package Daily_code.day2;

public class CommonEmployee extends Employee {
    public String workName;

    public CommonEmployee(String name, double monthlySalary, String workName) {
        super(name, monthlySalary);
        this.workName = workName;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    @Override
    double getAnnual(){
        return 12*getMonthlySalary();
    }

    @Override
public String getInfo() {
    return super.getInfo()
        + "，职位：" + getWorkName();
}
}
