public class OverdraftException extends Exception {
/*
I try to make my own exception to prevent an overdraft
 */
    public OverdraftException(String exceptionMsg){

        System.out.println("in OverdraftException" + exceptionMsg);

    }
}
