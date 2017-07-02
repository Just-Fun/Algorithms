package ua.com.serzh.binaryTree;

/**
 * @author sergii.zagryvyi on 02.07.2017
 */
public class BinaryTree extends Node<Integer> {

    public BinaryTree(Integer data) {
        super(data);
    }


  /*  private Node<Integer> data;
    private Node<Integer> left;
    private Node<Integer> right;

    public BinaryTree(int data) {
        super(data);
        System.out.println();
    }*/

   /* public BinaryTree(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }*/

    // As a convention, if the key to be inserted is less than the key of root node, then key is inserted in
// left sub-tree; If key is greater, it is inserted in right sub-tree. If it is equal, as a convention, it
// is inserted in right sub-tree
    @Override
    public void addNode(Integer num) {
        if (num < this.data) {
            if (this.left != null) {
                this.left.addNode(num);
            } else {
                this.left = new BinaryTree(num);
            }

        } else {
            if (this.right != null) {
                this.right.addNode(num);
            } else {
                this.right = new BinaryTree(num);
            }
        }
    }

}
