interface eg {
    void run();
    void start();
    void stop();
}

abstract class Test implements eg {
    public void run() {
        System.out.println("Running only");
    }
    
}

class Runner extends Test {
    public void start() {}  
    public void stop() {}   
}

public class one_method {
    public static void main(String[] args) {
        Runner obj = new Runner();
        obj.run();  
    }
}