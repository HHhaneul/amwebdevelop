package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result);

        Calculator cal2 = (a, b) -> a + b;
        }
    }
