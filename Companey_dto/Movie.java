package Companey_dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int M_id;
    private String M_name;
    private  String M_during;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Actors> a1;

    public int getM_id() {
        return M_id;
    }

    public void setM_id(int m_id) {
        M_id = m_id;
    }

    public String getM_name() {
        return M_name;
    }

    public void setM_name(String m_name) {
        M_name = m_name;
    }

    public String getM_during() {
        return M_during;
    }

    public void setM_during(String m_during) {
        M_during = m_during;
    }

    public List<Actors> getA1() {
        return a1;
    }

    public void setA1(List<Actors> a1) {
        this.a1 = a1;
    }
}
