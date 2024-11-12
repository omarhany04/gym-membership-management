package backend;

public class Trainer implements TMC {

    private String trainerId;
    private String name;
    private String email;
    private String speciality;
    private String phoneNumber;

    public String getTrainerId() {
        return trainerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Trainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String lineRepresentation() {

        String s = trainerId + "," + name + "," + email + "," + speciality + "," + phoneNumber;

        return s;

    }

    @Override
    public String getSearchKey() {
        return trainerId;
    }

}
