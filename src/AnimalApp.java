
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());
		System.out.println();

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		System.out.println();


		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());

	}
	private static void print(String s){
		System.out.println(s);
	}
}
