import java.util.Arrays;

public class Hand {
	String[] hand = {"", "","", "","", "","", "","", "","", ""};

	public void Hand (String[] deck){
		for (int i = 0; i < 10; i++) {
			hand[i] = deck[i];
		}
		System.out.println(hand);
		// return (hand);
	}

	public String toString() {
		return Arrays.toString(hand);
	}
}
