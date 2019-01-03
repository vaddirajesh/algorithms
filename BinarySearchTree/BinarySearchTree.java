import java.util.List;
import java.util.ArrayList;
public class BinarySearchTree<K extends Comparable<K>, V>{

    private Node root=null;

    class Node{
        K key;
        V value;
        Node left , right;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public void insert(K key, V value){
        root = insertNode(key, value, root);
    }

    private Node insertNode(K key, V value, Node node){
        if(null == node)
            return new Node(key, value);
        if(key.compareTo(node.key)<0)
            node.left = insertNode(key, value, node.left);
        else if(key.compareTo(node.key)>0)
            node.right = insertNode(key, value, node.right);
        else node.value = value;
        
        return node;
    }

    public Node find(K key){
        return find(key, root);
    }

    public Node find(K key, Node node){
        if(null == node)
            return null;
        if(key.compareTo(node.key)>0)
            return find(key,node.right);
        if (key.compareTo(node.key)<0)
            return find(key,node.left);
        if(key.compareTo(node.key)==0)
            return node;
        return null;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public Node getRoot(){
        return root;
    }

    public int getSize(){
        return getSize(root);
    }

    private int getSize(Node node){
        if(null == node)
            return 0;
        return 1+getSize(node.left)+getSize(node.right);
    }

    public List<K> inorderTraversal(){
        List<K> list = new ArrayList<>();
        return inorderTraversal(root,list);
    }

    private List<K> inorderTraversal(Node node, List<K> list){
        if(null == node)
            return null;
        inorderTraversal(node.left,list);
        list.add(node.key);
        inorderTraversal(node.right,list);
        return list;
    }

    public List<K> postOrderTraversal(){
        List<K> list = new ArrayList<>();
        return postOrderTraversal(root, list);
    }

    private List<K> postOrderTraversal(Node node, List<K> list){
        if(null == node)
            return null;
        postOrderTraversal(node.left,list);
        postOrderTraversal(node.right,list);
        list.add(node.key);
        return list;
    }

    public List<K> preOrderTraversal(){
        List<K> list = new ArrayList<>();
        return preOrderTraversal(root, list);
    }
    private List<K> preOrderTraversal(Node node, List<K> list){
        if(null == node)
            return null;
        list.add(node.key);
        preOrderTraversal(node.left,list);
        preOrderTraversal(node.right,list);
        return list;
    }
}