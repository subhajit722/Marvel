package Companey_dto;

import javax.persistence.*;
import java.util.List;

@Entity

public class Movie_Univers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int U_id;
    private  String U_name;
    private  String U_CEO_name;
    @OneToMany(cascade = CascadeType.ALL)

    private List < Phase> p1;

    public void setP1(List<Phase> p1) {
        this.p1 = p1;
    }

    public int getU_id() {
        return U_id;
    }

    public void setU_id(int u_id) {
        U_id = u_id;
    }

    public String getU_name() {
        return U_name;
    }

    public void setU_name(String u_name) {
        U_name = u_name;
    }

    public String getU_CEO_name() {
        return U_CEO_name;
    }

    public void setU_CEO_name(String u_CEO_name) {
        U_CEO_name = u_CEO_name;
    }


}
