package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private int mark;

    public Student() {
    }

    public Student(String name,int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}
