package app;
import java.util.Scanner;

import funcionarios.funcionarios;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int cont=1;
        String nome;
        int matricula=0;
        int freio=0;
        String juncao="";
        double salario=0.0;
        double somadeSalario=0.0;
        System.out.println("Vamos cadastrar quantos funcionários agora?");
        freio=sc.nextInt();
        for(int i=0;i<freio;i++){ 
            funcionarios nv=new funcionarios();
            System.out.println("Digite o nome do funcionário: "); 
            nv.setNome(sc.next());
            System.out.println("Digite o salario do funcionario:");
            nv.setSalario(sc.nextDouble());
            nv.setMatricula(cont);
            somadeSalario=somadeSalario+nv.getSalario(); 
            juncao= juncao+("Nome:"+ nv.getNome()+"\n"+"Matricula:"+nv.getMatricula()+"\n"+"Salário:"+nv.getSalario());
            cont++;
        }
        System.out.println(juncao);
        System.out.println("A média dos salários é: "+somadeSalario/(cont-1));
        sc.close();
    }
        
    }

