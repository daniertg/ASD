public class BinaryTree{
    Node root;
    int total = 0;

    public BinaryTree(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        } else{
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    } else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data > current.data){
                    if(current.right != null){
                        current = current.right;
                    } else{
                        current.right = new Node(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    Node insertRekursif(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.data){
            root.left = insertRekursif(root.left, key);
        } else if (key > root.data){
            root.right = insertRekursif(root.right, key);
        }
        return root;
    }


    void addRekursif(int key){
        root = insertRekursif(root, key);
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            } else if(data < current.data){
                current = current.left;
            } else{
                current = current.right;
            }
        }
        return hasil;
    }

    int min (Node node){
        Node current = root;
        while (current.left != null){
            current = current.left;
        }
        return current.data;
    }

    int max (Node node){
        Node current = root;
        while (current.right != null){
            current = current.right;
        }
        return current.data;
    }

    public void printLeaf(Node node){
        if (node == null){
            return;
        }
        if (node.isLeaf()){
            System.out.print(" " + node.data);
            total++;
        }
        printLeaf(node.left);
        printLeaf(node.right);

    }

    void traversePreOrder(Node node){
        if(node != null){
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        //cek apakah tree kosong atau tidak
        if(isEmpty()){
            System.out.println("Tree is Empty !");
            return;
        }
        //mencari node yang akan dihapus
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            } else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //proses penghapusan
        if(current == null){
            System.out.println("Couldn't find data !");
            return;
        } else{
            //apabila tidak memiliki child, delete langsung
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                } else{
                    if(isLeftChild){
                        parent.left = null;
                    } else{
                        parent.right = null;
                    }
                }
            } else if(current.left == null){//apabila terdapat 1 child di sebelah kanan (right)
                if(current == root){
                    root = current.right;
                } else{
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null){//apabila terdapat 1 child di sebelah kiri (left)
                if(current == root){
                    root = current.left;
                } else{
                    if(isLeftChild){
                        parent.left = current.left;
                    } else{
                        parent.right = current.left;
                    }
                }
            } else{//apabila terdapat 2 child
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                } else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
