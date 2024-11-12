package backend;

import java.time.LocalDate;

public class Lab4 {

    public static void main(String[] args) {
 
        AdminRole admin = new AdminRole();
        admin.addTrainer("T100", "omar", "omar@gmail.com", "boxing", "01001717312");
        admin.addTrainer("T101", "hany", "hany@gmail.com", "yoga", "01023434212");
        admin.addTrainer("T102", "seif", "seif@gmail.com", "fitness", "01009456421");
        admin.addTrainer("T103", "zein", "zein@gmail.com", "zomba", "01056123528");
        admin.addTrainer("T104", "nader", "nader@gmail.com", "spinning", "01093124516");
        
        admin.removeTrainer("T104");
        admin.logout();
        
        TrainerRole trainer = new TrainerRole();
        trainer.addClass("C100", "zomba", "T103", 30, 15);
        trainer.addClass("C200", "boxing", "T100", 60, 40);
        
        trainer.addMember("M100", "ahmed", "Weekly", " maher@gmail.com", "0101112245", "Active");
        trainer.addMember("M200", "amr", "Monthly", " amr@gmail.com", "0100234123", "Active");
        
        trainer.registerMemberForClass("M100", "C100", LocalDate.now());
        trainer.registerMemberForClass("M200", "C200", LocalDate.now());
        
        trainer.cancelRegistration("M100", " C100");
        trainer.logout();
    }
}
