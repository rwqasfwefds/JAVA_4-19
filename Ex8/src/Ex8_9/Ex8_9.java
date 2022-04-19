package Ex8_9;

public class Ex8_9 {

//	throws Exception = 난 에러 처리 안 함 응 니 에미
//	나를 호출한 곳에서 에러처리 해 ㅇㅇ 라는 뜻
//	걍 떠넘기기임 ㅇㅇ
	
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception("고의로 발생 시킴");
	}

}
