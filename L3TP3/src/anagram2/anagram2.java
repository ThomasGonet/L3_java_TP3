package anagram2;

import java.util.* ; 
import java.io.*;
import anagram.Signature;

public class anagram2 {
	
	  public static void main(String [] arg) {
		    /* Lecture de tous les mots de l'entrée */
		    WordReader in = new WordReader ("dictionary.txt") ;
		    HashMap<String,ListString> t = read(in) ;
		    in.close() ;  // J'ai ouvert, je ferme.
		    /* Affichage */
		    afficher(t) ;
		  }
	
	  static HashMap<String,ListString> read(WordReader in) {
	    HashMap<String,ListString> t = new HashMap<String,ListString> () ;
	    String w = in.read() ;
	    while (w != null) {
	      String sig = Signature.sortString(w) ;
	      ListString p = t.get(sig) ;
	      t.put(sig, new ListString(w, p)) ;
	      w = in.read() ;
	    }
	    return t ;
	  }
	  
	  static void afficher(HashMap<String,ListString> t) {
		    for (ListString p : t.values()) {
		      if (p.next != null) {
		        ListString.afficher(p) ;
		      }
		    }
		  }

}
