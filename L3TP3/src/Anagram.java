import java.util.* ; 
import java.io.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc;
		ArrayList<String> list = new ArrayList<String>();
		int nbAnag;
		try{
			sc = new Scanner(new File("dictionary.txt"));
			while(sc.hasNext())
			{
				String str = sc.next();
				//System.out.print(str+"\n");
				list.add(str);
			}
		}
		catch(FileNotFoundException e){System.err.println("Le fichier est introuvable !");}
		
		System.out.println(list.size());

		for(String s : list)
		{
			ArrayList<String> anag = new ArrayList<String>();
			anag.add(s);
			nbAnag = 0;
			//System.out.println(s);
			if(s.length() >= 8)
			{
				//System.out.println("oui");
				//String sr1 = sortString(s);
				for(String s2 : list)
				{
					if(sortString(s).equals(sortString(s2)))
					{
						//System.out.println("egal");
						nbAnag++;
						anag.add(s2);
						
					}	
				}
				//System.out.println(anag.size());
				//attention au premier element!
				if(nbAnag > 2)
				{
					System.out.print(nbAnag + "  : ");
					System.out.print(anag.get(1));
					for(int i = 2; i < anag.size(); i++)
						System.out.print(", " + anag.get(i));
					System.out.println("\n");
				}
				//System.out.println("\n");
			}
		}
		
	}
	
	
	public static String sortString(String s)
	{
		char[] ar = s.toCharArray();
		Arrays.sort(ar);
		String str = new String(ar);
		return str; 
	}
	
}
