public class RBBST<Key extends Comparable<Key>, Value>{
  /**
   *
   *
   *
   *
   * */
  private static boolean RED=true;
  private static boolean BLACK=false;
  private class Node{
    private Key key;
    private Value value;
    private int count;
    private Node left, right;
    boolean color;

    public Node(Key key , Value value , boolean color ){
      this.key = key;
      this.value = value;
      this.color = color;
    }
  }
  private Node root;
  /**
   *
   *
   * */
  private boolean isRed(Node root){
    if(root==null) return false;
    return root.color ==RED;
  }
  /**
   *
   *
   *
   * */
  public Value get(Key key){
    Node x = root;
    while (x!=null){
      int comp = key.compareTo(root.key);
      if(comp > 0) x = x.right;
      else if(comp <0) x  = x.right;
      else return x.value;
    }
    return null;
  }
  /**
   *
   *
   *
   *
   * */
  public void put(Key key, Value value){
    root = put(root, key ,value);
  }
  /**
   *
   *
   *
   *
   * */
  public void delete(Key key){
    root = delete(root, key);
  }
  /**
   *
   *
   *
   * */
  private Node delete(Node root, Key key){
  //case when node is null
    if(root==null) return null;
    int comp = key.compareTo(root.key);
    //if key is less than root
    if(comp<0)root.left = delete(root.left,key);
    //if key is greater than root
    else if(comp>0)root.right= delete(root.right,key);
    //if key is eqaul to root node, first save the reference
    //to root in a temp variable, find the min in right subtree,
    //set that as root. right subtree will be the remiaing treen
    //after deleting min from the original right tree and left subtree
    //of new root is same as old  root
    else{
      if(root.left==null) return root.right;
      if(root.right==null) return root.left;
      Node temp = root;
      root = min(root.right);
      root.right = deleteMin(temp.right);
      root.left = temp.left;
    }
    root.count = 1+size(root.left)+size(root.right);
    return root;
  
  }
  /**
   *
   *
   * */
  public void deleteMin(){
    root = deleteMin(root);
  }
  /**
   *
   *
   *
   * */
  public Key Floor(Key key){
    Node node = floor(root, key);
    if(node==null) return null;
    return node.key;
  }
  /**
   *
   *
   * */
  public Iterable<Key> iterator(){
    Queue<Key> queue = new Queue<>();
    inorder(root,queue);
    return queue;
  }
  /**
   *
   *
   *
   * */
  public int size(){
    return size(root);
  }
  /**
   *
   *
   * */
  public int rank(Key key){
    return rank(root,key);
  }
  /**
   *
   *
   *
   **/ 
  private Node put(Node root, Key key , Value value){
      if(root==null) return new Node(key, value,RED);
      int comp = key.compareTo(root.key);
      if(comp < 0)
        root.left = put(root.left,key,value);
      else if(comp > 0)
        root.right = put(root.right,key,value);
      else
        root.value = value;
      
      if(isRed(root.right) && !isRed(root.left)) root = rotateLeft(root);
      if(isRed(root.left) && isRed(root.left.left)) root = rotateRight(root);
      if(isRed(root.left) && isRed(root.right) ) flipColors(root);
      return root;
  }
  /**
   *Floor takes in key and the root node to find the largest
   *node which has largest key less than the given key
   *Tricky part is when we check for the key in the right subtree
   *We find if there exists some node which is the largest node key less 
   * than given key : If no such node is found return the current node else
   * return the computed node
   * */
  private Node floor(Node root, Key key){
    if(root==null) return null;
    int comp = key.compareTo(root.key);
    if(comp<0)
      return floor(root.left, key);
    else if(comp==0)return root;
    Node node = floor(root.right, key);
    if(node==null)
      return root;
    else 
      return node;
  }
  /**
   *
   *
   * */
  private int size(Node node){
    if(node==null) return 0;
    return node.count;
  }
  /**
   *
   *
   * */
  private int rank(Node root, Key key){
    if(root==null) return 0;
    int comp = key.compareTo(root.key);
    if(comp<0) return rank(root.left,key);
    if(comp>0) return 1+size(root.left)+rank(root.right, key);
    else return size(root.left);
  }
  /**
   *
   *
   * */
  private void inorder(Node root, Queue<Key> queue){
    if(root==null) return queue;
    inorder(root.left, queue);
    queue.enqueue(root.key);
    inorder(root.right,queue);
  }
  /**
   *
   *
   * */
  private Node deleteMin(Node root){
    if(root.left==null) return root.right;
    root.left = deleteMin(root.left);
    root.count= 1+size(root.left)+size(root.right);
    return  root;
  }
  /**
   *
   *
   *
   * */
  private Node rotateLeft(Node node){
    assert isRed(node.right);
    Node  x = node.right;
    node.right = x.left;
    x.left = node;
    x.color = node.color;
    node.color = RED;
    return x;
  }
  /**
   *
   *
   * */
  private Node rotateRight(Node node){
    assert isRed(node.left);
    Node x = node.left;
    node.left = x.right;
    x.right = node;
    x.color = node.color;
    node.color= RED;
    return x;
  }
  /**
   *
   *
   * */
  private void flipColors(Node node){
    assert !isRed(node);
    assert isRed(node.left);
    assert isRed(node.right);
    node.color = RED;
    node.left.color = BLACK;
    node.right.color = BLACK;
  }
}
