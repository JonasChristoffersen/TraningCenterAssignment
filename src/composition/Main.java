package composition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Member m1 = new Member("Off", 1, "Standard");
        Member m2 = new Member("Jonas", 2, "Standard");
        Member m3 = new Member("Talha", 3, "Standard");
        Member m4 = new Member("Laura", 4, "Standard");

        FitnessCenter fitnessCenter = new FitnessCenter("pureGym");
        fitnessCenter.addMember(m1);
        fitnessCenter.addMember(m2);
        fitnessCenter.addMember(m3);
        fitnessCenter.addMember(m4);

        // TODO : Opret et FitnessCenter, og tilføj nogle medlemmer og træningstimer,
        //             så man kan prøve programmet med det samme. Giv det til UI'en.


        //FinalTest
        // Testdata, så man kan prøve programmet med det samme.
        /*center.addMember(new Member("Sara", 101));
        center.addMember(new Member("Ali", 102));
        center.addMember(new Member("Emma", 103));

        center.addSession(new TrainingSession("Yoga", "Mette", 2));
        center.addSession(new TrainingSession("Spinning", "Jonas", 1));
        center.addSession(new TrainingSession("Crossfit", "Lars", 10));
        center.addSession(new TrainingSession("Pilates", "Nadia", 5));*/


        UI ui = new UI(new Scanner(System.in), fitnessCenter); //TODO: skal rettes når et fitnessCenter er oprettet (FIXED!)
        ui.run();
    }
}
