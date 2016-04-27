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
    intermediatePath.append(root.val).append("->");
    return findBinaryTreePaths(root,intermediatePath,pathList,stack);
  }

  public List<String> findBinaryTreePaths(TreeNode node, StringBuffer intermediatePath, List<String> pathList, Stack<TreeNode> stack){


    return pathList;
  }
}
