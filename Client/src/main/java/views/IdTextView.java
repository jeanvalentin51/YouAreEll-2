package views;

import models.Id;

public class IdTextView {

    private Id idToDisplay;

    public IdTextView(Id idToDisplay) {
        this.idToDisplay = idToDisplay;
    }
    @Override public String toString() {

       String idJson = "{\n" +
                "\"userid\" : " + idToDisplay.getUserId() + "\"\n" +
                "\"name\" \" : " + idToDisplay.getName() + "\"\n" +
                "\"github\" : \"" + idToDisplay.getGitHubId() + "\"\n" +
                "}";

        return idJson;
    } 
}