package Companey_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int A_id;
    private String A_name;
    private String A_ROLL;

    public int getA_id() {
        return A_id;
    }

    public void setA_id(int a_id) {
        A_id = a_id;
    }

    public String getA_name() {
        return A_name;
    }

    public void setA_name(String a_name) {
        A_name = a_name;
    }

    public String getA_ROLL() {
        return A_ROLL;
    }

    public void setA_ROLL(String a_ROLL) {
        A_ROLL = a_ROLL;
    }
}
