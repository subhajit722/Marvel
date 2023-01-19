package Companey_CONtrolar;

import Companey_dao.One_to_One;
import Companey_dto.*;

import java.util.ArrayList;
import java.util.List;

public class OnO_insert {

    public static void main(String[] args) {

        Companey c1  = new Companey();
        c1.setC_name("MARVEL");
        c1.setC_type("ENTERTAINMENT");
        c1.setC_Founder_name("stan_Lee");

        Movie_Univers mu  = new Movie_Univers();
        mu.setU_name("MARVEL CINEMATIC UNIVERSE");
        mu.setU_CEO_name("Kevin Feige");

        Actors aa =new Actors();
        aa.setA_name("tony");
        aa.setA_ROLL("Iron_man");


        Actors aa1 =new Actors();
        aa1.setA_name("stev");
        aa1.setA_ROLL("Captain_amarica");


        Actors aa2 =new Actors();
        aa2.setA_name("natasa");
        aa2.setA_ROLL("blackwidwo");


        Actors aa3 =new Actors();
        aa3.setA_name("bures");
        aa3.setA_ROLL("hulk");


List <Actors> a1 = new ArrayList<>();

a1.add(aa);
a1.add(aa1);
        a1.add(aa2);
        a1.add(aa3);



        Movie mo = new Movie();
        mo.setM_name("IRON_MAN");
        mo.setM_during("120min");
        mo.setA1(a1);

        Movie mo1 = new Movie();
        mo1.setM_name("CAPTAIN_AMARICA");
        mo1.setM_during("120min");



        Movie mo2 = new Movie();
        mo2.setM_name("THOR");
        mo2.setM_during("120min");


        Movie mo3 = new Movie();
        mo3.setM_name("HULK");
        mo3.setM_during("120min");



List <Movie> ml = new ArrayList<>();
        ml.add(mo);
        ml.add(mo1);
        ml.add(mo2);
        ml.add(mo3);





        Phase p1 =new Phase();
        p1.setP_name("Avenger_asamble");
        p1.setTotall_no_movie(4);
        p1.setM1(mo);
        p1.setM1(mo1);
        p1.setM1(mo2);
        p1.setM1(mo3);

        Phase p2 =new Phase();
        p2.setP_name("Avenger_AGEOFULTRON");
        p2.setTotall_no_movie(4);
        p2.setM1(mo);
        p2.setM1(mo1);
        p2.setM1(mo2);
        p2.setM1(mo3);


        Phase p3 =new Phase();
        p3.setP_name("Avenger_INFINITY_WAR");
        p3.setTotall_no_movie(4);
        p3.setM1(mo);
        p3.setM1(mo1);
        p3.setM1(mo2);
        p3.setM1(mo3);


        Phase p4 =new Phase();
        p4.setP_name("Avenger_END_GAME");
        p4.setTotall_no_movie(4);
        p4.setM1(mo);
        p4.setM1(mo1);
        p4.setM1(mo2);
        p4.setM1(mo3);

        List <Phase> ph = new ArrayList<>();
        ph.add(p1);
        ph.add(p2);
        ph.add(p3);
        ph.add(p4);



        One_to_One o1  =new One_to_One();
        mu.setP1(ph);

        c1.setMu(mu);
        o1.insert(c1);
        o1.insert_r(ml);







    }
}
