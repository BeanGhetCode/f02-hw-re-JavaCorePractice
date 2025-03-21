package Exception;

public class HW1208_InsufficientFundsException extends Exception {
    private int deficit;

    public HW1208_InsufficientFundsException(String message){
        super(message);
    }

    public HW1208_InsufficientFundsException(String message, int deficit){
        super(message);
        this.deficit = deficit;
    }

    public int getDeficit(){
        return deficit;
    }

    @Override
    public String toString() {
        return "Lỗi!" + super.getMessage();
    }
}
