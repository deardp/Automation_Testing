package com.thecardgame;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Tests for Card Game.
 */
public class CardGameTesting {
    CardGameHelpers cardGameHelpers = new CardGameHelpers();
    /**
     * Test to create a new deck of cards and shuffle it.
     */
    @Test
    public void testCreateNewAndShuffleDeck() {
        Response response = cardGameHelpers.createNewAndShuffleDeck();
        JSONObject jsonObject = new JSONObject(response.readEntity(String.class));
        // validate success field and should be true.
        Assert.assertTrue(jsonObject.getBoolean("success"));
        // validate and make sure remaining cards are 52.
        Assert.assertEquals(jsonObject.getInt("remaining"), 52);
        // validate and make sure deck id is not null.
        Assert.assertNotNull(jsonObject.getString("deck_id"));
    }

    /**
     * Test to deal three cards to two players.
     */
    @Test
    public void testDealThreeCardToTwoPlayers() {
        Response response = cardGameHelpers.createNewAndShuffleDeck();
        JSONObject jsonObject = new JSONObject(response.readEntity(String.class));
        String deckId = jsonObject.getString("deck_id");
        response = cardGameHelpers.drawCards(deckId, 3);
        jsonObject = new JSONObject(response.readEntity(String.class));
        // validate success field and should be true.
        Assert.assertTrue(jsonObject.getBoolean("success"));
        // validate and make sure remaining cards are 49.(since we draw 3)
        Assert.assertEquals(jsonObject.getInt("remaining"), 49);
        // validate and make sure the number of cards drawn are 3.
        Assert.assertEquals(jsonObject.getJSONArray("cards").length(), 3);
    }

    /**
     * Test to identify the winner of the game.
     */
    @Test
    public void testIdentifyTheBlackJackWinner() {
        Response response = cardGameHelpers.createNewAndShuffleDeck();
        JSONObject jsonObject = new JSONObject(response.readEntity(String.class));
        String deckId = jsonObject.getString("deck_id");
        Response responsePlayer1 = cardGameHelpers.drawCards(deckId, 3);
        int player1Score = cardGameHelpers.findPlayerScore(responsePlayer1);
        Response responsePlayer2 = cardGameHelpers.drawCards(deckId, 3);
        int player2Score = cardGameHelpers.findPlayerScore(responsePlayer2);
        System.out.println("Winner is: " + findOutWinner(player1Score, player2Score) +":::" +
                "Player 1 Score: " + player1Score + ":::" +
                "Player 2 Score: " + player2Score);
    }

    private String findOutWinner(int player1Score, int player2Score) {
        if (player1Score > 21 && player2Score > 21) {
            return "No Winner";
        } else if (player1Score > 21) {
            return "Player 2";
        } else if (player2Score > 21) {
            return "Player 1";
        } else if (player1Score == 21 && player2Score == 21) {
            return "No Winner";
        } else if (player1Score == 21) {
            return "Player 1";
        } else if (player2Score == 21) {
            return "Player 2";
        } else if (player1Score > player2Score) {
            return "Player 1";
        } else if (player2Score > player1Score) {
            return "Player 2";
        } else {
            return "No Winner";
        }
    }
}
