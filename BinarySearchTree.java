
public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }
    Node insertRec(Node newkey, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key<root.key)
            root.left = insertRec(root.left,key);
    else if(key>root.key)
        root.right = insertRec(root.right,key);
    return root;
    }

    public void postOrderRec(Node root){
        if (root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void preOrderRec(Node root){
        if (root != null){
            System.out.print(root.key + " ");
            postOrderRec(root.left);
            postOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    public void preOrder(){
        preOrderRec(root);
    }
}
