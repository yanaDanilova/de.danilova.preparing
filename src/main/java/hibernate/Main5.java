package hibernate;

import org.hibernate.SessionFactory;

public class Main5 {

    public static void main(String[] args) {

        SessionFactory sessionFactory = DBConnection.getSessionFactory();
        StudentDao studentDao = new StudentDao(sessionFactory);
        for(int i=1;i<=10;i++) {
            studentDao.add(new Student("St" + i, 5 + i));
        }
        studentDao.updateNameById("Max",1);
        System.out.println(studentDao.findById(1).getName());
        studentDao.delete(1);
        studentDao.findAll();
    }
}
