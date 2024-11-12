package backend;

public class TrainerDatabase extends MainBase {

    public TrainerDatabase(String filename) {
        super(filename);
    }

    @Override
    public Trainer createRecordFrom(String line) {
        String[] data = line.split(",");
        if (data.length == 5) {
            return new Trainer(data[0], data[1], data[2], data[3], data[4]);
        }
        return null;
    }

}
