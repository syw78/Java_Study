package chapter06.ban05;

import chapter06.ban06.BanB01;

public class BanAMain {

	public static void main(String[] args) {
		//���� ��Ű���� �ִ°��� ������
		BanA01 banA01= new BanA01();//public class
		banA01.pubNo=10;
		//banA01.priNo = 10;
		banA01.defNo=10;
		banA01.protectedNo=10;
		
		BanA02 banA02= new BanA02();//default class
		
		//�ٸ� ��Ű���� �ִ°��� ������
		BanB01 banB01 = new BanB01();    // ��Ʈ�� ����Ʈ ��
		banB01.pubNo=10;
		
		//banB01.priNo=10;
		//banB01.defNo=10;
		//banB01.protected =10;
		
		// BanB02 banB02 = new BanB02();     ��� ����Ʈ�ϱ� �ȵȴ�. ����Ʈ �ٸ����� �ڱ� ��Ű��
		
	}

}
