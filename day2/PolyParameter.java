package Daily_code.day2;

public class PolyParameter {
    public static void main(String[] args) {

        Employee e0 = new CommonEmployee("小丽", 3000, "维修工");
        Employee e1 = new CommonEmployee("小王", 3060, "打扫工");
        Employee e2 = new CommonEmployee("小张", 3500, "洗碗工");
        Employee e3 = new CommonEmployee("小李", 4000, "收银员");
        Employee e4 = new Manager("苏经理", 8300, 20000, "每晚核对今日收入");

        System.out.println("员工数据如下===========================");

        PolyParameter p = new PolyParameter();

        p.showEmpInfo(e0);
        p.showEmpInfo(e1);
        p.showEmpInfo(e2);
        p.showEmpInfo(e3);
        p.showEmpInfo(e4);
    }

    public void showEmpInfo(Employee e) {
        System.out.println(e.getInfo());
    }
}