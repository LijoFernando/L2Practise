package L3Task.TrainReservationSystem;

public class TicketForm {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;
    private int pnr;
    private int trainNo;
    private String trainName;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;




    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }


    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }


    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }


    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    private String classType;

    public String getDateJourney() {
        return dateJourney;
    }

    public void setDateJourney(String dateJourney) {
        this.dateJourney = dateJourney;
    }

    private String dateJourney;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private String origin;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String destination;

@Override
public String toString() {
    return "TicketForm{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", pnr=" + pnr +
            ", trainNo=" + trainNo +
            ", trainName='" + trainName + '\'' +
            ", classType='" + classType + '\'' +
            ", dateJourney='" + dateJourney + '\'' +
            ", origin='" + origin + '\'' +
            ", destination='" + destination + '\'' +
            ", status='" + status + '\'' +
            '}';
}



}
