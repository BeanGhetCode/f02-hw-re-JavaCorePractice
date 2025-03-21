package Exception;

public class HW1208_InvalidAmountException extends Exception{
    public HW1208_InvalidAmountException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Lỗi: " + super.getMessage();
    }
}
