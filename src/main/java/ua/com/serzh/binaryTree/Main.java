package ua.com.serzh.binaryTree;

/**
 * @author sergii.zagryvyi on 02.07.2017
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree( 20 );
        int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        for(int i : nums ) {
            tree.addNode( i );
        }

//        tree.traversePreOrder();
//        tree.traverseInOrder();
//        tree.traversePostOrder();

        BTreePrinter.printNode(tree);


    }
}
