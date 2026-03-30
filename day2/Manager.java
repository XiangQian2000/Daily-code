package Daily_code.day2;

public class Manager extends Employee{
    public double Bonus;
    public String Manage;

    public Manager(String name, double monthlySalary, double bonus, String manage) {
        super(name, monthlySalary);
        Bonus = bonus;
        Manage = manage;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public String getManage() {
        return Manage;
    }

    public void setManage(String manage) {
        Manage = manage;
    }
    @Override
    double getAnnual(){
        return 12*getMonthlySalary()+Bonus;
    }

    @Override
public String getInfo() {
    return super.getInfo()
        + "，管理：" + getManage()
        + "，奖金：" + getBonus();
}
}
