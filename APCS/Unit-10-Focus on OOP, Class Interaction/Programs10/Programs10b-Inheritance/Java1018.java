// Java1018.java
// The <SubTree2> class extends the <Tree> class
// and re-defines a <SubTree2> constructor to change the <leavesColor>.


import java.awt.*;
import java.applet.*;


public class Java1018 extends Applet
{
	public void paint(Graphics g)
	{
      SubTree2 tree2 = new SubTree2();
      tree2.drawTree(g);
   }
}


class SubTree2 extends Tree
{
   public SubTree2()
   {
      setLeavesColor(Color.green);
   }
}

