package exam01;

public class Ex04 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2 ; // ArithmethicException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // NullPointerException
            System.out.println(str);

        }catch (ArithmeticException | NullPointerException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
