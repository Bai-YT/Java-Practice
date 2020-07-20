import java.util.ArrayList;

public class SlidingPuzzle
{
  private int side; // the side length of the puzzle grid
  private int[][] values; // the tile values with the hole represented by 0

  /** @param sideLength the side length of the square grid
   *         Precondition: sideLength > 0
   */
  public SlidingPuzzle(int sideLength)
  {
    side = sideLength;
    values = new int[side][side];
    initialize();
  }

  /*** Part (a) ***/

  /** Precondition: the puzzle grid contains the distinct values 0 through  side^2 - 1
   *  @return true if the tiles in the puzzle are all arranged in increasing order
   *               (the hole value 0 may be in any position);
   *          false otherwise
  */
  public boolean isDone()
  {
    int prev = 0;

    for (int r = 0; r < side; r++)
    {
      for (int c = 0; c < side; c++)
      {
        int num = values[r][c];
        if (num != 0)
        {
          if (num != prev + 1)
            return false;
          prev = num;
        }
      }
    }
    return true;
  }

  /*** Part (b) ***/

  /** Initializes the puzzle by placing numbers 0 through side^2 - 1 into random locations
   */
  public void initialize()
  {
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for (int j = 0; j < side * side; j++)
      temp.add(new Integer(j));

    for (int r = 0; r < side; r++)
    {
      for (int c = 0; c < side; c++)
      {
        int i = (int)(Math.random() * temp.size());
        values[r][c] = temp.get(i).intValue();
        temp.remove(i);
        // Or:
        //    values[r][c] = temp.remove(i).getValue();
        // Or:
        //    values[r][c] = temp.remove(i);
      }
    }
  }

  /*** Part (c) ***/

  // O(n^2)

  /*** Part (d) ***/

  // O(n)

  /****************/

  public String toString()
  {
    String s = "";
    for (int r = 0; r < side; r++)
    {
      for (int c = 0; c < side; c++)
        s += values[r][c] + " ";
      s += "\n";
    }
    s += "\n" + isDone() + "\n";
    return s;
  }

  public void initialize(int i)
  {
    int j = 0;
    int num = 1;
    for (int r = 0; r < side; r++)
    {
      for (int c = 0; c < side; c++)
      {
        if (j == i)
          values[r][c] = 0;
        else
          values[r][c] = num++;
        j++;
      }
    }
  }

  public static void main(String[] args)
  {
    SlidingPuzzle puzzle = new SlidingPuzzle(3);
    System.out.println(puzzle);

    for (int i = 0; i < 9; i++)
    {
      puzzle.initialize(i);
      System.out.println(puzzle);
    }
  }
}