package atividade01_listasimplesmenteencadeada;

public class LSEAluno {
    private LSENode primeiro;

    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public void inserirAluno(Aluno al){
        LSENode novo;
        novo = new LSENode(al);

        if(this.isEmpty() == true){
            this.primeiro = novo;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }

    public void inserirNoFim(Aluno al){
        LSENode ultimo = new LSENode(al);
        
        if(this.isEmpty()){
            this.primeiro = ultimo;
            return;
        }
        LSENode aux = this.primeiro;
        while(aux.getProx() != null){
            aux =  aux.getProx();
        }
        aux.setProx(ultimo);
    }

    public void exibir(){
        LSENode aux;

        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null){
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void removeInicio() { 
        if (this.primeiro != null){
            this.primeiro = this.primeiro.getProx();
            return;
        }
    }


    public void removeFinal() {
        LSENode aux, penultimo = null;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) { // lista com apenas um nó
            this.primeiro = null;
        }
        else {
            aux = this.primeiro;
            while (aux.getProx() != null) {
                penultimo = aux;
                aux = aux.getProx();
            }
            penultimo.setProx(null);
            System.out.println("Remoção efetuada!");
        }
    }

}
