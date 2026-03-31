package Daily_code.day3.smallChange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
该类是完成零钱通的各个功能的类
使用oop
将各个功能对应一个方法
 */
public class SmallChangeOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "------------------------------零钱通明细------------------------------";

    double money = 0;
    double balance = 0;
    Date date = null;//java 日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //消费
    //定义新变量，保存消费原因
    String note = "";

    //先完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n--------------零钱通菜单--------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消    费");
            System.out.println("\t\t\t4 退    出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();
            //使用switch 分支控制
            switch (key) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.cost();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }


        } while (loop);

    }

    //完成零钱通明细
    public void details() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //money 记得校验
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;//不再执行后面代码
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前的日期
        //System.out.println(sdf.format(date));
        details += "\n收益入账\t+" + money + "\t " + sdf.format(date) + "\t余额：" + balance;
    }

    //完成消费
    public void cost() {
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        //money 校验
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在0-" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t " + sdf.format(date) + "\t余额：" + balance;
    }

    //退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
