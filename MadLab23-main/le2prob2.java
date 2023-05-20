class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class le2prob2 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();

        mother.show(); 
        child.show(); 
        Mother upcastedChild = new Child();
        upcastedChild.show(); 
    }
}
