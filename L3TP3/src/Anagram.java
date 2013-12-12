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
		ArrayList<String> anag;
		/*for(int  i = 0; i < list.size(); i++)*/
		while(list.size()>1)
		{
			anag = new ArrayList<String>();
			anag.add(list.get(0));
			list.remove(list.get(0));
			int s = anag.get(0).length();
			nbAnag = 1;
			//System.out.println(s);

				//System.out.println("oui");
				//String sr1 = sortString(s);
				ArrayList<String> list2 = null;
				list2 = list;
				for(int j = 0; j < list2.size(); j++)
				{
					if(list2.get(j).length() == s)
					{
						if(sortString(anag.get(0)).equals(sortString(list2.get(j))))
						{
							//System.out.println("egal");
							nbAnag++;
							anag.add(list2.get(j));
							//int j = list.indexOf(s2);
							//list.remove(list2.get(j));
						}	
					}
				}
				//System.out.println(anag.size());
				//attention au premier element!
				if(nbAnag > 8)
				{
					System.out.print(nbAnag + "  : ");
					System.out.print(anag.get(0));
					for(int i = 1; i < anag.size(); i++)
					{
						System.out.print(", " + anag.get(i));
						list.remove(anag.get(i));
					}
					System.out.println("\n");
				}
				//System.out.println("\n");
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
