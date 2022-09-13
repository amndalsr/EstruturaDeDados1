package atividade_avaliativa_lse;

public class LSEPessoas {

    private LSENode primeiro;
    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public LSEPessoas CriarUniao(LSEPessoas a, LSEPessoas b){
        LSEPessoas uniao = new LSEPessoas();
        LSENode aux1 = a.primeiro;
        LSENode aux2 = b.primeiro;
        LSENode aux3 = null;

        do{
            if(aux1 != null){
                aux1 = aux1.getInfo().getPessoa;
            }

            if(aux2 != null){
                aux2 = aux2.getInfo().getPessoa;
            }
            
            Pessoa juncao = new Pessoa(aux1, aux2);
            LSENode nodeUniao = new Pessoa(juncao);
            juncao.removerDuplicados();

            if(uniao.primeiro == null){
                uniao.primeiro = nodeUniao;
                aux3 = nodeUniao;
            } else {
                aux3.setProx(juncao);
                aux3 = nodeUniao;
            }

            aux1 = aux1 != null ? aux1.getProx() : null;
            aux2 = aux2 != null ? aux2.getProx() : null;

        } while (aux1 != null || aux2 != null);

        return uniao;

    }
    public void removerDuplicados(String nome){
        if(this.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        LSENode anterior = null;
        LSENode atual = this.primeiro;
        LSENode proximo = atual.getProx();
        int count = 0;

        if(proximo == null){
            if (atual.getInfo().getPerson() == nome){
                atual = null;
                count++;
            }
        }

        while (proximo != null) {
            boolean achei = false;
           
            if(atual.getInfo().getPerson() == nome){
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

    }
}
