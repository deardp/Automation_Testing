package com;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.Image;
import com.paypal.selion.platform.html.Link;
import com.paypal.selion.platform.html.Label;

public class CheckersHomePage extends BasicPageImpl {

    private Image space51Image;
    private Link rulesLink;
    private Label firstBoardRowLabel;
    private Link restartLink;
    private Image space22Image;
    private Label boardLabel;
    private Image space33Image;
    private Image space62Image;
    private Label makeAMoveLabel;
    private Image space53Image;
    private Label secondBoardRowLabel;
    private Image space11Image;
    private Label thirdBoardRowLabel;
    private Image space31Image;
    private Image space42Image;
    private Image space13Image;


     /**
     * SeLion GUI Html Object Standard
     *    
     * The naming conventions followed in SeLion for html elements are as follows,
     *
     * <alias>{corresponding class name of the html element in SeLion} where - <alias> will be the object name with its 
     * first letter in lowercase.
     * 
     * <alias>Button                For Button html element.
     * <alias>CheckBox              For Check Box html element.
     * <alias>DatePicker            For Date Picker html element.
     * <alias>Form                  For Form html element.
     * <alias>Image                 For Image html element.
     * <alias>Label                 For Label html element.
     * <alias>Link                  For Link html element.
     * <alias>RadioButton           For Radio Button html element.
     * <alias>List                  For Select List html element.
     * <alias>Table                 For Table html element.
     * <alias>TextField             For Text Field html element.
     * <alias>Container             For Container html element.
     * 
     */
     

    private static String CLASS_NAME = "CheckersHomePage";
    private static String PAGE_DOMAIN = "";


