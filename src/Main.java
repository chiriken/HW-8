import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1 //

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.println(fullName);

        // task 2 //

        System.out.println(fullName.toUpperCase());

        // task 3 //

        String fullName1 = "Иванов Семён Семёнович";
        String correction = fullName1.replace('ё', 'е');
        System.out.println(correction);







    }
}
