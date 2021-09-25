package L3Task.trainTicket;

public class PassengerInfo {
    private String name;
    private Integer age;
    private char prebreth;
    private String allotedBreth;
    private String ticket;
    private Integer bookID;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public char getPrebreth() { return prebreth;    }

    public void setPrebreth(char prebreth) {  this.prebreth = prebreth;  }

    public String getAllotedBreth() {
        return allotedBreth;
    }

    public void setAllotedBreth(String allotedBreth) { this.allotedBreth = allotedBreth; }

    public Integer getBookID() { return bookID; }

    public void setBookID(Integer bookID) { this.bookID = bookID;}

    @Override
    public String toString(){
        return "BookID: "+getBookID()+" Name: "+getName()+" Age: "+getAge()+" Breth: "+getAllotedBreth()+" Status: "+getStatus();
    }
}
