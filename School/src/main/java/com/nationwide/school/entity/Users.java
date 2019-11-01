package com.nationwide.school.entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.lang.String;

@Entity
public class Users {
    @Id
    private int timeslot;
    private String firstname;
    private String lastname;
    private int room;

    public int getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(int timeslot) {
        this.timeslot = timeslot;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }


    public Users(String f, String l, int r, int t) {
        firstname = f;
        lastname = l;
        room = r;
        timeslot = t;


    }
    public Users(){}
}