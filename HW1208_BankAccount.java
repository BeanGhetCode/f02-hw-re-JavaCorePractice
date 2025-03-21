package Exception;

public class HW1208_BankAccount {
    private double balance;

    public HW1208_BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getSoDu() {
        return balance;
    }

    public void fundout(double amount) throws HW1208_InsufficientFundsException, HW1208_InvalidAmountException {
        if(amount <0){
            throw new HW1208_InvalidAmountException("Số tiền nhập vào không hợp lệ. Phải >0!");
        }
        if(amount > balance){
            throw new HW1208_InsufficientFundsException("Không đủ số dư trong tài khoản");
        }
        this.balance -= amount;
        System.out.println("Rút tiền thành công. Số dư còn lại: " + balance);
    }
}
