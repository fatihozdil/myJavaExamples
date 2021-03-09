/*
 @author Muhammed Fatih ÖZDİL
 @since 09/03/2021

*/
package algorithmExamples;


public class GetLeftAndRight
{
public String mAndTstring(String m_stng, String t_stng) 
{
  int m_st_len = m_stng.length();
  int t_st_len = t_stng.length();
  String fin = "";
  for (int i = 0; i < m_st_len-t_st_len+1; i++) 
  {
    String tmp = m_stng.substring(i,i+t_st_len);
    if (i > 0 && tmp.equals(t_stng))
      fin += m_stng.substring(i-1,i);
    if (i < m_st_len-t_st_len && tmp.equals(t_stng))
      fin += m_stng.substring(i+t_st_len,i+t_st_len+1);
  }
  return fin;
}

public static void main (String[] args)
    {
      GetLeftAndRight m= new GetLeftAndRight();
      String str1 =  "weablcoabmeab";
      String str2 =  "ab";	  
      System.out.println("The given string are: "+str1+"  and "+str2);
      System.out.println("The new string is: "+m.mAndTstring(str1,str2));
	  }
}
