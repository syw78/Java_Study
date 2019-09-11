package chapter15.ex14;

public class Pair<T> {
	private T apple;
	private T grape;
	
	public T getApple() {
		return apple;
	}

	public void setApple(T apple) {
		this.apple = apple;
	}

	public T getGrape() {
		return grape;
	}

	public void setGrape(T grape) {
		this.grape = grape;
	}

	public Pair(T apple, T grape) {
		super();
		this.apple = apple;
		this.grape = grape;
	}

	@Override
	public String toString() {
		return "Pair [apple=" + apple + ", grape=" + grape + "]";
	}
}
