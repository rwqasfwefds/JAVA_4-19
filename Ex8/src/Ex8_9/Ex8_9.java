package Ex8_9;

public class Ex8_9 {

//	throws Exception = �� ���� ó�� �� �� �� �� ����
//	���� ȣ���� ������ ����ó�� �� ���� ��� ��
//	�� ���ѱ���� ����
	
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception("���Ƿ� �߻� ��Ŵ");
	}

}
