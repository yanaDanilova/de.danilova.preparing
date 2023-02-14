package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDao {
    public StudentDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;


    public void add(Student student){
      try(Session session = sessionFactory.getCurrentSession()){
          session.beginTransaction();
          session.save(student);
          session.getTransaction().commit();
      }
    }

    public void delete(int id){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            session.createQuery("DELETE Student WHERE id=:id").setParameter("id", id).executeUpdate();
            session.getTransaction().commit();
        }
    }

    public void updateNameById(String name, int id){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            session.createQuery("update Student s set s.name = :name where s.id=:id")
                    .setParameter("name",name)
                    .setParameter("id",id)
                    .executeUpdate();
            session.getTransaction().commit();
        }
    }

    public Student findById(int id){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            Student student = session.get(Student.class,id);
            session.getTransaction().commit();
            return student;
        }
    }

    public List<Student> findAll(){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            List<Student> students = session.createQuery("select  s from Student s").getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

}
