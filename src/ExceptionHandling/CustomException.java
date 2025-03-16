package ExceptionHandling;

class PrintException extends Exception{
    public PrintException(String e){
        super(e);
        System.out.println("fsjfnsfsd");
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{

            throw new PrintException("Hello");
        } catch(PrintException printException){
            System.out.println(printException.getMessage());
        }
    }

}
