import java.util.*; 
 
public class CharacterOccurnece { 
    public static void main(String[] args) { 
        String str="Chinmay Sai"; 
        //str=str.replace(" ",""); 
        System.out.println(str); 
        HashMap<Character,Integer> hm=new HashMap<>(); 
        for(int i=0;i<str.length();i++) 
        { 
            char ch=str.charAt(i); 
            int count=1; 
            for(int j=i+1;j<str.length();j++) 
            { 
                if(ch==str.charAt(j)) 
                { 
                    count++; 
                } 
            } 
            if(!hm.containsKey(ch)) { 
                hm.put(ch, count); 
            } 
        } 
        Collection col=hm.values(); 
        Iterator itr=col.iterator(); 
        Set st=hm.keySet(); 
        Iterator it=st.iterator(); 
        while(itr.hasNext()) 
        { 
            String i1=String.valueOf(itr.next()); 
            Integer i=Integer.parseInt(i1); 
            //Character ch=Character.valueOf((Character)it.hasNext()); 
            String val=String.valueOf(it.next()); 
            if(i==2) 
            { 
                System.out.println(val); 
            } 
 
        } 
 
    } 
 
} 
