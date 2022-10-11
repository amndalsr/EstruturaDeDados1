package br.unicap.edi.queue;

public class Queue<T> {
    private int [] dados;
    private int inicio, fim;
    private int capacidade;
    private int qtd;

    public void enQueue(T valor){
        if (this.isFull() == true){
            System.out.println("Lista cheia!");
        } else {
            fim = (fim + 1) % capacidade;
            dados[fim] = valor;
            this.qtd++;
        }
    }

    public int deQueue(){
        if (this.isEmpty() == true){
            System.out.println("Lista vaiza!");
        } else {
            int valor = dados[inicio];
            inicio = (inicio + 1) % capacidade;
            this.qtd--;
        }
        return valor;
    }

    public int head(){
        return ;
    }

    public boolean isEmpty(){
        return this.inicio == -1;
    }

    public boolean isFull(){
        return this.inicio == this.capacidade +1;
    }
}