    /**
     * Creates a new CheckersHomePage object
     */
    public CheckersHomePage() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new CheckersHomePage object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public CheckersHomePage(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public CheckersHomePage getPage() {
        return this;
    }



    /**
     * Used to get space51Image in the page CheckersHomePage
     *
     * @return space51Image
     */
    public Image getSpace51Image() {
        Image element = this.space51Image;
        if(element == null) {
            this.space51Image = new Image(getObjectMap().get("space51Image"), "space51Image",
                    this);
        }
        return this.space51Image;
    }



    /**
     * Used to get rulesLink in the page CheckersHomePage
     *
     * @return rulesLink
     */
    public Link getRulesLink() {
        Link element = this.rulesLink;
        if(element == null) {
            this.rulesLink = new Link(getObjectMap().get("rulesLink"), "rulesLink",
                    this);
        }
        return this.rulesLink;
    }

    /**
     * Used to check the control rulesLink in the page CheckersHomePage and wait for the object to load.
     */
    public void clickRulesLink(Object... expected) {
        getRulesLink().click(expected);
    }

    /**
     * Used to click rulesLink in the page CheckersHomePage
     */
    public void clickRulesLink() {
        getRulesLink().click();
    }



    /**
     * Used to get firstBoardRowLabel in the page CheckersHomePage
     *
     * @return firstBoardRowLabel
     */
    public Label getFirstBoardRowLabel() {
        Label element = this.firstBoardRowLabel;
        if(element == null) {
            this.firstBoardRowLabel = new Label(getObjectMap().get("firstBoardRowLabel"), "firstBoardRowLabel",
                    this);
        }
        return this.firstBoardRowLabel;
    }

    /**
     * Used to check for the specific text available in the control firstBoardRowLabel
     */
    public boolean isTextPresentForFirstBoardRowLabel(String pattern) {
        return getFirstBoardRowLabel().isTextPresent(pattern);
    }



    /**
     * Used to get restartLink in the page CheckersHomePage
     *
     * @return restartLink
     */
    public Link getRestartLink() {
        Link element = this.restartLink;
        if(element == null) {
            this.restartLink = new Link(getObjectMap().get("restartLink"), "restartLink",
                    this);
        }
        return this.restartLink;
    }

    /**
     * Used to check the control restartLink in the page CheckersHomePage and wait for the object to load.
     */
    public void clickRestartLink(Object... expected) {
        getRestartLink().click(expected);
    }

    /**
     * Used to click restartLink in the page CheckersHomePage
     */
    public void clickRestartLink() {
        getRestartLink().click();
    }



    /**
     * Used to get space22Image in the page CheckersHomePage
     *
     * @return space22Image
     */
    public Image getSpace22Image() {
        Image element = this.space22Image;
        if(element == null) {
            this.space22Image = new Image(getObjectMap().get("space22Image"), "space22Image",
                    this);
        }
        return this.space22Image;
    }



    /**
     * Used to get boardLabel in the page CheckersHomePage
     *
     * @return boardLabel
     */
    public Label getBoardLabel() {
        Label element = this.boardLabel;
        if(element == null) {
            this.boardLabel = new Label(getObjectMap().get("boardLabel"), "boardLabel",
                    this);
        }
        return this.boardLabel;
    }

    /**
     * Used to check for the specific text available in the control boardLabel
     */
    public boolean isTextPresentForBoardLabel(String pattern) {
        return getBoardLabel().isTextPresent(pattern);
    }



    /**
     * Used to get space33Image in the page CheckersHomePage
     *
     * @return space33Image
     */
    public Image getSpace33Image() {
        Image element = this.space33Image;
        if(element == null) {
            this.space33Image = new Image(getObjectMap().get("space33Image"), "space33Image",
                    this);
        }
        return this.space33Image;
    }



    /**
     * Used to get space62Image in the page CheckersHomePage
     *
     * @return space62Image
     */
    public Image getSpace62Image() {
        Image element = this.space62Image;
        if(element == null) {
            this.space62Image = new Image(getObjectMap().get("space62Image"), "space62Image",
                    this);
        }
        return this.space62Image;
    }



    /**
     * Used to get makeAMoveLabel in the page CheckersHomePage
     *
     * @return makeAMoveLabel
     */
    public Label getMakeAMoveLabel() {
        Label element = this.makeAMoveLabel;
        if(element == null) {
            this.makeAMoveLabel = new Label(getObjectMap().get("makeAMoveLabel"), "makeAMoveLabel",
                    this);
        }
        return this.makeAMoveLabel;
    }

    /**
     * Used to check for the specific text available in the control makeAMoveLabel
     */
    public boolean isTextPresentForMakeAMoveLabel(String pattern) {
        return getMakeAMoveLabel().isTextPresent(pattern);
    }



    /**
     * Used to get space53Image in the page CheckersHomePage
     *
     * @return space53Image
     */
    public Image getSpace53Image() {
        Image element = this.space53Image;
        if(element == null) {
            this.space53Image = new Image(getObjectMap().get("space53Image"), "space53Image",
                    this);
        }
        return this.space53Image;
    }



    /**
     * Used to get secondBoardRowLabel in the page CheckersHomePage
     *
     * @return secondBoardRowLabel
     */
    public Label getSecondBoardRowLabel() {
        Label element = this.secondBoardRowLabel;
        if(element == null) {
            this.secondBoardRowLabel = new Label(getObjectMap().get("secondBoardRowLabel"), "secondBoardRowLabel",
                    this);
        }
        return this.secondBoardRowLabel;
    }

    /**
     * Used to check for the specific text available in the control secondBoardRowLabel
     */
    public boolean isTextPresentForSecondBoardRowLabel(String pattern) {
        return getSecondBoardRowLabel().isTextPresent(pattern);
    }



    /**
     * Used to get space11Image in the page CheckersHomePage
     *
     * @return space11Image
     */
    public Image getSpace11Image() {
        Image element = this.space11Image;
        if(element == null) {
            this.space11Image = new Image(getObjectMap().get("space11Image"), "space11Image",
                    this);
        }
        return this.space11Image;
    }



    /**
     * Used to get thirdBoardRowLabel in the page CheckersHomePage
     *
     * @return thirdBoardRowLabel
     */
    public Label getThirdBoardRowLabel() {
        Label element = this.thirdBoardRowLabel;
        if(element == null) {
            this.thirdBoardRowLabel = new Label(getObjectMap().get("thirdBoardRowLabel"), "thirdBoardRowLabel",
                    this);
        }
        return this.thirdBoardRowLabel;
    }

    /**
     * Used to check for the specific text available in the control thirdBoardRowLabel
     */
    public boolean isTextPresentForThirdBoardRowLabel(String pattern) {
        return getThirdBoardRowLabel().isTextPresent(pattern);
    }



    /**
     * Used to get space31Image in the page CheckersHomePage
     *
     * @return space31Image
     */
    public Image getSpace31Image() {
        Image element = this.space31Image;
        if(element == null) {
            this.space31Image = new Image(getObjectMap().get("space31Image"), "space31Image",
                    this);
        }
        return this.space31Image;
    }



    /**
     * Used to get space42Image in the page CheckersHomePage
     *
     * @return space42Image
     */
    public Image getSpace42Image() {
        Image element = this.space42Image;
        if(element == null) {
            this.space42Image = new Image(getObjectMap().get("space42Image"), "space42Image",
                    this);
        }
        return this.space42Image;
    }



    /**
     * Used to get space13Image in the page CheckersHomePage
     *
     * @return space13Image
     */
    public Image getSpace13Image() {
        Image element = this.space13Image;
        if(element == null) {
            this.space13Image = new Image(getObjectMap().get("space13Image"), "space13Image",
                    this);
        }
        return this.space13Image;
    }

}

