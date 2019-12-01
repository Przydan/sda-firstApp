import dal.MovieDAOImpl;
import dal.StudentDAOImpl;
import entity.Movie;
import entity.Student;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FirstApp {
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("PU1");
        MovieDAOImpl movieDAO = new MovieDAOImpl(entityManagerFactory);

        Movie movie = new Movie("Wiedźmin", 1995, 2.30d, "fantastyczny");

        movieDAO.create(movie);

//        StudentDAOImpl studentDAO = new StudentDAOImpl(entityManagerFactory);
//
//        Student student = new Student();
//        student.setName("test");
//        student.setId(1);
//
//        studentDAO.create(student);
    }
}
