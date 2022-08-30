package atividade02_lse_semrepetidos;

import java.util.Scanner;

public class LSEAluno {

    private LSENode primeiro;

    public boolean isEmpty(){         
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }    

    public void inserirAluno (Aluno al){
        LSENode novo;
        LSENode result = this.buscar(al);
        
        if(result != null){
            System.out.println("Aluno já está na lista!");
        } else {
            novo = new LSENode(al);
            if(this.isEmpty() == true){
                this.primeiro = novo;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            System.out.println("Inserção realizada!");
        }
    }

    public void inserirAlunoFinal(Aluno al) {
        LSENode novo, aux;
        LSENode result = this.buscar(al);

        if (result != null) {
            System.out.println("Aluno já está na lista!");
        } else {
            novo = new LSENode(al);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção realizada!");
        }
    }

    private LSENode buscar (Aluno al){
        LSENode aux;
        if(this.isEmpty() == true){
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null){
                if(aux.getInfo().compareTo(al) == 0){
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void exibir() {
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirAluno(String m){
        Aluno aux = new Aluno(m);
        LSENode result = this.buscar(aux);

        if(result != null){
            System.out.println("Dados do aluno: ");
            System.out.println(result.getInfo());
        } else {
            System.out.println("Aluno não existente na lista");
        }

    }

    public void alteraMedia(String m){
        Scanner in = new Scanner (System.in);
        Aluno aux = new Aluno(m);
        double novaMedia;
        LSENode result = this.buscar(aux);

        if(result == null) {
            System.out.println("Aluno não encontrado!");
        } else {
            System.out.println("Informe a nova média do aluno: ");
            novaMedia = in.nextDouble();
            result.getInfo().setMedia(novaMedia);
            System.out.println("Média alterada!");
        }
    }

    public void alteraFaltas(int f){
        Scanner in = new Scanner (System.in);
        Aluno 
    }
}
