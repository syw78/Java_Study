package chapter09.ex20;

public class Person implements Comparable{
	public String name;
	public int height;
	
	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	@Override
	public int compareTo(Object obj) {
		Person person=null;
		if(obj instanceof Person) {
			person=(Person)obj;
			if(this.height>person.height) {
				return this.height;
			}else if(this.height==person.height) {
				return 0;
			}else {
				return -1;
			}
		}
		return 0;
	}

}
