interface X {
    public void Teach();
}

interface Y {
    public void Teach();
}

class testing implements X {
    public void Teach() {
        System.out.println("A is teaching");
    }
}

class gnitset implements Y {
    public void Teach() {
        System.out.println("B is teaching");
    }
}

public class Inheritance_example2 {
    public static void main(String[] args) {
        testing a1 = new testing();
        a1.Teach();
        gnitset b1 = new gnitset();
        b1.Teach();
    }
}
