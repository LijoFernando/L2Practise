package L3Task.mailSystem;

public class Mail {
    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int sID;
    private String from;
    private String to;
    private String subject;
    private String content;
    private String status;

    @Override
    public String toString() {
        return sID +"       " + from +"        "+ to +"       "+ subject +"        " + content +"       " + status ;
    }
}
