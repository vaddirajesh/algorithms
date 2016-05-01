public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> pathList = new ArrayList<>();
    if(root.left==null && root.right==null){
      pathList.add(Integer.toString(root.val));
      return pathList;
    }
    StringBuffer intermediatePath = new StringBuffer();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    intermediatePath.append(root.val);
    return findBinaryTreePaths(root,intermediatePath,pathList,stack);
  }

  public List<String> findBinaryTreePaths(TreeNode node, StringBuffer intermediatePath, List<String> pathList, Stack<TreeNode> stack){
    if(node.left ==null && node.right==null){
      pathList.add(intermediatePath.toString());
      int index = intermediatePath.lastIndexOf("-");
      intermediatePath.delete(index,intermediatePath.length());
      stack.pop();
    }
    if(node.left!=null){
      TreeNode newNode = node.left;
      if(stack.search(newNode)!=1){
        stack.push(newNode);
        intermediatePath.append("->").append(newNode.val);
      }
      findBinaryTreePaths(newNode,intermediatePath,pathList,stack);
    }
    if(node.right!=null){
      TreeNode newNode = node.right;
      if(stack.search(newNode)!=1){
        stack.push(newNode);
        intermediatePath.append("->").append(newNode.val);
      }
      findBinaryTreePaths(newNode,intermediatePath,pathList,stack);
    }

    return pathList;
  }
}
