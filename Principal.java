import java.util.Scanner;
public class Principal{
    public static void main(String args []){
        ExerFor1 e1=new ExerFor1();
        ExerFor2 e2=new ExerFor2();
        ExerFor3 e3=new ExerFor3();
        ExerFor4 e4=new ExerFor4();
        ExerFor5 e5=new ExerFor5();
        int opcao;
        System.out.println(" Digite 1 para imprimir");
        System.out.println(" Digite 2 para somar");
        System.out.println(" Digite 3 para os multiplos");
        System.out.println(" Digite 4 para fatorial");
        System.out.println(" Digite 5 para par ou impar");
        Scanner input=new Scanner(System.in);
        opcao=input.nextInt();
    if (opcao == 1){
        System.out.println(" Digite 1 para imprimir");
        e1.imprimir();}
    if (opcao == 2){
        System.out.println(" Digite 2 para somar");
        e2.soma();}
    if (opcao == 3){
        System.out.println(" Digite 3 para os multiplos");
        e3.multiplo();}
     if (opcao == 4){
        System.out.println(" Digite 4 para fatorial");
        e4.fatorial();}
    if (opcao == 5){
        System.out.println(" Digite 5 para par ou impar");
        e5.par_impar();}
        
        

    }
}