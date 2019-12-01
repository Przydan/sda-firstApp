package dal;

import entity.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class MovieDAOImpl implements MovieDAO {

    EntityManagerFactory entityManagerFactory;

    public MovieDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


    @Override
    public Movie findByID() {
        return null;
    }

    @Override
    public void create(Movie movie) {
        // EntityManager to de facto sesja
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            entityManager.close();
        }

    }

    @Override
    public List<Movie> findAll() {
        return null;
    }
}
