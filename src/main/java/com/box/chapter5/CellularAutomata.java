package com.box.chapter5;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/30
 */
public class CellularAutomata {
    // 输入流
    public static Scanner sc = new Scanner(System.in);
    // 网络地址
    public static String networkAddress;
    // 借位数
    public static int NUM;
    // 网络地址的4位数
    public static int[] intNetworkAddress = new int[4];
    // 网络类型
    public static String TYPE;
    // 判断是不是合法的网络地址格式
    public static boolean isNet1() {
        String regStr = "^[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}$";
        return networkAddress.matches(regStr);
    }
    // 先分割网络地址，再判断是不是ABC三者之一的网络地址
    public static boolean isNet2() {
        if (isNet1()) {
            // 创建匹配器
            Matcher matcher = Pattern.compile("[0-9]+").matcher(networkAddress);
            // 循环取值
            int i = 0;
            while (matcher.find()) {
                //strNetworkAddress[i] = matcher.group(0);
                intNetworkAddress[i] = Integer.parseInt(matcher.group(0));
                i++;
            }
            if (intNetworkAddress[0] >= 0 && intNetworkAddress[0] <= 223) {
                return true;
            }
        }
        return false;
    }

    // 先求网络类型，再判断借位是否合法
    public static boolean isNet3() {
        if (isNet2()) {
            int xx;
            int numType = intNetworkAddress[0];
            if (numType <= 127) {
                TYPE = "A";
                xx = 8;
            } else if (numType <= 191) {
                TYPE = "B";
                xx = 16;
            } else {
                TYPE = "C";
                xx = 24;
            }
            if (xx + NUM <= 30) {
                return true;
            }
        }
        return false;
    }

