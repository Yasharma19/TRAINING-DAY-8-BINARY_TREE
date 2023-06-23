/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

    public static Node insert(Node root,int value) {
        if(root == null) {
        root = new Node(value);
    } else if(value < root.data){
        root.left = insert(root.left,value);
    } else if(value > root.data) {
        root.right = insert(root.right,value);
    }
    
    return root;
        
    }