package br.unicap.edi.arvore;

public class TreeNode <T extends Comparable<T>>{
    private TreeNode<T> left;
    private T info;
    private TreeNode<T> right;

    public TreeNode (T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T valor) {
        this.info = valor;
    }

    public TreeNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode<T> newLeft) {
        this.left = newLeft;
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public void setRight(TreeNode<T> newRight) {
        this.right = newRight;
    }
}
