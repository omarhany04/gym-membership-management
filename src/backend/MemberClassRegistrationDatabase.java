package backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MemberClassRegistrationDatabase extends MainBase {

    public MemberClassRegistrationDatabase(String filename) {
        super(filename);
    }

    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] data = line.split(",");

        if (data.length == 4) {
            return new MemberClassRegistration(data[0], data[1], data[2],
                    LocalDate.parse(data[3], DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }
        return null;
    }

}
