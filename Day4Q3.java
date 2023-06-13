class A {
    static int i;
    public static int cal(){
        return 45;

    }
    static{
        i = cal();
    }
}
class Main3{
    public static void main (String []args){
        System.out.print(A.cal());
        
        
    }
}












    

