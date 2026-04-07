package rant;

import java.util.Scanner;
import java.util.Arrays;

public class rant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        String details = "";
        String[][] houses = {
                {"1", "jack", "13812345678", "海淀区", "3000", "未出租"},
                {"2", "tom", "13987654321", "朝阳区", "4000", "出租中"},
                {"3", "lucy", "13611112222", "西城区", "2500", "未出租"},
                {"4", "mike", "13733334444", "东城区", "5000", "出租中"},
                {"5", "anna", "13955556666", "丰台区", "3500", "未出租"}
        };
        while (loop) {
            System.out.println("-----------房屋出租系统----------");
            System.out.println("1.新增房源");
            System.out.println("2.查找房屋");
            System.out.println("3.删除房屋");
            System.out.println("4.修改房屋信息");
            System.out.println("5.房屋列表");
            System.out.println("6.退   出");
            System.out.println("输入（1-6）");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("1.新增房源");
                System.out.println("请输入姓名");
                String name = sc.next();
                System.out.println("请输入电话号码");
                String phone = sc.next();
                System.out.println("请输入地址");
                String address = sc.next();
                System.out.println("请输入月租金额");
                double monthMoney = sc.nextDouble();
                System.out.println("请输入出租中或未出租");
                String zhuangtai = sc.next();
                System.out.println("-----添加房屋-----");
                details += "姓名：" + name + "\n" + "电话：" + phone + "\n" + "地址：" + address + "\n" + "月租：" + monthMoney + "\n" + "状态：" + zhuangtai;
                System.out.println("-----添加完成-----");
            }
            if (n == 2) {
                System.out.println("2.查找房屋");
                System.out.println("-----查找房屋-----");
                for (int i = 0; i < houses.length; i++) {
                    System.out.println(Arrays.toString(houses[i]));
                }
                System.out.println("输入你要查找的房屋ID：");
                String id = sc.next();
                boolean found = false;
                for (int i = 0; i < houses.length; i++) {
                    if (id.equals(houses[i][0])) {
                        System.out.println(houses[i][0] + "\t" + houses[i][1] + "\t" + houses[i][2] + "\t" + houses[i][3] + "\t" + houses[i][4] + "\t" + houses[i][5]);
                        System.out.println("-----查找完成-----");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("-----查找失败，没有该房屋-----");
                }
            }
            if (n == 3) {
                System.out.println("3.删除房屋");
                System.out.println("-----删除房屋-----");
                System.out.println("姓名：" + "\n" + "电话：" + "\n" + "地址：" + "\n" + "月租：" + "\n" + "状态：");
                System.out.println("-----删除完成-----");
            }
            if (n == 4) {
                System.out.println("4.修改房屋信息");
                System.out.println("-----修改房屋-----");
                System.out.println("姓名：" + "\n" + "电话：" + "\n" + "地址：" + "\n" + "月租：" + "\n" + "状态：");
                System.out.println("-----修改完成-----");
            }
            if (n == 5) {
                System.out.println("5.房屋列表");
                System.out.println(details);
                System.out.println("-----房屋列表信息-----");
                //System.out.println("姓名：" + "\n" + "电话：" + "\n" + "地址：" + "\n" + "月租：" + "\n" + "状态：");
                System.out.println("-----完成-----");
            }
            if (n == 6) {
                System.out.println("6.退   出");
                break;
            }


        }
    }
}

