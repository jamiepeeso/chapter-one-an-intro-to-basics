
public class SampleBooleanTests {

	public static void main(String[] args) {
		int x = 4;
		while (x > 3) {
			x--; //or x = x - 1
			System.out.println("I will only run once.");
		}
		int z = 27;
		while (z == 17) {
			System.out.println("I will never run");
			//loop will not run because z != 17
		}
	}

}
