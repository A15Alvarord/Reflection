public class Main {

	public static void main(String[] args){
		Box<Persona> box = new PersonBox();
		System.out.println(box.toStringDeT());
		System.out.println("Se han creado" + box.getStaticPrivateVariable() + "instancias");
	}
}
