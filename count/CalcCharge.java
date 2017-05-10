
public class CalcChange {

	public void calc(int money,int price){  // m=지불금액,p=가격

		int units[] = {5000, 1000, 500, 100, 50, 10};

		// 거스름돈
		int change = money - price;
		System.out.println("거스름돈: " + change);

		//네번째 방법 향상된 for문
		for(int a : units){
			change = printChange(change,a);
		}

		//세번째 방법 일반적인 for문
//		int units_length = units.length;
//		for(int i=0; i<units_length; i++){
//			change = printChange(change,units[i]);
//		}

		//두번째 방법
//		change = printChange(change, 5000);
//		change = printChange(change, 1000);
//		change = printChange(change, 500);
//		change = printChange(change, 100);
//		change = printChange(change, 50);
//		change = printChange(change, 10);


		//첫번째방법
//		int c1000 = change/1000;
//		change = change -c1000*1000;
//		System.out.println("천원권 : " + c1000);
//
//		int c500 = change/500;
//		change = change -c500*500;
//		System.out.println("오백원 : " + c500);
//
//		int c100 = change/100;
//		change = change -c100*100;
//		System.out.println("백원 : " + c100);
//
//		int c50 = change/50;
//		change = change -c50*50;
//		System.out.println("오십원 : " + c50);
//
//		int c10 = change/10;
//		change = change -c10*10;
//		System.out.println("십원 : " + c10);

	}

		//중복되는건 함수로 만들어 줌
		public int printChange(int change, int unit){
		int count = change/unit; // 나누면 int는 정수이기때문에 소수점 아래는 버림
		change = change - count *unit;
		System.out.println(unit + "원권 : " + count);
		return change;
	}
}
