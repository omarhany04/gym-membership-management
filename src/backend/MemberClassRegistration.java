package backend;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class MemberClassRegistration implements TMC {

    private String memberId;
    private String classId;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberId, String classId, String status, LocalDate registrationDate) {
        this.memberId = memberId;
        this.classId = classId;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getClassId() {
        return classId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String getSearchKey() {
        return memberId + classId;
    }

    @Override
    public String lineRepresentation() {
        File f = new File("Registration.txt");
        try {
            PrintWriter pw = new PrintWriter(f);
            String s = memberId + "," + classId + "," + status + "," + registrationDate;
            pw.println(s);
            return s;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        return null;

    }
}
