package com.checkersgame;

import org.testng.annotations.Test;
import com.checkergame.CheckersGameHelpers;
import com.paypal.selion.annotations.WebTest;
import com.thecardgame.CardGameHelpers;


public class CheckersGameTesting {

    private static final CheckersGameHelpers checkersGameHelpers = null;

    @Test
    @WebTest
    public void testCheckerBoardGame() {
        checkersGameHelpers.openHomePage();
        checkersGameHelpers.makeFiveLegalMoves();
        checkersGameHelpers.restartTheBoard();
        checkersGameHelpers.verifyFirstRowOfTheBoardAfterRestarting();
        checkersGameHelpers.verifySecondRowOfTheBoardAfterRestarting();
        checkersGameHelpers.verifyThirdRowOfTheBoardAfterRestarting();
    }
}
