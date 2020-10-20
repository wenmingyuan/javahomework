package homework_2;

/* 编写一个方法，求出整数数组中最小元素的下标。如果这样的元素个数大于 1，则返回最小的下标。使用下面的方法头：
public static int indexOfSmallestElement(double[] array)
编写测试程序，提示用户输入 10 个数字，调用这个方法，返回最小元素的下标，然后显示这个下标值。
 */

import java.util.Scanner;

public class Q7_10 {
    /** 获得数组中最小元素的最小下标 */
    public static int indexOfSmallestElement(double[] array) {
        // 初始最小值为数组的第一个元素
        double min = array[0];
        // 初始下标为0
        int indexOfMin = 0;
        // 获得最小元素的最小下标
        for (int i = 1; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        // 返回最小元素的最小下标
        return indexOfMin;
    }
    /** 主方法 */
    public static void main(String[] args) {
        // 创建10个元素的数组
        double[] array = new double[10];
        // 循环输入整数，并将其对应到数组中
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第" + String.valueOf(i + 1) + "个整数：");
            double number = input.nextDouble();
            array[i] = number;
        }
        // 打印结果
        System.out.println("最小元素的下标值是" + indexOfSmallestElement(array));
    }
}
