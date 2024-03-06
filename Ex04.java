import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        System.out.println("5: SAIR");
        System.out.print("Escolha a operação: ");
        int ope = input.nextInt();
        System.out.print("Primeiro número: ");
        double a = input.nextInt();
        System.out.print("Segundo número: ");
        double b = input.nextInt();

        while(ope != 5){
            switch(ope){
                case 1:
                System.out.println(soma(a,b));
                break;

                case 2:
                System.out.println(menos(a,b));
                break;

                case 3:
                System.out.println(vezes(a,b));
                break;

                case 4:
                if(b == 0){
                    System.out.println("ERROR");
                } else {
                    System.out.println(div(a,b));
                }
                break;

                default:
                System.out.println("Número incorreto");
            }
            
            System.out.print("Escolha a operação: ");
            ope = input.nextInt();
            if(ope == 5){
                break;
            }
            System.out.print("Primeiro número: ");
            a = input.nextInt();
            System.out.print("Segundo número: ");
            b = input.nextInt();
       }
    }

    public static double soma(double a, double b){
        return a + b;
    }
    public static double menos(double a, double b){
        return a - b;
    }
    public static double vezes(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }

}
