package Companey_dto;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

@Entity
public class Phase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Phase;
    private  String P_name;
    private int Totall_no_movie;

    public int getPhase() {
        return Phase;
    }

    public void setPhase(int phase) {
        Phase = phase;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String p_name) {
        P_name = p_name;
    }

    public int getTotall_no_movie() {
        return Totall_no_movie;
    }

    public void setTotall_no_movie(int totall_no_movie) {
        Totall_no_movie = totall_no_movie;
    }



    @ManyToOne(cascade = CascadeType.ALL)
    private  Movie m1;

    public Movie getM1() {
        return m1;
    }

    public void setM1(Movie m1) {
        this.m1 = m1;
    }
}
