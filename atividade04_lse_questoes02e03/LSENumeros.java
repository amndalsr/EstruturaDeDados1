package atividade04_lse_questoes02e03;

public class LSENumeros {
    LSENode primeiro;

    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public void removerDuplicados(int valor){
        if(this.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        LSENode anterior = null;
        LSENode atual = this.primeiro;
        LSENode proximo = atual.getProx();
        int count = 0;

        if(proximo == null){
            if (atual.getInfo().getNumber() == valor){
                atual = null;
                count++;
            }
        }

        while (proximo != null) {
            boolean achei = false;
           
            if(atual.getInfo().getNumber() == valor){
                count++;
                achei = true;
            } else {
                achei = false;
                atual = atual.getProx();
            }

            proximo = atual != null && achei ? atual.getProx() : atual != null ? atual : null;

            if(achei) {
                if (anterior != null) {
                    anterior.setProx(proximo);
                } else {
                    this.primeiro = proximo;
                }
                atual = proximo;
            }

        }

        System.out.println(String.format("Foram removidos %s items", count));

    }

    public LSENumeros somaListas(LSENumeros a, LSENumeros b) {
        LSENumeros c = new LSENumeros();
        LSENode aux1 = a.primeiro;
        LSENode aux2 = b.primeiro;
        LSENode aux3 = null;

        do {
            int valorA = 0;
            int valorB = 0;
            
            if (aux1 != null) {
                valorA = aux1.getInfo().getNumber();
            }
            
            if (aux2 != null) {
                valorB = aux2.getInfo().getNumber();
            }
            
            Numero soma = new Numero(valorA + valorB);
            
            LSENode nodeC = new LSENode(soma);
            
            if(c.primeiro == null) {
                c.primeiro = nodeC;
                aux3 = nodeC;
            } else {
                aux3.setProx(nodeC);
                aux3 = nodeC;
            }

            aux1 = aux1 != null ? aux1.getProx() : null;
            aux2 = aux2 != null ? aux2.getProx() : null;
            
        } while(aux1 != null || aux2 != null);
        
        return c;
    }

    public LSENumeros divideListas (LSENumeros l1, LSENumeros l2) {
        LSENumeros l3 = new LSENumeros();
        LSENumeros l4 = new LSENumeros();
        LSENode aux1 = l1.primeiro;
        LSENode aux2 = l2.primeiro;
        LSENode aux3 = null;
        LSENode aux4 = null;

        do {
            int valorL1 = 0;
            int valorL2 = 0;

            if (aux1 != null) {
                valorL1 = aux1.getInfo().getNumber();
            }

            if (aux2 != null) {
                valorL2 = aux2.getInfo().getNumber();
            }

            Numero divisao = new Numero(valorL1 / valorL2);
            LSENode nodeL3 = new LSENode(divisao);

            Numero resto = new Numero (valorL1 % valorL2);
            LSENode nL4 = new LSENode(resto);

            if (l3.primeiro == null) {
                l3.primeiro = nodeL3;
                aux3 = nodeL3;
            } else {
                aux3.setProx(nodeL3);
                aux3 = nodeL3;
            }

            if (l4.primeiro == null) {
                l4.primeiro = nL4;
                aux4 = nL4;
            } else {
                aux4.setProx(nL4);
                aux4 = nL4;
            }

            aux1 = aux1 != null ? aux1.getProx() : null;
            aux2 = aux2 != null ? aux2.getProx() : null;

        } while (aux1 != null || aux2 != null);

        return l3;
    }

}