    // 二进制  ==>  十进制数
    public static int erJinZhiToShiJinZhi(String str) {
        StringBuffer sb = new StringBuffer(str).reverse();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int tmp = sb.charAt(i) - 48;
            if (tmp == 1) {
                sum += Math.pow(2, i);
            }
        }
        return sum;
    }

    // 十进制  ==>  N位二进制
    public static String shiJinZhiToErJinZhi(int num, int len) {
        StringBuffer sb = new StringBuffer();
        while (num != 0) {
            sb.append(num % 2);
            num /= 2;
        }
        for(int i = sb.length(); i < len; i++) {
            sb.append(0);
        }
        sb.reverse();
        return new String(sb);
    }

    // 32位二进制 ==> IP
    public static String erJinZhiToIPAddress(String ip) {
        StringBuffer sb = new StringBuffer(ip);

        String[] str =  new  String[5];

        str[1] = erJinZhiToShiJinZhi(sb.substring(0, 8)) + "";
        str[2] = erJinZhiToShiJinZhi(sb.substring(8, 16)) + "";
        str[3] = erJinZhiToShiJinZhi(sb.substring(16, 24)) + "";
        str[4] = erJinZhiToShiJinZhi(sb.substring(24)) + "";

        return str[1] + "." + str[2] + "." + str[3] + "." + str[4];
    }
    // 用户输入信息
    public static void enterNetworkAddress() {
        System.out.print("请输入网络地址：");
        networkAddress = sc.next();
        System.out.print("请输入借位数：");
        NUM = sc.nextInt();
    }

    // 判断网络地址是否合法
    public static boolean isNetAddress() {
        return isNet3();
    }

    // 获取网络号位数
    public static int getNetworkNumberCount() {
        if (TYPE == "A") {
            return 8;
        } else if (TYPE == "B") {
            return 16;
        } else {
            return 24;
        }
    }

    // 获取子网掩码
    public static String getMask() {
        String mask;
        StringBuffer sb = new StringBuffer();
        sb.append('=');
        for (int i = 1; i <= NUM; i++) {
            sb.append(1);
        }
        for (int i = 1; i <= 32 - NUM - getNetworkNumberCount(); i++) {
            sb.append(0);
        }
        if (TYPE == "A") {
            mask = "255";
        } else if (TYPE == "B") {
            mask = "255.255";
        } else {
            mask = "255.255.255";
        }
        int sta = 1;
        for (int i = 1; i <= sb.length(); i++) {
            if (i % 8 == 0) {
                mask = mask + "." + erJinZhiToShiJinZhi(sb.substring(sta, i+1));
                sta = i + 1;
            }
        }
        return mask;
    }

    // 获得第N个借位网络号
    public static String getJieWeiNetNumber(int n) {
        return shiJinZhiToErJinZhi(n-1, NUM);
    }

    // 二进制 + 1
    public static String erJinZhiAddOne(String ip) {
        char[] chs = ip.toCharArray();
        int[] arr = new int[35];
        for (int i = 1, j = 31; i <= 32; i++,j--) {
            arr[i] = chs[j] - 48;
        }
        arr[1]++;
        int flag = 0;
        for (int i = 1; i <= 32; i++) {
            if (arr[i] + flag == 2) {
                arr[i] = 0;
                flag = 1;
            } else {
                arr[i] = arr[i] + flag;
                flag = 0;
            }
        }
        for (int i = 1, j = 32; i <= j; i++,j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 32; i++) {
            sb.append(arr[i]);
        }
        return new String(sb);
    }

    // 二进制 - 1
    public static String erJinZhiDelOne(String ip) {
        char[] chs = ip.toCharArray();
        int[] arr = new int[35];
        for (int i = 1, j = 31; i <= 32; i++,j--) {
            arr[i] = chs[j] - 48;
        }
        arr[1]--;


        int flag = 0;
        for (int i = 1; i <= 32; i++) {
            if (arr[i] + flag == -1) {
                arr[i] = 1;
                flag = -1;
            } else {
                arr[i] = arr[i] + flag;
                flag = 0;
            }
        }
        for (int i = 1, j = 32; i <= j; i++,j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 32; i++) {
            sb.append(arr[i]);
        }


        return new String(sb);
    }

    // 获取全 1 的主机号
    public static String getZZ1() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 32 - NUM - getNetworkNumberCount(); i++) {
            sb.append(1);
        }
        return new String(sb);
    }

    // 获取全 0 的主机号
    public static String getZZ2() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 32 - NUM - getNetworkNumberCount(); i++) {
            sb.append(0);
        }
        return new String(sb);
    }

    // 获取原来的网络号
    public static String getZZ3() {
        StringBuffer sb = new StringBuffer();
        int ttt;
        if (TYPE == "A") {
            ttt = 1;
        } else if (TYPE == "B") {
            ttt = 2;
        } else {
            ttt = 3;
        }
        for (int i = 0; i < ttt; i++) {
            sb.append(shiJinZhiToErJinZhi(intNetworkAddress[i], 8));
        }
        return new String(sb);
    }

    // 主程序
    public static void main(String[] args) {
        // 用户输入
        enterNetworkAddress();
        // 判断网络
        if (isNetAddress()) {
            // 网络类型
            System.out.println("网络类型：" + TYPE);
            // 可划分子网数
            System.out.println("可划分子网数：" + (int)Math.pow(2, NUM));
            // 每个子网的可用地址数
            System.out.println("每个子网的可用地址数" + ((int)Math.pow(2, 32 - getNetworkNumberCount() - NUM) - 2));
            // 子网掩码
            System.out.println("子网掩码：" + getMask());

            System.out.println("网络地址\t\t\t\t\t可用地址范围\t\t\t\t\t\t\t\t广播地址");
            for (int i = 1; i <= (int)Math.pow(2, NUM); i++) {
                /** 子网的网络地址【二进制】 */
                String xx = getZZ3() + getJieWeiNetNumber(i) + getZZ2();
                /** 子网的广播地址【二进制】 */
                String zz = getZZ3() + getJieWeiNetNumber(i) + getZZ1();
                /** 网络地址 + 1【点分十进制】 */
                String yy1 = erJinZhiToIPAddress(erJinZhiAddOne(xx));
                /** 广播地址 - 1【点分十进制】 */
                String yy2 = erJinZhiToIPAddress(erJinZhiDelOne(zz));
                System.out.println(erJinZhiToIPAddress(xx) + "\t\t\t\t" + yy1 + "---" + yy2 + "\t\t\t\t" + erJinZhiToIPAddress(zz));
            }
        }
        else {
            System.out.println("请输入正确的信息！！！");
        }
    }
}
