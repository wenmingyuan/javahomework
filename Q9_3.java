/* 编写程序创建一个Date对象，设置它的流逝时间分别为10000、100000、1000000、10000000、100000000、1000000000、10000000000、100000000000,然后使用toString()方法分别显示上述日期。
*/

public class Q9_3 {
    public static void main(String[] args){
        // 创建Date类的一个对象
        java.util.Date date = new java.util.Date();
        // 循环8次
        for (long i = 10000L; i <= 100000000000L ; i = i * 10) {
        // 设置流逝时间
        date.setTime(i);
        // 打印日期
        System.out.println("The time is " + date.toString());
        }
    }
}
