public class le2prob1 {
    class Mother {
        int x;

        void show() {
            System.out.println("Mother: x = " + x);
        }
    }

    class Child extends Mother {
    
    }
        public static void main(String[] args) {
            Mother m = new Mother();
            m.show(); 

            Child ch = new Child();
            ch.show(); 
        }
    
}
