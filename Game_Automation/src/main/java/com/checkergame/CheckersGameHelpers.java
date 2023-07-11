package com.checkergame;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.CheckersHomePage;
import com.paypal.selion.platform.grid.Grid;


public class CheckersGameHelpers {
    private static final CheckersHomePage checkersHomePage = null;
    private static final String MAKE_A_MOVE = "Make a move.";

    private static final String SELECT_AN_ORANGE_PIECE_TO_MOVE = "Select an orange piece to move.";

    /**
     * Verifies that the home page is loaded and the board is visible.
     */
    public void openHomePage(){
        // Opens the checkers home page
        Grid.driver().get("https://www.gamesforthebrain.com/game/checkers/");
        // Verifies that the page is loaded by validating the board is present
        checkersHomePage.getBoardLabel().isElementPresent();
    }

    /**
     * Makes five legal moves which includes taking a blue piece.
     */
    public void makeFiveLegalMoves() {
        checkersHomePage.getSpace22Image().clickonly();
        checkersHomePage.getSpace13Image().click(checkersHomePage.getMakeAMoveLabel());
        // Once we make a legal move we will wait for label to be present to verify that the move was made
        // In this case we will wait for "Make a Move" label is present.
        // In this framework, we can pass the expected element as a parameter to the click method.
        // For ex: action.click(expected_element), this will wait for the expected element to be present after
        // clicking.
        checkersHomePage.getSpace62Image().clickonly();
        checkersHomePage.getSpace53Image().click(checkersHomePage.getMakeAMoveLabel());
        checkersHomePage.getSpace42Image().clickonly();
        checkersHomePage.getSpace33Image().click(checkersHomePage.getMakeAMoveLabel());
        checkersHomePage.getSpace51Image().clickonly();
        checkersHomePage.getSpace33Image().click(checkersHomePage.getMakeAMoveLabel());
        checkersHomePage.getSpace31Image().clickonly();
        checkersHomePage.getSpace53Image().click(checkersHomePage.getMakeAMoveLabel());
    }

    /**
     * Restarts the board by clicking on the restart link.
     */
    public void restartTheBoard() {
        checkersHomePage.clickRestartLink(checkersHomePage.getMakeAMoveLabel());
        // when we restart the board, the message from "Make a move" to "Select an orange piece to move" changes.
        Assert.assertEquals(checkersHomePage.getMakeAMoveLabel().getText(), SELECT_AN_ORANGE_PIECE_TO_MOVE);
    }

    /**
     * Verifies that the first row of the board has four orange pieces.
     */
    public void verifyFirstRowOfTheBoardAfterRestarting() {
        List<WebElement> elementList = checkersHomePage.getFirstBoardRowLabel().getElements();
        long count = elementList.stream().filter(element -> element.getAttribute("src").equals("you1.gif")).count();
        Assert.assertEquals(count, 4);
    }

    /**
     * Verifies that the second row of the board has four orange pieces.
     */
    public void verifySecondRowOfTheBoardAfterRestarting() {
        List<WebElement> elementList = checkersHomePage.getSecondBoardRowLabel().getElements();
        long count = elementList.stream().filter(element -> element.getAttribute("src").equals("you1.gif")).count();
        Assert.assertEquals(count, 4);
    }

    /**
     * Verifies that the third row of the board has four orange pieces.
     */
    public void verifyThirdRowOfTheBoardAfterRestarting() {
        List<WebElement> elementList = checkersHomePage.getThirdBoardRowLabel().getElements();
        // in the source code when we restart the board we could see 4 oranges at each row, that confirms that the
        // board is restarted.
        long count = elementList.stream().filter(element -> element.getAttribute("src").equals("you1.gif")).count();
        Assert.assertEquals(count, 4);

    }

}
