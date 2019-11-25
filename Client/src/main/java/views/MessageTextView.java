package views;

import models.Message;

public class MessageTextView {

    private Message msgToDisplay;

    public MessageTextView(Message msgToDisplay) {
        this.msgToDisplay = msgToDisplay;
    }
    @Override public String toString() {

        String messageJson = "{\n" +
                "\"sequence\" : " + msgToDisplay.getSequence() + "\"\n" +
                "\"timestamp\" \" : " + msgToDisplay.getTimestamp() + "\"\n" +
                "\"fromid\" \" : " + msgToDisplay.getFromId() + "\"\n" +
                "\"toid\" \" : " + msgToDisplay.getToId() + "\"\n" +
                "\"message\" \" : " + msgToDisplay.getMessage() + "\"\n" +
                "}";

        return messageJson;

    } 
}