package services;

import implementations.Mentor;

public class MentorAccount {

    Mentor mentor;

    public MentorAccount(Mentor mentor){
        this.mentor = mentor;
    }

    public void createAccount(){
        this.mentor.createAccount();
    }



}
