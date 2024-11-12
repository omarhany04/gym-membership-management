package backend;

public class MemberDatabase extends MainBase {

    public MemberDatabase(String filename) {
        super(filename);
    }

    @Override
    public Member createRecordFrom(String line) {
        String[] data = line.split(",");
        if (data.length == 6) {
            return new Member(data[0], data[1], data[2], data[3], data[4], data[5]);
        }
        return null;
    }

}
