package arrayobjects;

import java.util.*;

public class ArrayObjects {

    public static void main(String[] args) {

        Student[] list = new Student[3];

        for (int i = 0; i < list.length; i++) {
            //initiating the scanner class
            Scanner sc = new Scanner(System.in);
            //initaiating the student class
            Student s = new Student();

            // getting and assiging the variables
            System.out.print("Enter the name: ");
            String name = sc.next();
            System.out.print("Enter the age: ");
            int age = sc.nextInt();

            // now setting the variables in the objects
            s.setName(name);
            s.setAge(age);

            // and assiging the value of objec to respective index number
            list[i] = s;
        }

        for (Student x : list) {
            System.out.println(x.getName() + " " + x.getAge());
        }
    }
}
