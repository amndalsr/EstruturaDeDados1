package br.unicap.edi.cadastro;

import br.unicap.edi.arvore.BinaryTree;
import br.unicap.edi.info.Produto;
import java.util.Scanner;

public class CadastroProduto {
    private BinaryTree<Produto> loja;

    public CadastroProduto() {
        loja = new BinaryTree<>();
    }

    public void CadastrarProduto() {
        Scanner in = new Scanner(System.in);
        Produto pr;
        String codigo, descricao, fornecedor;
        double preco;
        int qtdestoque;
        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();
        System.out.println("Informe a descrição do produto: ");
        descricao = in.nextLine();
        System.out.println("Informe o fornecedor: ");
        fornecedor = in.nextLine();
        System.out.println("Informe o preço do produto: ");
        preco = in.nextDouble();
        System.out.println("Informe a quantidade em estoque do produto: ");
        qtdestoque = in.nextInt();
        pr = new Produto(codigo, descricao, fornecedor, preco, qtdestoque);
        loja.inserir(pr);
    }

    public void exibirTodos() {
        if (this.loja.isEmpty() == true) {
            System.out.print("Não há produtos na loja!");
        } else {
            this.loja.emOrdem();
        }
    }

    public void buscarProduto() {
        Scanner in = new Scanner(System.in);
        Produto pr;
        String codigo;
        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();
        pr = new Produto(codigo);
        
        if (loja.isEmpty() == true) {
            System.out.print("Produto não existe na loja.");
        } else {
            loja.buscar(pr);
            System.out.println("Produto encontrado " + pr);
        }
    }

    public void alterarPreco() {
        Scanner in = new Scanner (System.in);
        Produto pr, retorno;
        String codigo;
        double preco;
        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();
        pr = new Produto(codigo);
        retorno = loja.buscar(pr);

        if (retorno == null) {
            System.out.print("Produto não encontrado.");
        } else {
            System.out.print("Dados atuais: " + pr);
            System.out.println("Informe o novo preço do produto: ");
            preco = in.nextDouble();
            retorno.setPreco(preco);
            System.out.print("Preço atualizado!");
        }
    }

    public void alterarQtdEstoque() {
        Scanner in = new Scanner (System.in);
        Produto pr, retorno;
        String codigo;
        int qtdestoque;
        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();
        pr = new Produto(codigo);
        retorno = loja.buscar(pr);

        if (retorno == null) {
            System.out.print("Produto não encontrado.");
        } else {
            System.out.print("Dados atuais: " + pr);
            System.out.println("Informe a nova quantidade em estoque do produto: ");
            qtdestoque = in.nextInt();
            retorno.setQtdEstoque(qtdestoque);
            System.out.print("Estoque atualizado!");
        }
    }

    public void exibirInfoDoProduto() {
        Scanner in = new Scanner(System.in);
        Produto pr, retorno;
        String codigo;
        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();
        pr = new Produto(codigo);
        retorno = loja.buscar(pr);

        if (retorno == null) {
            System.out.print("Produto não existe na loja.");
        } else {
            System.out.print("Informações do produto: ");
            System.out.println(retorno);
        }
    }

    public void removerProduto() {
        Scanner in = new Scanner(System.in);
        Produto pr;
        String codigo;
        System.out.println("Informe o código do produto: ");
        codigo = in.nextLine();
        pr = new Produto(codigo);
        
        if (loja.isEmpty() == true) {
            System.out.print("Produto não existe na loja.");
        } else {
            loja.remove(pr);
            System.out.print("Produto removido!");
        }
    }
}
