import java.util.Scanner;

class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Total number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        // Initialize the deck with combinations of ranks and suits
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Generate a random card number
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        // If the cards can't be evenly distributed, return null
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The number of cards cannot be evenly distributed.");
            return null;
        }

        // Initialize 2D array to store cards for each player
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];

        // Distribute the cards
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();
        int numOfCards = deck.length;

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Get the number of players and number of cards to distribute
        System.out.println("Enter the number of players:");
        int numOfPlayers = sc.nextInt();

        // Distribute the cards to players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);

        // Print the players and their cards
        printPlayersCards(players);
    }
}
