public class Crazy8sRunner2022
{
    // Note: you can find Card & CardPile documentation at https://bit.ly/CardStarterDocs or go in this project folder
    //            to Crazy8s2022/docs/allclasses-index.html and open that in a browser.

    public static void main(String[] args)
    {
        // use this code when you are testing out the two player classes. Comment it out when they are working correctly.
        runTestsOnPlayers();
        System.out.println("----------------------------------------- Starting game.");
        Referee ref = new Referee();
        ref.runGame();
    }

    public static void runTestsOnPlayers()
    {
        System.out.println("----------------------------------------- Running test code.");
        // Let's make a temporary deck of cards just for testing out our player classes.
        CardPile practiceDeck = CardPile.makeDeck(CardPile.ACE_LOW);

        System.out.println("Testing human player.");
        HumanPlayer testHP = new HumanPlayer();
        // add more stuff here to test out the methods you write in Human player.


        System.out.println("Testing computer player.");
        ComputerPlayer testCP = new ComputerPlayer();
        // add more stuff here to test out the methods you write in computer player.

    }

}
