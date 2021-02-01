package git_work_1;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
    
        //1
        System.out.println("Enter integer num >0:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
        sum = 0;
        
        //2
        System.out.println("Enter the a and b for gap and h for step:");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int h = scan.nextInt();
        int y = 0;
        int x = 0;
        for(x = A; x < B; x += h){
            if(x > 2){
                y = x;
            }
            else{
                y = -x;
            }
            System.out.println("The function values with such step as " + h + " are: " + y);
        }

        //3
        for(int i = 0; i < 101; i++){
            sum += Math.pow(i, 2);
        }
        System.out.println("\nThe sum in task3 is: " + sum);
        sum = 0;

        //4
        int comp = 1;
        for(int i = 1; i < 201; i++){
            comp = (int) (Math.pow(i, 2) * comp);
        }
        System.out.println("\nThe composition in task4 is: " + comp);

        //5
        double summ = 1;
        System.out.println("\nEnter eps value:");
        double eps = scan.nextDouble();
        num = 1;
        double next = 1/2 + 1/3;
        while(next >= eps) {
                next += 1/Math.pow(2, num) + 1/Math.pow(3, num);
                summ += next;
            }
        System.out.println(summ);
        
        //6
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }

        //7
        System.out.println("\nEnter the m and n for gap:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        for(int i = m; i < n; i++){
            for(int j = 2; j < n; j++){
                if ((i % j) == 0 && i != j) {
                    System.out.println("the divider for " + i + " is: " + j);
                }
            }
        }

        //8
        System.out.println("\nEnter two numbers to check:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[] arr = new int[100];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
        }
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.println("The same numbers are: " + b % 10);
            b /=10;
        }

    }
}
