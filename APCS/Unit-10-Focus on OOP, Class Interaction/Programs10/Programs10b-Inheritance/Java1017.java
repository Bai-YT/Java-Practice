// Java1017.java
// The <SubTree1> class extends the <Tree> class
// without re-defining or newly-defining any methods.
// The resulting tree display is identical to its superclass version.


import java.awt.*;
import java.applet.*;


public class Java1017 extends Applet
{
	public void paint(Graphics g)
	{
      SubTree1 tree1 = new SubTree1();
      tree1.drawTree(g);
   }
}


class SubTree1 extends Tree
{

}

