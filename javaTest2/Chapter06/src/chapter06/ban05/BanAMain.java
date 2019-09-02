package chapter06.ban05;

import chapter06.ban06.BanB01;

public class BanAMain {

	public static void main(String[] args) {
		//같은 패키지에 있는것을 가져옴
		BanA01 banA01= new BanA01();//public class
		banA01.pubNo=10;
		//banA01.priNo = 10;
		banA01.defNo=10;
		banA01.protectedNo=10;
		
		BanA02 banA02= new BanA02();//default class
		
		//다른 패키지에 있는것을 가져옴
		BanB01 banB01 = new BanB01();    // 컨트롤 시프트 오
		banB01.pubNo=10;
		
		//banB01.priNo=10;
		//banB01.defNo=10;
		//banB01.protected =10;
		
		// BanB02 banB02 = new BanB02();     얘는 디폴트니까 안된다. 디폴트 다른말로 자기 패키지
		
	}

}
