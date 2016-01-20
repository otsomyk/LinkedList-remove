package linkedList;

import java.util.Iterator;


public class Launcher {

	public static void main(String[] args) {
		 LinkedList list = new LinkedList();

		 list.addFirst("2");
		 list.addFirst("1");
		 list.addLast("3");
		 list.addAfter("3", "4");
		 list.addAfter("3", "5");
		 
		 for (  Iterator <Object> it = list.iterator();it.hasNext();){
	            it.next();
	            it.remove();
	        }


	        for(Object o : list) {
	            System.out.println(o);
	        }
	    }

}
