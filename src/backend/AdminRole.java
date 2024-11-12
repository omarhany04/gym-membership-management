package backend;

import java.util.ArrayList;

public class AdminRole {

    private TrainerDatabase database;

    public AdminRole() {
        database = new TrainerDatabase("Trainers.txt");
        database.readFromFile();
    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer t = new Trainer(trainerId, name, email, specialty, phoneNumber);
        database.insertRecord(t);

    }

    public ArrayList<Trainer> getListOfTrainers() {
        ArrayList<TMC> p = database.returnAllRecords();

        ArrayList<Trainer> arr = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            arr.add((Trainer) p.get(i));
        }
        return arr;
    }

    public void removeTrainer(String Key) {
        database.deleteRecord(Key);
    }

    public boolean contains(String key) {
        return database.contains(key);
    }

    public void logout() {
        database.saveToFile();
    }
}
