package git_work_1;
import java.util.Scanner;

public class Task_1{
    public static void main(String[] args){

        //1
        System.out.println("Enter a, b and c for function:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double z = 0;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);

        //2
        double num1 = 0;
        num1 = (b + Math.pow((Math.pow(b,2) + 4 * a * c), 1/2)) / 2 * a - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.println(num1);

        //3
        System.out.println("Enter x and y for formula:");
        double num2 = 0;
        int x = scan.nextInt();
        int y = scan.nextInt();
        num2 = (Math.cos(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(num2);

        //4
        System.out.println("Enter fractional number to reverse: ddd.nnn:");
        double rev = scan.nextDouble();
        double ver = (rev * 1000) % 1000 + (int) rev / 1000.0;
        System.out.println(rev + " -> " + ver);

        //5
        System.out.println("Enter the time in sec:");
        int t = scan.nextInt();
        int h, m, s = 0;
        h = (t / 3600);
        System.out.println("Hours: " + Math.round(h));
        m = (t - h * 3600) / 60;
        System.out.println("Minutes: " + Math.round(m));
        s = t - h * 3600 - m * 60;
        System.out.println("Seconds: " + Math.round(s));

        //6
        System.out.println("Enter your x and y for the dot");
        int X = scan.nextInt();
        int Y = scan.nextInt();
        if(Y >= 0 && Math.abs(X) <= 2 && Y <= 4 ||  Y <= 0 && Math.abs(X) <= 4 && Y >= 3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
