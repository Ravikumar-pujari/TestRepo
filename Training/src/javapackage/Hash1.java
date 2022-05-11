package javapackage;

import java.util.HashMap;
import java.util.Hashtable;

public class Hash1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm =  new HashMap<Integer, String>();
		hm.put(1, "jan");
		hm.put(2, "feb");
          System.out.println(hm.get(1));
          System.out.println(hm.get(2));
          System.out.println(hm);
          
          Hashtable<Integer, String> ht =  new Hashtable<Integer, String>();
  		ht.put(1, "mar");
  		ht.put(2, "apr");
            System.out.println(ht.get(1));
            System.out.println(ht.get(2));
            System.out.println(ht);
	}

}
