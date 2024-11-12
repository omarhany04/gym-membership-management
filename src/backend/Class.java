package backend;

public class Class implements TMC {

    private String classId;
    private String className;
    private String trainerId;
    private int duration;
    private int availableSeats;

    public Class(String classId, String className, String trainerId, int duration, int availableSeats) {
        this.classId = classId;
        this.className = className;
        this.trainerId = trainerId;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public int getDuration() {
        return duration;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String lineRepresentation() {

        return classId + "," + className + "," + trainerId + "," + duration + "," + availableSeats;

    }

    @Override
    public String getSearchKey() {
        return classId;
    }
}
