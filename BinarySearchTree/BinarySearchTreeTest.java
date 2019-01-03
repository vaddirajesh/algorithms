import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinarySearchTreeTest{
    public static void main(String[] args){
        BinarySearchTree<Integer, Integer> binarySearchTree = new BinarySearchTree<>();
        Scanner scanner = new Scanner(System.in);
        String literal = scanner.nextLine();
        Integer numberOfItems=Integer.valueOf(literal);
        System.out.println("Initial size of the search tree :"+binarySearchTree.getSize());
        for (int i = 0; i < numberOfItems; i++) {
            String lineItem = scanner.nextLine();
            String[] elements = lineItem.split("\\s+");
            int key = Integer.valueOf(elements[0]);
            int value = Integer.valueOf(elements[1]);
            binarySearchTree.insert(key, value);
        }
        scanner.close();
        System.out.println("Size of binary search tree is :"+binarySearchTree.getSize());
        List<Integer> inOrder = binarySearchTree.inorderTraversal();
        String inOrderString = inOrder.stream().map(i -> i.toString()).collect(Collectors.joining(","));
        System.out.println("In-Order traversal :"+ inOrderString);
        List<Integer> postOrder = binarySearchTree.postOrderTraversal();
        String postOrderString = postOrder.stream().map(i -> i.toString()).collect(Collectors.joining(","));
        System.out.println("Post-Order traversal :"+ postOrderString);
        List<Integer> preOrder = binarySearchTree.preOrderTraversal();
        String preOrderString = preOrder.stream().map(i -> i.toString()).collect(Collectors.joining(","));
        System.out.println("Pre-Order traversal :"+ preOrderString);
    }
}