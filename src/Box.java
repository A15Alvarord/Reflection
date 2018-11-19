public class Box<T> {
	
	Class<T> actualClass;
	
	public Box(Class<T> actualClass) {
		this.actualClass = actualClass;
		System.out.println("En Box<T>, T es: " + actualClass.getName());
	}
	
}
