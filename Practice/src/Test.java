import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Practice p = new Extend();
		System.out.println(p.getI());
		
		int o = 50;
		Integer a = new Integer(o);
		Object b = new Integer(3);
		System.out.println(a.compareTo((Integer)b));
		Object c = new Integer(3);
		System.out.println(c.equals(b));
		
		Object q = new Extend();
		System.out.println(p.equals(q));
		Extend r = (Extend)q;
		System.out.println(r.equals(q));
		
		List<Practice> list = new ArrayList<Practice>();
		list.add(0, new Extend());
		list.add(0, new Extend(1));
		System.out.println(list.get(0));
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(0,1);
		l.add(0,2);
		System.out.println(l.get(0));
	}
}
