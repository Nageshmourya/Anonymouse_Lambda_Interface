import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
     //   bmw b1=new bmw();
        // it's Lambada Epression using anaymous classwhich is implements
        car b1=()->{
            System.out.println("Most fastest speed 350km/h");
            System.out.println("it lambda exprission");
        };
        b1.run();

    }
}