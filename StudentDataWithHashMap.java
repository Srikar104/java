import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentDataWithHashMap {

        public static class Student {
            private String firstName;
            private String lastName;
            private double gpa;

            public Student(String firstName, String lastName, double gpa) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.gpa = gpa;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public double getGpa() {
                return gpa;
            }

            @Override
            public String toString() {
                return firstName + " " + lastName + " (GPA: " + gpa + ")";
            }
        }

        public static void main(String[] args) {
            Map<String, Student> studentMap = new HashMap<>();

            // Adding student objects to the HashMap
            studentMap.put("Srikar", new Student("Srikar", "Reddy", 3.9));
            studentMap.put("Jackie", new Student("Jackie", "Chan", 3.0));
            studentMap.put("Mike", new Student("Mike", "Tyson", 3.2));
            studentMap.put("Micheal", new Student("Micheal", "Clarke", 3.9));
            studentMap.put("Amazon", new Student("Amazon", "Alexa", 3.7));
            studentMap.put("Scarlet", new Student("Scarlet", "Jackson", 3.4));
            studentMap.put("Sara", new Student("Sara", "Tendulkar", 3.6));
            studentMap.put("Dua", new Student("Dua", "Lipa", 3.3));

            // Print using Entry Set
            System.out.println("Printing using Entry Set:");
            studentMap.entrySet().forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
            System.out.println();

            // Print using map's forEach method
            System.out.println("Printing using map's forEach method:");
            studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
            System.out.println();

            // Print using keySet and Iterator
            System.out.println("Printing using keySet and Iterator:");
            Iterator<Map.Entry<String, Student>> iterator = studentMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Student> entry = iterator.next();
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }


