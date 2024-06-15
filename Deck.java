import java.util.Arrays;
import java.util.Collections;


public class Deck {
	String[] deck = deck();
	int pos = 0;

	public String[] deck() {
		String[] deck = {
			"Spade_King", "Spade_Queen", "Spade_Jack", "Spade_10", "Spade_9", "Spade_8", "Spade_7", "Spade_6", "Spade_5", "Spade_4", "Spade_3", "Spade_2", "Spade_Ace",
			"Club_King", "Club_Queen", "Club_Jack", "Club_10", "Club_9", "Club_8", "Club_7", "Club_6", "Club_5", "Club_4", "Club_3", "Club_2", "Club_Ace",
			"Heart_King", "Heart_Queen", "Heart_Jack", "Heart_10", "Heart_9", "Heart_8", "Heart_7", "Heart_6", "Heart_5", "Heart_4", "Heart_3", "Heart_2", "Heart_Ace",
			"Diamond_King", "Diamond_Queen", "Diamond_Jack", "Diamond_10", "Diamond_9", "Diamond_8", "Diamond_7", "Diamond_6", "Diamond_5", "Diamond_4", "Diamond_3", "Diamond_2", "Diamond_Ace"
		};

		// add 8 deck to decks
		String[] decks = new String[416];
		for (int i = 0; i < 8; i++) {
			System.arraycopy(deck, 0, decks, i * 52, 52);
		}

		Collections.shuffle(Arrays.asList(deck));
		//System.out.println(deck.getClass());
		// System.out.println("TEMOIN, Complete deck : " + Arrays.toString(deck));
		//System.out.println(deck.getClass());
		//        for (int i = 0; i< deck.length; i++) {
		//            System.out.println(deck[i]);
		//}
		return decks;
	}

	public String toString() {
		return Arrays.toString(deck);
	}

	public Hand NewHand() {
		Hand hand = new Hand();
		for (int i = 0; i < 10; i++) {
			hand.hand[i] = deck[pos++];
		}

		//System.out.println(hand);
		return hand;
	}

	//    public String[] Hand (String[] deck){
	//        String[] Hand = {"", "","", "","", "","", "","", "","", ""};
	//        Hand[0] = deck[0];
	//        System.out.println(Hand);
	//        return (Hand);
	//    }
	//    public static void Ascii_deck(String[] args) {
	//        String[] Deck_ascii = {
	//                // Spades: King to Ace
	//                "🂮", "🂭", "🂫", "🂪", "🂩", "🂨", "🂧", "🂦", "🂥", "🂤", "🂣", "🂢", "🂡",
	//                // Clubs: King to Ace
	//                "🃞", "🃝", "🃛", "🃚", "🃙", "🃘", "🃗", "🃖", "🃕", "🃔", "🃓", "🃒", "🃑",
	//                // Hearts: King to Ace
	//                "🂾", "🂽", "🂻", "🂺", "🂹", "🂹", "🂸", "🂷", "🂶", "🂵", "🂴", "🂳", "🂲",
	//                // Diamonds: King to Ace
	//                "🃎", "🃍", "🃋", "🃊", "🃉", "🃈", "🃇", "🃆", "🃅", "🃄", "🃃", "🃂", "🃁"
	//        };
	//
	//        //for (String card : Deck_ascii) {
	//            //System.out.print(card + " ");
	//        //}
	//
	//    }
	//    public char Draw(char[] Shuffle) {
	//
	//        return ;
	//    }
}
