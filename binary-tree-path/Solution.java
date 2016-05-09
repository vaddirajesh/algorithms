public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> finalPaths = new ArrayList<>();
    if(root==null) return finalPaths;
    if(root.left==null && root.right==null) finalPaths.add(new Integer(root.val).toString());
    Deque<Integer> tempStack = new ArrayDeque<>();
    findBinaryPaths(root,tempStack, finalPaths);
    return finalPaths;
  }
  public void findBinaryPaths(TreeNode node, Deque<Integer> nodeValues,List<String> finalPaths){
    if((node.left==null) && (node.right==null)){
      nodeValues.push(node.val);
      StringBuffer stringBuffer = new StringBuffer();
      Iterator<Integer> iterator = nodeValues.descendingIterator();
      while(iterator.hasNext()){
        stringBuffer.append(new Integer(iterator.next()).toString());
        if(iterator.hasNext())stringBuffer.append("->");
      }
      if(!finalPaths.contains(stringBuffer.toString()))
        finalPaths.add(stringBuffer.toString());
      nodeValues.pop();
      return;
    }
    nodeValues.push(node.val);
    if(node.left !=null)
      findBinaryPaths(node.left,nodeValues,finalPaths);
    if(node.right!=null)
      findBinaryPaths(node.right,nodeValues,finalPaths);
    nodeValues.pop();
  }
}
