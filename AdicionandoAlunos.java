// Atividade 1 - Estrutura de Dados
// 
// No caso em questão, devido ao acréscimo de novos alunos, o uso de um ArrayList seria mais vantajoso do que o Array, pois o ArrayList é redimensionável. 
// Ou seja, os elementos podem ser adicionados e removidos do ArrayList a qualquer momento. No Array, não há a possibilidade de acrescentar 
// ou remover elementos, senão criando um novo, já que o espaço na memória para o vetor não pode ser modificado. 


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdicionandoAlunos {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>();


        // Para não precisar digitar 25 nomes a fim de testar o programa, descomente o código abaixo (contém 24 nomes cadastrados):
        // alunos.add("Helen");   
        // alunos.add("Igor");   
        // alunos.add("Julia");   
        // alunos.add("Junior");   
        // alunos.add("Kley");   
        // alunos.add("Laios");   
        // alunos.add("Maria");   
        // alunos.add("Matheus");   
        // alunos.add("Natália");
        // alunos.add("Orlando");
        // alunos.add("Aurélio");  
        // alunos.add("Ana");
        // alunos.add("Alana");
        // alunos.add("Aline");   
        // alunos.add("Bruno");   
        // alunos.add("Camila");   
        // alunos.add("Carlos");   
        // alunos.add("Castro");   
        // alunos.add("Celeste");   
        // alunos.add("Elvis");   
        // alunos.add("Fernanda");   
        // alunos.add("Fernando");   
        // alunos.add("Gabriela");
        // alunos.add("Hugo"); 


        String nomeAluno;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de cadastro de alunos");
        while (alunos.size() <= 24) {
            System.out.println("Digite o nome do aluno " + (alunos.size()+1) + ": ");
            nomeAluno = scanner.next();
            alunos.add(nomeAluno);
        } 

        System.out.println("Lista dos 25 alunos cadastrados até agora: ");
        for (String i : alunos) {
            System.out.println(i);
        }

        while (alunos.size() <= 29) {
            System.out.println("Foram cadastrados " + (alunos.size()) + " alunos até o momento. Para acrescentar mais alunos, digite o nome do aluno " + (alunos.size()+1) + ": ");
            nomeAluno = scanner.next();
            alunos.add(nomeAluno);
        } 

        System.out.println("Lista ordenada dos " + (alunos.size()) + " alunos cadastrados: ");
        Collections.sort(alunos); 
        for (String i : alunos) {
            System.out.println(i);
        }
        
    }
}

