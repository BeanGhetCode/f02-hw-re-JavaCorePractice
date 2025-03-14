package Class;

public class Student {
    // Thuộc tính
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;
    private String studentID;

    // Constructor không tham số
    public Student() {
    }

    // Constructor có tham số
    public Student(String fullName, String address, String email, String phoneNumber, String studentID) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentID = studentID;
    }

    // Các phương thức getter
    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStudentID() {
        return studentID;
    }

    // Các phương thức setter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Các hành động của sinh viên
    public void attendClass() {
        System.out.println(fullName + " đang đi học.");
    }

    public void doHomework() {
        System.out.println(fullName + " đang làm bài tập.");
    }

    public void payTuitionFee() {
        System.out.println(fullName + " đã nộp học phí.");
    }

    public void takeExam() {
        System.out.println(fullName + " đang làm bài kiểm tra.");
    }

    // Hiển thị thông tin đầy đủ của sinh viên
    public void displayInformation() {
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Họ tên: " + fullName);
        System.out.println("Mã sinh viên: " + studentID);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}
