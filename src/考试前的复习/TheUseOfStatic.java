package ����ǰ�ĸ�ϰ;

public class TheUseOfStatic {
	private static String str1 = "StaticProperty"; // ��̬static�����в�ʹ��this�ؼ���
	private String str2 = "Property";
	
	public TheUseOfStatic() {
		
	}
	
	public void print1() {
		System.out.print(str1);
		System.out.print(str2);
	}
	public static void print2() {
		System.out.print(str1);
		// System.out.print(str2); ��һ�лᱨ�� ��Ϊprint2��һ����̬�ķ���
		// �ھ�̬�ķ����ֻ�ܵ��þ�̬�������ԣ���������Ա������������һЩ������
	}
}
