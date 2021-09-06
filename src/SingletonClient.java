
public class SingletonClient {
	public static void main(String[] arg) {
		Singleton singleton = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
