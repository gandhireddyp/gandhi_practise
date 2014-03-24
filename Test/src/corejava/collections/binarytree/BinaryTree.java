package corejava.collections.binarytree;

/**
 * More info related to Binary Tree
 * 
 * http://www.algolist.net/Data_structures/Binary_search_tree/Removal
 * 
 * @author pullalarevug
 * 
 */
public class BinaryTree {

    Node rootNode;

    public void addNode(final int value) {
        if (findNode(value) != null) {
            return;
        }
        final Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node parentNode = rootNode;
            while (true) {
                if (value < parentNode.value) {
                    if (parentNode.leftChild == null) {
                        parentNode.leftChild = newNode;
                        return;
                    }
                    parentNode = parentNode.leftChild;
                } else {
                    if (parentNode.rightChild == null) {
                        parentNode.rightChild = newNode;
                        return;
                    }
                    parentNode = parentNode.rightChild;
                }
            }
        }
    }

    public void inOrderTraverseTree(final Node foucusNode) {
        if (foucusNode != null) {
            inOrderTraverseTree(foucusNode.leftChild);
            System.out.println(foucusNode);
            inOrderTraverseTree(foucusNode.rightChild);
        }
    }

    public void preOrderTraverseTree(final Node foucusNode) {
        if (foucusNode != null) {
            System.out.println(foucusNode);
            preOrderTraverseTree(foucusNode.leftChild);
            preOrderTraverseTree(foucusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(final Node foucusNode) {
        if (foucusNode != null) {
            System.out.println(foucusNode);
            postOrderTraverseTree(foucusNode.leftChild);
            postOrderTraverseTree(foucusNode.rightChild);
        }
    }

    public Node findNode(final int value) {

        if (rootNode == null) {
            return null;
        }
        Node foucsNode = rootNode;

        while (foucsNode.value != value) {
            if (value < foucsNode.value) {
                foucsNode = foucsNode.leftChild;
            } else {
                foucsNode = foucsNode.rightChild;
            }
            if (foucsNode == null) {
                return null;
            }
        }
        return foucsNode;
    }

    class Node {

        public Integer value;
        public Node rightChild;
        public Node leftChild;

        public Node(final int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public boolean remove(final int value) {

        boolean flag = false;

        Node foucsNode = rootNode;
        Node parentNode = rootNode;

        while (foucsNode.value != value) {
            parentNode = foucsNode;
            if (value < foucsNode.value) {
                foucsNode = foucsNode.leftChild;
            } else {
                foucsNode = foucsNode.rightChild;
            }

            if (foucsNode == null) {
                return false;
            }
        }

        if (foucsNode.leftChild == null && foucsNode.rightChild == null) {
            if (foucsNode == rootNode) {
                rootNode = null;
            }
            if (value < parentNode.value) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
            flag = true;
        } else if (foucsNode.rightChild == null) {
            if (foucsNode == rootNode) {
                rootNode = foucsNode.leftChild;
            }
            if (value < parentNode.value) {
                parentNode.leftChild = foucsNode.leftChild;
            } else {
                parentNode.rightChild = foucsNode.leftChild;
            }
            flag = true;
        } else if (foucsNode.leftChild == null) {
            if (foucsNode == rootNode) {
                rootNode = foucsNode.rightChild;
            }
            if (value < parentNode.value) {
                parentNode.leftChild = foucsNode.rightChild;
            } else {
                parentNode.rightChild = foucsNode.rightChild;
            }
            flag = true;
        } else {
            Node replacementParentNode = foucsNode;
            Node replacementNode = foucsNode.rightChild;
            while (replacementNode.leftChild != null) {
                replacementParentNode = replacementNode;
                replacementNode = replacementNode.leftChild;
            }
            if (foucsNode == rootNode) {

                if (replacementParentNode == rootNode) {
                    replacementNode.leftChild = rootNode.leftChild;
                    rootNode = replacementNode;
                } else {
                    rootNode.value = replacementNode.value;
                    replacementParentNode.leftChild = replacementNode.rightChild;
                }
            } else {
                foucsNode.value = replacementNode.value;
                replacementParentNode.leftChild = replacementNode.rightChild;
            }

            flag = true;
        }

        return flag;
    }

    public int getLargestNode(final Node parenetNode) {
        Node focusNode = parenetNode;
        while (focusNode.rightChild != null) {
            focusNode = focusNode.rightChild;
        }
        return focusNode.value;
    }

    public int getSmallestNode(final Node parenetNode) {
        Node focusNode = parenetNode;
        while (focusNode.leftChild != null) {
            focusNode = focusNode.leftChild;
        }
        return focusNode.value;
    }

}
