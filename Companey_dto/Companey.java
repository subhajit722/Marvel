package Companey_dto;

import javax.persistence.*;

@Entity
public class Companey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int C_id;

    private  String C_name;
    private  String C_type;
    private String C_Founder_name;
    @OneToOne(cascade = CascadeType.ALL)
    private  Movie_Univers mu;

    public int getC_id() {
        return C_id;
    }

    public void setC_id(int c_id) {
        C_id = c_id;
    }

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String c_name) {
        C_name = c_name;
    }

    public String getC_type() {
        return C_type;
    }

    public void setC_type(String c_type) {
        C_type = c_type;
    }

    public String getC_Founder_name() {
        return C_Founder_name;
    }

    public void setC_Founder_name(String c_Founder_name) {
        C_Founder_name = c_Founder_name;
    }

    public Movie_Univers getMu() {
        return mu;
    }

    public void setMu(Movie_Univers mu) {
        this.mu = mu;
    }
}
