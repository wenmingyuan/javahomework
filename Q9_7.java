/* 设计一个名为Account的类，它包括：
1. 一个名为id的int类型私有数据域（默认值为0)。
2. 一个名为balance（余额）的double类型私有数据域（默认值为0）。
3. 一个名为annualInterestRate的double类型私有数据域存储当前利率（默认值为0)。假设所有的账户都有相同的利率。
4. 一个名为dateCreated的Date类型的私有数据域，存储账户的开户日期。
5. 一个用于创建默认账户的无参构造方法。
6. 一个用于创建带特定id和初始余额的账户的构造方法。
7. id、balance和annuallnterstRate的访问器和修改器。
8. dateCreated的访问器。
9. 一个名为getMonthlyInterestRate()的方法，返回月利率。
10. 一个名为withDraw的方法，从账户提取特定数额。
11. 一个名为deposit的方法向账户存储特定数额。

提示：方法getMonthlylnterest()用于返回月利息，而不是利率。月利息是balance*MonthlyInterestRate。MonthlyInterestRate是annualInterestRate/12。注意，annualInterestRate是一个百分数，比如4.5%。你需要将其除以100。

编写一个测试程序，创建一个账户ID为1122、余额为20000美元、年利率为4.5%的Account对象。使用withdraw方法取款2500美元，使用deposit方法存款3000美元，然后打印余额、月利息以及这个账户的开户日期。
*/

// 定义Account类
class Account {
	// 数据域
		private int id;
		private double balance;
		private double annualInterestRate;
		private java.util.Date dateCreated;
	// 无参构造方法	
	Account() {
	}
	// 有参构造方法
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	// id访问器
	public int getid() {
		return id;
	}
	// 余额访问器
	public double getbalance() {
		return balance;
	}
	// 年利率访问器
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	// id修改器
	public void setid(int id) {
		this.id = id;
	}
	// 余额修改器
	public void setbalance(double balance) {
		this.balance = balance;
	}
	// 年利率修改器
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	// 开户日期访问器
	public java.util.Date getdateCreated() {
		return dateCreated;
	}
	// 月利率访问器
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	// 提取特定数额
	public void withDraw(double someMoney) {
		balance = balance - someMoney;
	}
	// 存储特定数额
	public void deposit(double someMoney) {
		balance = balance + someMoney;
	}
}

public class Q9_7 {
	// 主方法
	public static void main(String[] args) {
		// 创建账户，id和余额赋初值
		Account test = new Account(1122, 20000);
		// 年利率赋初值
		test.setannualInterestRate(4.5);
		// 取款
		test.withDraw(2500);
		// 存款
		test.deposit(3000);
		// 打印余额
		System.out.println("余额为" + test.getbalance() + "美元");
		// 打印月利息
		System.out.println("月利息是" + test.getbalance() * test.getMonthlyInterestRate() / 100 + "美元");
		// 打印开户日期
		System.out.println("开户日期为" + test.getdateCreated());
	}
}
