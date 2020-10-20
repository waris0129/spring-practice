package services;

import implementations.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor");
    }
}
