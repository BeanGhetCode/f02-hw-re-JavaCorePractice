package Exception;

public class HW1209_EmptyListException extends Exception {
    public HW1209_EmptyListException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Lỗi: " + super.getMessage();
    }
}
