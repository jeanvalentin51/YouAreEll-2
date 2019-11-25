package models;

/* 
 * POJO for an Message object
 */
public class Message {

    private String message;
    private String fromId;
    private String toId;
    private String timestamp;
    private String sequence;

    public Message (String message, String fromId, String toId) {
        this.message = message;
        this.fromId = fromId;
        this.toId = toId;
        this.timestamp = "_";
        this.sequence = "-";
    }


    public Message(){
        this.message = null;
        this.fromId = null;
        this.toId = null;
        this.timestamp = "_";
        this.sequence = "-";
    }


    public String getSequence(){
        return this.sequence;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getFromId() {
        return this.fromId;
    }

    public String getToId() {
        return this.toId;
    }

    public String getMessage() {
        return this.message;
    }
}