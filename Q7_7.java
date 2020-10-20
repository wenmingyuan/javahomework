package homework_2;

/* 编写一个程序，生成 0 和 9 之间的 100 个随机整数，然后显示每一个数出现的次数。
提示：使用（int)(Math.random()*10)产生 0 到 9 之间的随机整數。
使用一个名为 counts 的由 10 个整数构成的数组存放 0, 1,… , 9 的个数。
 */

public class Q7_7 {
    /** 主方法 */
    public static void main(String[] args) {
        // 创建100个整数构成的数组
        int[] numbers = create_numbers();
        // 打印上述数组
        print_numbers(numbers);
        // 创建由0至9各自的出现次数构成的数组
        int[] counts = create_counts(numbers);
        // 打印空行
        System.out.println("\n");
        // 打印上述数组
        print_counts(counts);
    }
    /** 创建0至9的100个随机整数构成的数组 */
    public static int[] create_numbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++)
            numbers[i] = (int)(Math.random()*10);
        return numbers;
    }
    /** 打印100个整数构成的数组 */
    public static void print_numbers(int[] numbers) {
        System.out.print("100个整数为：");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
    /** 创建由0至9各自的出现次数构成的数组 */
    public static int[] create_counts(int[] numbers) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++)
            counts[numbers[i]]++;
        return counts;
    }
    /** 打印counts数组 */
    public static void print_counts(int[] counts) {
        System.out.print("0至9的每个数分别出现的次数为：");
        for (int i = 0; i < 10; i++)
            System.out.print(counts[i] + " ");
    }
}
