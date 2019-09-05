package chapter14.ex1515;

public class NotTest {

	public static void main(String[] args) {
		int[] numArray={10,20,30,40};
		
		try{
			boolean answer = searchArray(numArray,21);
		}catch(NotFoundException e){
			System.out.println("오류입니다.");
		}
	}

	private static boolean searchArray(int[] numArray, int number)throws NotFoundException {
		for(int i =0;i<numArray.length;i++) {
			if(numArray[i]==number){
				return true;
			}
		}
		throw new NotFoundException("오류입니다.");
	}

}




