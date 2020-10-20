package homework_2;

/* 编写一个方法，使用下面的方法头显示 n x n 的矩阵：
public static void printMatrix(int n)
每个元素都是随机产生的 0 或 1。编写一个测试程序，提示用户输入 n , 显示一个 n x n 的矩阵。
 */

import java.util.Scanner;

public class Q6_17 {
    /** 打印矩阵 */
    public static void printMatrix(int n) {
        int i;
        int j;
        for (i = 1; i <= n; i++) {  // 循环矩阵的每行
            String line = "";
            for (j = 1; j <= n; j++) {  // 循环矩阵的每列
                int rand = (int)(Math.random()*2);  // 随机生成0或1
                line = line + String.valueOf(rand) + " ";  // 生成矩阵的一行
            }
            line = line.trim();  // 删除最右侧空白
            System.out.println(line);  // 打印矩阵的一行
        }
    }
    /** 主方法 */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("\n请输入n的值：");
            try {  // 如果输入是整数类型，继续执行程序
                int n = input.nextInt();
                if (n <= 0) {  // 如果输入是负数或0，打印错误信息
                    System.out.print("只能输入正整数，请重新输入");
                    continue;
                }
                printMatrix(n);  // 打印矩阵
            } catch (Exception e) {  // 如果输入不是整数类型，打印错误信息
                System.out.print("只能输入正整数，请重新输入");
            }
        }
    }
}
