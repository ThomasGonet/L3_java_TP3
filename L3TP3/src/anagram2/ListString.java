package anagram2;

import java.util.Arrays;

public class ListString {
	String val ;
	ListString next ;
	
	ListString (String p, ListString next) {
		this.val = p ; this.next = next ;
		}
	
	  // Afficher la liste p sur une ligne.
	  static void afficher(ListString p) {
	    if (p == null) {
	      System.out.println() ;
	      return ;
	    }
	    for ( ; p.next != null ; p = p.next) {
	      System.out.print(p.val) ; System.out.print(" ") ;
	    }
	    System.out.println(p.val) ;
	  }

}
