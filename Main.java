import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		Deck blackjack = new Deck();
		Hand hand_player = blackjack.NewHand();
		Hand hand_bank = blackjack.NewHand();

		System.out.println("This is a one-player blackjack game against the bank");
		System.out.println(blackjack);
		// System.out.println("player:" + hand_player);
		// System.out.println("bank:" + hand_bank);
		//        System.out.println("TEMOIN, Complete deck : " + blackjack);
		// System.out.println("Fin");
	}
}
