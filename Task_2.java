package git_work_1;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        
        //1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a, b and c for rectangle:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a + b + c == 180){
            System.out.println("This is rectangle");
        }
        else{
            System.out.println("This is not a rectangle");
        }

        if(a == 90 || b == 90 || c == 90){
            System.out.println("This rectangle is right");
        }

        //2
        System.out.println("Enter d for formula:");
        int d = scan.nextInt();
        int maxi = 0;
        maxi = Math.max(Math.min(a, b) , Math.min(c, d));
        System.out.println("Max is " + maxi);
        
        //3
        System.out.println("Enter X1, Y1; X2, Y2; X3, Y3:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        if((x1 - x2) * (y3 - y2) == (x3 - x2) * (y1 - y2)){
            System.out.println("Dots are in the line");
        }
        else{
            System.out.println("Dots are not in the line");
        }

        //4
        System.out.println("Enter A and B for hole and x, y and z for brick:");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        if(X <= A && Y <= B || Y <= B && X <= A || Z <= A && X <= B || X <= A && Z <= B ||  Y <= A &&  Z <= B || Z <= A && Y <= B){
            System.out.println("The hole is enough for brick!");
        }
        else{ 
            System.out.println("The hole is not enough");
        }
        
        //5
        System.out.println("Enter x for function:");
        double func = 0;
        int x = scan.nextInt();
        if(x > 3){
           func = 1 / (Math.pow(x, 3) + 6);
        }
        else{
            func = Math.pow(x, 2) - 3 * x +9;
        }
        System.out.println(func);
    }
}
