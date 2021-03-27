package billservice.exceprion;

public class BillNotFoundException extends RuntimeException{

    public BillNotFoundException(String message){
        super(message);
    }
}
