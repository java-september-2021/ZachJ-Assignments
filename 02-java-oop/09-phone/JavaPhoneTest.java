public class JavaPhoneTest {
    public static void main(String[] args) {
        Galaxy s21 = new Galaxy("S21", 37, "T Mobile", "Mr. Brightside");
        Iphone i12= new Iphone("12", 83, "Verizon", "Pretty Lavinia");

        s21.displayInfo();
        s21.ring();
        s21.unlock();
        i12.displayInfo();
        i12.ring();
        i12.unlock();

    }
}
