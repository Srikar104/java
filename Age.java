package Age;

public class Person {
    public static void printAge(int age){

        if(age < 13){
            System.out.println("Kid");
        }else if (age > 13 && age <19) {
            System.out.println("Teen");
        }else {
            System.out.println("Adult");
        }

        }

    }
    public static void main(String[] args){
        printAge(inputage);
    }
