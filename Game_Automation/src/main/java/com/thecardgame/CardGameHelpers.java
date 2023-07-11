package com.thecardgame;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.testng.Assert;
import org.json.JSONObject;


/**
 * Helper methods for Card Game.
 */
public class CardGameHelpers {
    // URI for creating a new deck of cards and shuffle it.
    public static final String NEW_DECK_URI = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";

    // URI for drawing a card from the deck.
    public static final String DRAW_CARD_URI = "https://deckofcardsapi.com/api/deck/%s/draw/?count=%d";

    /**
     * Get the web target.
     * @param uri URI for the web target.
     * @return WebTarget object.
     */
    public static WebTarget getWebTarget(String uri) {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(uri);
        return target;
    }

    /**
     * Create a new deck of cards and shuffle it.
     * @return Response object.
     */
    public Response createNewAndShuffleDeck() {
        WebTarget target = getWebTarget(NEW_DECK_URI);
        // we can use post or get and will get the same response.
        Response response = target.request().post(Entity.entity("", MediaType.APPLICATION_JSON));
        // verify the response code.
        Assert.assertEquals(response.getStatus(), 200);
        return response;
    }

    /**
     * Deal the cards to player.
     * @param deckId Deck Id.
     * @param count Number of cards to be drawn.
     */
    public Response drawCards(String deckId, int count) {
        WebTarget target = getWebTarget(String.format(DRAW_CARD_URI, deckId, count));
        Response response = target.request().get();
        Assert.assertEquals(response.getStatus(), 200);
        return response;
    }

    /**
     * Find the score of the player.
     * @param response Response object.
     * @return Score of the player as Integer.
     */
    public Integer findPlayerScore(Response response) {
        // Read the response into a json object.
        JSONObject jsonObject = new JSONObject(response.readEntity(String.class));
        // Initialize the player score to zero.
        int playerScore = 0;
        // Each json object contains array of cards. Iterate through each card object and find the score
        // by reading the filed "value". for ex: "value": "KING", "value": "ACE", "value": "2"
        for (int i = 0; i < jsonObject.getJSONArray("cards").length(); i++) {
            String value = jsonObject.getJSONArray("cards").getJSONObject(i).getString("value");
            if (value.equals("JACK") || value.equals("QUEEN") || value.equals("KING")) {
                playerScore += 10;
            } else if (value.equals("ACE")) {
                playerScore += 11;
            } else {
                // if the value is not JACK, QUEEN, KING or ACE, then it is a number
                // and then just add the 3 numbers.
                playerScore += Integer.parseInt(value);
            }
        }
        return playerScore;
    }
}
