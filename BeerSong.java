
public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall " + beerNum + " " + word + " of beer.");
			beerNum--;
			if (beerNum == 1) {
				word = "bottle";
			}
			if (beerNum == 0) {
				word = "bottles";
			}
			System.out.println("take one down and pass it around " + beerNum + " " + word + " of beer on the wall");
		}

		System.out.println("no more bottles of beer on the wall");

	}

}
