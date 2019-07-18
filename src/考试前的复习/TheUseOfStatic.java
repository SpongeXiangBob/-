package 考试前的复习;

public class TheUseOfStatic {
	private static String str1 = "StaticProperty"; // 静态static方法中不使用this关键字
	private String str2 = "Property";
	
	public TheUseOfStatic() {
		
	}
	
	public void print1() {
		System.out.print(str1);
		System.out.print(str2);
	}
	public static void print2() {
		System.out.print(str1);
		// System.out.print(str2); 这一行会报错 因为print2是一个静态的方法
		// 在静态的方法里，只能调用静态（的属性，方法，成员变量等其他的一些东西）
	}
}
