import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.lang.IllegalArgumentException;

public class RedBlackBST<K extends Comparable<K>, V>{
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root ; 
    public class Node{
        K key;
        V value;
        Node left, right;
        boolean color;
        int size;
        
        public Node(k key, v value, boolean color, int size){
            this.key=key;
            this.value=value;
            this.color=color;
            this.size=size;
        }
    }

    public int size(Node node){
        return 0;
    }

    public void delete(K key){

    }

    public void put(K key, V value){
        if(null == key) throw new IllegalArgumentException("Key null");
        if(null == value){
            delete(key);
            return;
        }
        root = put(root,key,value);
        root.color=BLACK;
    }

    public Node get(K key){
        if (null == key ) return null;
        Node n = root;
        while(n != null){
            int comp = key.compareTo(n.key);
            if(comp < 0 ) n = n.left;
            else if(comp > 0 ) n = n.right;
            else return n.value;
        }
        return null;
    }

    public boolean isRed(Node node){
       if(node == null) return false;
       return node.color==RED;
    }

    private Node put(Node h, K key, V value){
        if(null == h){
             return new Node(key, value,RED,1);             
        }

        int comp = key.compareTo(h.key);

        if(comp < 0) h = put(h.left,key,value);
        else if(comp > 0) h = put(h.right,key,value);
        else h.value = value;
        if(isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if(isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if(isRed(h.left) && isRed(h.right)) h = swapColors(h);
        h.size = size(h.left)+size(h.right)+1;
        return h;
    }

    public Node rotateLeft(Node h){
        Node x = h.right;
        Node y = h.left;
        h=x;
        h.left = x;
        x.color=RED;
        x.right.color=BLACK;
        h.right=x.left;
        return h;
    }

    public Node rotateRight(Node h){
        return null;
    }

    public Node swapColors(Node h){
        return null;
    }
    public static void main(String[] args) throws FileNotFoundException{
        try(Scanner scanner = new Scanner(new File(args[1]))){

        }catch(FileNotFoundException exception){
            throw new FileNotFoundException(exception.getMessage());
        }
    }
}