package composition;

import java.util.ArrayList;

public class Member {
    private String name;
    private int memberId;
    private String memberType;
    private ArrayList<Booking> bookings;
    int count = 0;

    public Member(String name, int memberId, String memberType) {
        this.name = name;
        this.memberId = memberId;
        this.memberType = memberType;

    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberType() {
        return memberType;
    }


    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public int getActiveBookingCount() {

        for (Booking booking : bookings) {
            if (booking.isActive()) {
                count++;
            }
        }
        return count;
    }

    public int getMaxBookings() {
        return 3;
    }

    public boolean hasReachedMaxBookings() {
        return getActiveBookingCount() >= getMaxBookings();
    }

    public Booking findActiveBooking(TrainingSession session) {
        for (Booking booking : bookings) {
            if (booking.isActive() && booking.getTrainingSession() == session) {
                return booking;

            } //Kan skrives som "false", skal vi så ikke gøre det?

        }
        return null;
    }

    public boolean hasBooked (TrainingSession session) {
        return findActiveBooking(session) !=null;
    }

    public void printBookings () {
        System.out.println("Aktive bookinger for " + name + ": ");

        for (Booking booking : bookings) {
            if (booking.isActive()) {
                booking.printBooking();
            }
        }
    }

    public void printMember() {
        System.out.println("Navn: " + name);
        System.out.println("Member ID: " + memberId);
        System.out.println("Aktive bookinger: " + getActiveBookingCount());
    }
}