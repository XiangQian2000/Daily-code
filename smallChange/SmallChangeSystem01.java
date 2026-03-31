package Daily_code.day3.smallChange;

import java.util.Scanner;


public class SmallChangeSystem01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 100.0;             // 初始余额（你也可以设 0）
        String details = "零钱通明细===";                // 存明细的简单方式
        System.out.println("请输入(1-4)：");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("零钱通明细：");
            System.out.println(details);
        } else if (num == 2) {
            System.out.println("输入收入金额：");
            double add = sc.nextDouble();
            String time = new java.util.Date().toString(); // 自动时间
            balance += add;
            details += "收入  +" + add + "  " + time + "  余额:" + balance + "\n";
            System.out.println("已记账：" + details);
        } else if (num == 3) {
            System.out.println("输入支出金额：");
            double use = sc.nextDouble();
            if (use > balance) {
                System.out.println("余额不足");
            } else {
                String time = new java.util.Date().toString();
                balance -= use;
                details += "支出  -" + use + "  " + time + "  余额:" + balance + "\n";
                System.out.println("已记账：" + details);
            }
        } else if (num == 4) {
            System.out.println("退出");
        } else {
            return;

    }
    }
}