public class GameBoard
{
  private TreeNode root;  // the root of the tree

  /*** Part (b) ***/

  /** Creates a full binary tree rooted at root with numLevels levels
   *  with a random integer from 0 to 9, inclusive, generated for each node
   *  @param numLevels the number of levels in the tree
   *  Precondition: numLevels > 0
   */
  public GameBoard(int numLevels)
  {
    root = buildTree(numLevels);
  }

  private TreeNode buildTree(int numLevels)
  {
    int value = (int)(10 * Math.random());
    TreeNode root = new TreeNode(new Integer(value));
    // Or:
    //  TreeNode root = new TreeNode(value);

    if (numLevels > 1)
    {
      root.setLeft(buildTree(numLevels - 1));
      root.setRight(buildTree(numLevels - 1));
    }
    return root;
  }

  /****************/

  /** @return the maximum path score for this GameBoard
   */
  public int getMaxScore()
  { return getMaxHelper(root); }

  /*** Part (a) ***/

  /** @param current the root of the subtree to be processed
   *  @return the maximum path score for the subtree rooted at current
   */
  private int getMaxHelper(TreeNode current)
  {
    if (current == null)
      return 0;

    int leftScore = getMaxHelper(current.getLeft());
    int rightScore = getMaxHelper(current.getRight());
    return ((Integer)current.getValue()).intValue() + Math.max(leftScore, rightScore);
  }

  public String toString()
  {
    return toString(root, 0);
  }

  private String toString(TreeNode current, int indent)
  {
    String s = "";
    if (current != null)
      s += "\n" +
           "---------------------------------------------------------".substring(0, indent) +
           current.getValue() +
               toString(current.getLeft(), indent + 2) +
               toString(current.getRight(), indent + 2);
    return s;
  }
}
