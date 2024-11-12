package backend;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrainerRole {

    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;

    public TrainerRole() {
        memberDatabase = new MemberDatabase("Member.txt");
        classDatabase = new ClassDatabase("Class.txt");
        registrationDatabase = new MemberClassRegistrationDatabase("registration.txt");
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }

    public void addMember(String memberId, String name, String membershipType, String email, String phoneNumber,
            String status) {
        Member m = new Member(memberId, name, membershipType, email, phoneNumber, status);
        memberDatabase.insertRecord(m);
    }

    public ArrayList<Member> getListOfMembers() {
        ArrayList<TMC> p = memberDatabase.returnAllRecords();

        ArrayList<Member> arr = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            arr.add((Member) p.get(i));
        }
        return arr;
    }

    public void addClass(String classId, String className, String trainerId, int duration, int maxParticipants) {
        Class c = new Class(classId, className, trainerId, duration, maxParticipants);
        classDatabase.insertRecord(c);
    }

    public ArrayList<Class> getListOfClasses() {
        ArrayList<TMC> p = classDatabase.returnAllRecords();

        ArrayList<Class> arr = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            arr.add((Class) p.get(i));
        }
        return arr;
    }

    public boolean fullClass(String key) {
        if (((Class) classDatabase.getRecord(key)).getAvailableSeats() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean containsMember(String key) {
//        System.out.println(memberDatabase.contains(key));
        return memberDatabase.contains(key);
    }

    public boolean containsClass(String key) {
//        System.out.println(classDatabase.contains(key));
        return classDatabase.contains(key);
    }

    public boolean containsRegistration(String key) {
        return registrationDatabase.contains(key);
    }

    public boolean registerMemberForClass(String memberId, String classId, LocalDate registrationDate) {
        Class c = null;
        MemberClassRegistration r = null;
        if (classDatabase.contains(classId) && memberDatabase.contains(memberId)) {
            Member m = (Member) memberDatabase.getRecord(memberId);
            c = (Class) classDatabase.getRecord(classId);
            if (c.getAvailableSeats() != 0) {
                c.setAvailableSeats(c.getAvailableSeats() - 1);
            } else {
                return false;
            }
            String s = "";
            r = new MemberClassRegistration(memberId, classId, s, registrationDate);
            r.setStatus("Active");
            m.setStatus("active");
            registrationDatabase.insertRecord((TMC) r);
            return true;
        } else {
            System.out.println("Class not found");
            return false;
        }
    }

    public boolean cancelRegistration(String memberId, String classId) {
        MemberClassRegistration r = null;
        Class c = null;
        if (registrationDatabase.contains(memberId + classId)) {
            r = (MemberClassRegistration) registrationDatabase.getRecord(memberId + classId);
            c = (Class) classDatabase.getRecord(classId);
            if (ChronoUnit.DAYS.between(r.getRegistrationDate(), LocalDate.now()) <= 3) {
                r.setStatus("Cancelled");
                registrationDatabase.deleteRecord(memberId + classId);
                c.setAvailableSeats(c.getAvailableSeats() + 1);
                return true;
            }
        }
        return false;
    }

    public ArrayList<MemberClassRegistration> getListOfRegistrations() {
        ArrayList<TMC> p = registrationDatabase.returnAllRecords();

        ArrayList<MemberClassRegistration> arr = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            arr.add((MemberClassRegistration) p.get(i));
        }
        return arr;
    }

    public boolean trainerReader(String key) {
        String filePath = "Trainers.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(key)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("No file found");
        }
        return false;
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }
}
