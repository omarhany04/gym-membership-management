package backend;

public class ClassDatabase extends MainBase {

    public ClassDatabase(String filename) {
        super(filename);
    }

    @Override
    public Class createRecordFrom(String line) {
        String[] data = line.split(",");
        if (data.length == 5) {
            return new Class(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
        }
        return null;
    }

}
