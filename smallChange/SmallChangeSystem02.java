package Daily_code.day3.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem02 {
    public static void main(String[] args) {
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
        do{
            System.out.println("\n--------------零钱通菜单--------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消    费");
            System.out.println("\t\t\t4 退    出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();
            //使用switch 分支控制
            switch(key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    //money 记得校验
                    if(money <= 0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前的日期
                    //System.out.println(sdf.format(date));
                    details += "\n收益入账\t+" + money + "\t "+sdf.format(date)+"\t余额："+balance;
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    //money 校验
                    if(money <= 0 || money > balance){
                        System.out.println("你的消费金额应该在0-"+balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n"+note+"\t-" + money + "\t "+sdf.format(date)+"\t余额："+balance;
                    break;
                case "4":
                    //定义一个变量choice ,接受用户输入
                    //使用while + break，来处理接受到的输入是y/n
                    //退出while后，判断输出的是y还是n，决定是否退出
                    String choice = "";
                    while(true){
                        System.out.println("你确定退出吗？y/n");
                        choice = scanner.next();
                        if("y".equals(choice)||"n".equals(choice)){
                        break;
                        }
                    }

                    if(choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }


        }while (loop);

        System.out.println("------------------------------退出零钱通------------------------------");
    }
}
