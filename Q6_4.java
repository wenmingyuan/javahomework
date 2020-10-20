package homework_2;

/* 使用下面的方法头编写方法，反向显示一个整数：
public static void reverse(int number)
例如：reverse(3456)返回 6543。编写一个测试程序，提示用户输入一个整数，然后显示它的反向数。
 */

import java.util.Scanner;

public class Q6_4 {
    /** 将数字反向 */
    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10);  // 打印最后一位数字
            number = number / 10;  // 去掉最后一位数字
        }
    }
    /** 主方法 */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("\n请输入一个正整数：");
            try {  // 如果输入是整数类型，继续执行程序
                int num = input.nextInt();
                if (num < 0) {  // 如果输入是负数，打印错误信息
                    System.out.print("只能输入正整数，请重新输入");
                    continue;
                }
                reverse(num);  // 将数字反向
            } catch (Exception e) {  // 如果输入不是整数类型，打印错误信息
                System.out.print("只能输入正整数，请重新输入");
            }
        }
    }
}
