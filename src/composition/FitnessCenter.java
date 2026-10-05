package composition;

import java.util.ArrayList;

public class FitnessCenter {
    private String name;
    private ArrayList<Member> member;
    private ArrayList<TrainingSession> session;


    public FitnessCenter(String name){
        this.name = name;
        this.member = new ArrayList<Member>();
        this.session = new ArrayList<TrainingSession>();

    }

    public boolean bookSession(Member member, TrainingSession session) {
        if (hasBooked(member) && !hasAvailableSpace(session) && !hasReachedMaxBooking(member)){
            // opretter et object
            Booking mb1 = new Booking(member, session);
            member.addBooking(mb1);
            session.addParticipant(member);
            System.out.println("Booking session confirmed");
            return true;
        } else {
            System.out.println("Afvis");
        return false;}
    }

    public void addMember(Member member) {
        this.member.add(member);
    }

    public boolean hasBooked(Member member){
        return true;
    }

    public boolean hasAvailableSpace(TrainingSession session){
        return false;
    }

    public boolean hasReachedMaxBooking(Member member){
        return true;
    }

    public String getName() {
        return name;
    }

    public boolean cancelBooking(Member member, TrainingSession session){
        member.findActiveBooking(session);
        return true;

    }
    public void findMember(int memberID){
        for (Member member : member) {
            if (member.getMemberId() == memberID) {
                member.getName();
            }
        }
    }

    public void findSession(String getTitle){

    }
    
    public void printAllMembers() {
        System.out.println("====== ALL MEMBERS ======");
        for (Member member : member) {
            System.out.println(member);
        }
    }

    public void printAllSessions() {
        System.out.println("====== ALL SESSIONS ======");
        for (TrainingSession trainingSession : session) {
            System.out.println(session);
        }
    }

public void addTrainingSession (TrainingSession session){

}
    


}
