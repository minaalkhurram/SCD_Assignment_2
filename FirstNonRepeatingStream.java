import java.util.*;

public class FirstNonRepeatingStream {
    private ArrayList<Character> stream;
    private HashMap<Character,Integer> freqeuncy;

    FirstNonRepeatingStream()
    {
        stream=new ArrayList<Character>();
        freqeuncy=new HashMap<Character,Integer>();
    }
    public void add(Character c)
    {
          boolean check=false;

          if(freqeuncy.containsKey(c))
          {
              check=true;
            stream.remove(c);
          }
           
           if(check==false)
           {
                stream.add(c);
                freqeuncy.put(c, null);
           }
    }
    public Character getFirstNonRepeating()
    {
        if(stream.isEmpty()==false)
        return stream.get(0);
        else
        return '-';

    }

    public static void main(String args[]){
        FirstNonRepeatingStream s1=new FirstNonRepeatingStream();
        s1.add('a');
        s1.add('b');
        s1.add('a');

        System.out.println("Non repating from stream{a,b,a} : "+s1.getFirstNonRepeating());

            FirstNonRepeatingStream s2=new FirstNonRepeatingStream();
        s2.add('a');
        s2.add('b');
        s2.add('a');
        s2.add('b');

        System.out.println("\nNon repating from stream{a,b,a,b} : "+s2.getFirstNonRepeating());

              FirstNonRepeatingStream s3=new FirstNonRepeatingStream();
        s3.add('a');
        s3.add('b');
        s3.add('b');

        System.out.println("\nNon repating from stream{a,b,b} : "+s3.getFirstNonRepeating());


    }
}
