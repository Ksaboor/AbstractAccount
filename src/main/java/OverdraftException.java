public class OverdraftException extends Exception {

    public OverdraftException(String exceptionMsg){
        System.out.println("in OverdraftException" + exceptionMsg);

    }
}
