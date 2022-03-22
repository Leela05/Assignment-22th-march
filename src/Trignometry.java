import java.util.Scanner;
class Sin extends Thread{
    int a;
    public Sin(int a) {
        this.a=a;
    }
    public void run() {
        double b = Math.toRadians(a);
        System.out.println("Sin("+a+") = "+Math.sin(b));
    }
}
class Cos extends Thread{
    int a;
    public Cos(int a) {
        this.a=a;
    }
    public void run() {
        double b=Math.toRadians(a);
        System.out.println("Cos("+a+") = "+Math.cos(b));
    }
}
class Tan extends Thread{
    int a;
    public Tan(int a) {
        this.a=a;
    }
    public void run() {
        double b=Math.toRadians(a);
        System.out.println("Tan("+a+") = "+Math.tan(b));
    }
}
public class Trignometry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Degree :");
        int a = s.nextInt();
        Sin sin = new Sin(a);
        Cos cos = new Cos(a);
        Tan tan = new Tan(a);
        sin.start();
        cos.start();
        tan.start();
    }
}