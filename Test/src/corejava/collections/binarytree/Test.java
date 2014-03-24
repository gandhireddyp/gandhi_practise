package corejava.collections.binarytree;

public class Test {

    public static void main(final String[] args) {
        final BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(5);
        binaryTree.addNode(2);
        binaryTree.addNode(12);
        binaryTree.addNode(4);
        binaryTree.addNode(3);
        binaryTree.addNode(9);
        binaryTree.addNode(21);
        binaryTree.addNode(16);
        binaryTree.addNode(18);
        binaryTree.addNode(17);
        binaryTree.addNode(20);
        binaryTree.addNode(25);

        binaryTree.inOrderTraverseTree(binaryTree.rootNode);
        System.out.println("###########################################################");
        /*
         * binaryTree.preOrderTraverseTree(binaryTree.rootNode);
         * System.out.println
         * ("###########################################################");
         * binaryTree.postOrderTraverseTree(binaryTree.rootNode);
         * 
         * System.out.println(
         * "###########################################################");
         * System.out.println(binaryTree.findNode(3));
         */
        System.out.println(binaryTree.remove(12));
        binaryTree.inOrderTraverseTree(binaryTree.rootNode);
        System.out.println("###########################################################");
        System.out.println(binaryTree.remove(5));
        binaryTree.inOrderTraverseTree(binaryTree.rootNode);

        System.out.println("Largest Element : " + binaryTree.getLargestNode(binaryTree.rootNode));
        System.out.println("Smallest Element : " + binaryTree.getSmallestNode(binaryTree.rootNode));
    }
}
