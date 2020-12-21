//prog contains error not compile
/*package shivaafoundation.javatutorial;
public class ThrowsDemo {
    static void throwone(){
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }
    public static void main (String args[]){
        throwOne();
    }
   }*/
class ThrowsDemo {
    static void throwone() throws IllegalAccessException {
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }
    public static void main (String args[]){
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(" Caught " + e);
        }
        
    }
   }