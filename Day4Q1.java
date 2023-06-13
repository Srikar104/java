interface dog{
    public abstract void sound();
}
interface cat {
    public abstract void tail();
}
class animal implements cat,dog{
public void sound(){
    System.out.println("bow bow");
}
public void tail(){
    System.out.println("Have only one tail");
}
}
public  class Srikar {
    public static void main(String[] args){
        animal obj = new animal();
        obj.sound();
        obj.tail();

    }
    
}
