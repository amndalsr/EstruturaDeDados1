package atividade02_lse_semrepetidos;

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

    public void exibeDados(Aluno valor){
        LSENode aux = this.buscar(valor);
        if(aux != null){
            System.out.println(aux.getInfo());
        } else {
            System.out.println("Aluno não existente na lista");
        }
    }

}
