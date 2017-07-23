package hfj_examlpes;

public class BeerSong {
	public static void main (String args[]) {
		int beerNum = 21;
		String word = "beers";
		
		while (beerNum > 0){
			if (beerNum == 1){
				
				word = "beer";

			}
			
			System.out.println("Count of " + word + " left is " + beerNum);
			beerNum -= 1;
		}
		
	}
}