package anagram2;
import java.io.* ;

class WordReader {
  private BufferedReader in ;

  WordReader(Reader rd) {
    in = new BufferedReader (rd) ;
  }

  WordReader(String name) {
    try {
      in = new BufferedReader(new FileReader(name)) ;      
    } catch (FileNotFoundException e) {
      System.err.println("Cannot open " + name + ": " + e.getMessage()) ;
      System.exit(2) ;
    }
  }

  String read() {
    try {
      return in.readLine() ;
    } catch (IOException e) {
      System.err.println("Error in read: " + e.getMessage()) ;
      return null ;
    }
  }


  void close() {
    try {
      in.close() ;
    } catch (IOException e) { }
  }

  public static void main(String [] arg) {
    /* Fabrication du lecteur des mots (des lignes en fait) */
    WordReader in = null ;
    if (arg.length > 0) {
      in = new WordReader (arg[0]) ;
    } else {
      in = new WordReader (new java.io.InputStreamReader (System.in)) ;
    }
    /* Lecture de tous les mots de l'entrée */
    String w = in.read() ;
    while (w != null) {
      System.out.println(w) ;
      w = in.read() ;
    }
    /* Fermer l'entrée (c'est plus propre, ça libère des ressources) */
    in.close() ;
  }
}