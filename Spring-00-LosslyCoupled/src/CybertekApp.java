import implementations.Mentor;
import services.FullTimeMentor;
import services.MentorAccount;
import services.PartTimeMentor;

public class CybertekApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();

        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(partTime);

        mentor.createAccount();


    }

}
