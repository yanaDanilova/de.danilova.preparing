import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().buildFirstName("Max").buildLastName("Musterman").buildMiddleName("Muster").buildAge(30).buildAddress("Munchen").buildCountry("Germany").buildGender("Man").buildPhone("3453443654646").build();
        System.out.println(person);


        List<Shape> shapes = Arrays.asList(new Square(),new Circle(),new Triangle());
        for(Shape shape: shapes){
            shape.draw();
        }


    }
}


