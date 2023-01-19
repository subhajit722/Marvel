package Companey_dao;

import Companey_dto.Companey;
import Companey_dto.Movie;
import Companey_dto.Movie_Univers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class One_to_One {

    static EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
    static EntityManager e2 = e1.createEntityManager();
    static EntityTransaction e3 = e2.getTransaction();

    public void insert(Companey c1) {


        e3.begin();
        e2.persist(c1);

        e3.commit();
        System.out.println("DATA IS INSETRTED");


    }


    public void insert_r( List<Movie> pq) {

        for (Movie m1 : pq) {
            e3.begin();
            e2.persist(m1);

            e3.commit();
        }

        System.out.println("DATA IS INSETRTED");


    }
}
