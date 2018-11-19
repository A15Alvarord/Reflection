import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Box<T> {
	
	Class<T> actualClass;
	
	public Box(Class<T> actualClass) {
		this.actualClass = actualClass;
		System.out.println("En Box<T>, T es: " + actualClass.getName());
	}

	//Llamamos al toString de T creando un objeto en tiempo de ejecución con la API Reflection.
	public String toStringDeT() {
		String s = null;
		try {
			 s = actualClass.getConstructor(String.class, String.class).newInstance("Pedro", "Rodriguez").toString();
			 s += "\n" + actualClass.getConstructor().newInstance().toString();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public Integer getStaticPrivateVariable(){
		Method[] methods = actualClass.getDeclaredMethods();
		Integer i = null;
		for (Method method : methods) {
			if (method.getName().equals("getContadorDeInstancias")) {
				try {
					method.setAccessible(true);
					i = (Integer) method.invoke(null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return i;
	}
}
