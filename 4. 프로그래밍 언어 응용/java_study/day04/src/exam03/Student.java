package exam03;

public class Student {
    static int id;
    String name;
    String subject;

    public static void staticMethod(){
        System.out.println("정적 메서드!!");

    }
    public void instanceMethod(){
        id = 1000;
        staticMethod();
    }

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

