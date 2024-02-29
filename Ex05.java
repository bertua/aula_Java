import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] matematica = new double[4];
        double[] portugues = new double[4];
        double[] fisica = new double[4];
        double[] quimica = new double[4];
        double[] sociologia = new double[4];
        
        String[] materias = {"Matematica", "Portugues", "Fisica", "Quimica", "Sociologia"};
        
        for(int i = 0; i < 5; i++){
            System.out.println("Notas dispciplina: " + materias[i]);
            if(i == 0){
                for(int j = 1; j <= 4; j++){
                    System.out.print("Nota " + j + ": ");
                    double nota = input.nextDouble();
                    matematica[j-1] = nota;
                }
                System.out.println(media(matematica));
            }
            else if(i == 1){
                for(int j = 1; j <= 4; j++){
                    System.out.print("Nota " + j + ": ");
                    double nota = input.nextDouble();
                    portugues[j-1] = nota;
                }
                System.out.println(media(portugues));
            }
            else if(i == 2){
                for(int j = 1; j <= 4; j++){
                    System.out.print("Nota " + j + ": ");
                    double nota = input.nextDouble();
                    fisica[j-1] = nota;
                }
                System.out.println(media(fisica));
            }
            else if(i == 3){
                for(int j = 1; j <= 4; j++){
                    System.out.print("Nota " + j + ": ");
                    double nota = input.nextDouble();
                    quimica[j-1] = nota;
                }
                System.out.println(media(quimica));
            }
            else if(i == 4){
                for(int j = 1; j <= 4; j++){
                    System.out.print("Nota " + j + ": ");
                    double nota = input.nextDouble();
                    sociologia[j-1] = nota;
                }
                System.out.println(media(sociologia));
            }
        } 
    }
    
    public static double media(double[] collection){
        double soma = 0;
        for(double item : collection){
            soma += item;
        }
        return soma/collection.length;
    }

}
