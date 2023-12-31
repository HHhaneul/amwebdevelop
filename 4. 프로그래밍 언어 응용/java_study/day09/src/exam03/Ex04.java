package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(10);

        System.out.println("num1 주소 : " + System.identityHashCode(num1));
        System.out.println("num2 주소 : " + System.identityHashCode(num2));

        // 숫자가 클 때에는 valueOf를 사용할 때 자동으로 객체를 생성해준다.
        Integer num3 = Integer.valueOf(1000000);
        Integer num4 = Integer.valueOf(1000000);

        System.out.println("num3 주소 : " + System.identityHashCode(num3));
        System.out.println("num4 주소 : " + System.identityHashCode(num4));
    }
}
