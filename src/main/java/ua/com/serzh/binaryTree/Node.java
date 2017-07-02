package ua.com.serzh.binaryTree;

/**
 * @author sergii.zagryvyi on 02.07.2017
 */
class Node<T extends Comparable<?>> {
    Node<T> left;
    Node<T> right;
    T data;

    public Node(T data) {
        this.data = data;
        System.out.println("");
    }

    public void addNode(T num) {

    }
}
