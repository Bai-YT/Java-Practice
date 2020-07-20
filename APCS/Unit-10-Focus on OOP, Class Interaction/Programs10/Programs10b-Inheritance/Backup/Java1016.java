// Java1016.java
// The programs will now investigate inheritance class-interaction.
// The <Tree> class is placed in an external file
// with a group of "get" and "set" methods and will
// be the superclass for various new subclasses.


import java.awt.*;
import java.applet.*;


public class Java1016 extends Applet
{
	public void paint(Graphics g)
	{
      Tree tree = new Tree();
      tree.drawTree(g);
  	}
}

