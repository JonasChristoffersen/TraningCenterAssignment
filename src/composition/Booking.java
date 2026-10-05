package composition;

public class Booking {
    private Member member;
    private TrainingSession trainingSession;
    private boolean active;

    public Booking(Member member, TrainingSession trainingSession) {
        this.member = member;
        this.trainingSession = trainingSession;
        this.active = true;
    }

    public void cancel() {
        if (isActive()) {
            active = false;
            TrainingSession.removeParticipant(member);
        }
    }

    public Member getMember() {
        return member;
    }

    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    public boolean isActive() {
        return active;
    }

    public void printBooking() {
        System.out.println("====== STATUS OF BOOKING ======"
                + "\n" + "Training session: " + getTrainingSession()
                + "\n" + "Member name: " + getMember()
                + "\n" + "Booking is active: " + isActive()
        );
    }
}
