package excercise_DecimalFormat;


public class Test {

	public static void main(String[] args) {
		Student james = new Student("james", 5400000);
		Student tomas = new Student("tomas", 50000);
		
		Bus bus100 = new Bus(100); // 100번 버스 생성.
		james.takeBus(bus100); // 제임스가 100번 버스를 탑니다
		tomas.takeBus(bus100); // 토마스가 100번 버스를 탑니다
		
//		학생 정보 출력
		james.showInfor();
		tomas.showInfor();
//		버스 정보 출력
		bus100.showInfo();
		
		System.out.println("--------------------------");
		
		Subway subway = new Subway(2);
		james.takeSubway(subway);
		tomas.takeSubway(subway);
		
//		학생 정보 출력
		james.showInfor();
		tomas.showInfor();
//		지하철 정보 출력
		subway.showInfo();
	}

}
