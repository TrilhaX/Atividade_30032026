import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        if (A == 0 && B == 0){
            System.out.println("Origem");
        }else{
            if (A == 0 && B != 0){
                System.out.println("Eixo Y");
            }else if (A != 0 && B==0){
                System.out.println("Eixo X");
            }else if(A > 0 && B > 0){
                System.out.println("Q1");
            }else if (A < 0 && B > 0){
                System.out.println("Q2");
            }else if (A > 0 && B < 0){
                System.out.println("Q4");
            }else{
                System.out.println("Q3");
            }
        }
    }
}