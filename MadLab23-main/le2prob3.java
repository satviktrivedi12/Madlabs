class Mother {
    public void show() {
        System.out.println("Hello from Mother");
    }
}

class Child extends Mother {
    public static void show() {
        System.out.println("Hello from Child");
    }
}

public class le2prob3 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();

        mother.show();
        child.show();

        Mother m1 = new Child();
        m1.show();

        Mother.show();
        Child.show();
    }
}
