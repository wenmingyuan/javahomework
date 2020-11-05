package homework_2;

/* 编写一个方法，求 n x n 的 double 类型矩阵中主对角线上所有数字的和，使用下面的方法头：
public static double sumMajorDiagonal(double[][] m)
编写一个测试程序，读取一个 4 x 4 的矩阵，然后显示它的主对角线上的所有元素的和。
 */

import java.util.Scanner;

public class Q8_2 {
    /** 求矩阵主对角线数字之和 */
    public static double sumMajorDiagonal(double[][] m) {
        // 初始求和为0
        double sum = 0;
        // 累加矩阵主对角线数字
        for (int i = 0; i < 4; i++)
            sum = sum + m[i][i];
        // 返回求和结果
        return sum;
    }
    /** 主方法 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 创建一个4x4的矩阵
        double[][] m = new double[4][4];
        System.out.println("请按行输入一个4x4的矩阵:");
        // 根据输入数字生成矩阵
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                m[i][j] = input.nextDouble();
        // 打印矩阵主对角线求和的结果
        System.out.println("该矩阵的主对角线上所有元素之和是" + sumMajorDiagonal(m));
        // 关闭输入流
        input.close();
    }
}
