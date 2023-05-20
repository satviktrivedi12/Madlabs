class One {
    public One(int x) {
    }
}

class Two extends One {
    public Two(int x) {
        super(x);
    }
}

public class le2prob4 {
    public static void main(String[] args) {
        new One(10);
        new Two(20);
    }
}
