package chapter09.ex20;

public class Test {

	public static void main(String[] args) {
		Person[] array = {new Person("ȫ�浿",260),new Person("�̱浿",270),new Person("���浿",280)};
		Person maxPerson=getMaximum(array);	
		System.out.println("����Űū��� = "+maxPerson.name+" Ű�� = "+maxPerson.height);
	}

	private static Person getMaximum(Person[] array) {
		Person max = array[0];
		for(int i=0;i<array.length;i++) {
			int number = max.compareTo(array[i]);
			if(max.compareTo(array[i])==-1) {		//if(max.height < array[i].height) {
				max=array[i];
			}
		}
		return max;
	}
}
