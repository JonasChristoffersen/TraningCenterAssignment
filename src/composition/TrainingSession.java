package composition;

import java.util.ArrayList;

public class TrainingSession {
    private String title;
    private String instructor;
    private int capacity;
    private static ArrayList<Member> participants;

    public TrainingSession(String title, String instructor, int capacity){
        this.title = title;
        this.instructor = instructor;
        this.capacity = capacity;
        this.participants = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public String getInstructor() {
        return instructor;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setTitle() {
        this.title = title;
    }
    public void setInstructor() {
        this.instructor = instructor;
    }
    public void setCapacity() {
        this.capacity = capacity;
    }

    public boolean hasAvailableSpace(){
        return participants.size() < capacity;
    }

    public int getAvailableSpaces() {
        return capacity - participants.size();
    }

    public void addParticipant(Member member) {
        if (getAvailableSpaces() > 0) {
            participants.add(member);
        } else {
            System.out.println("Not enough capacity on this trainingsession!");
        }
    }

    public static void removeParticipant(Member member) {
        participants.remove(member);
    }


    public void printSession(){
        System.out.println("| Titel: " + title + "| Instruktør: " + instructor + "| Antal deltager: " + participants);
    }
}
