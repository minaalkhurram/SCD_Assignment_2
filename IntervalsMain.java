import java.util.*;

public class IntervalsMain {
    
    public static void main(String args[])
    {
        List<int[]> Intervals = new ArrayList<>();
        int[] a1={1,3};
        int[] a2={2,6};
        int[] a3={8,10};
        int[] a4={15,18};
        Intervals.add(a1);
        Intervals.add(a2);
        Intervals.add(a3);
        Intervals.add(a4);
        Intervals=mergeIntervals(Intervals);

        for(int i=0;i<Intervals.size();i++)
        {
             int r1[]=Intervals.get(i);
            System.out.print("[");
             for(int j=0;j<r1.length;j++)
             {
                  System.out.print(r1[j]+",");
             }
                System.out.println("]\n");
        }

    }

    public static List<int[]> mergeIntervals(List<int[]> intervals )
    {
        //int i is the current postion , j is the next postion 
        for(int i=0,j=1;i<intervals.size();i++,j++)
        {
            int r1[]=intervals.get(i);

            if(j<intervals.size()){
            
            int r2[]=intervals.get(j);
        
            if(r1[r1.length-1]>r2[0])
            {
                r1[r1.length-1]=r2[r2.length-1];
                intervals.remove(j);

            }
        }
        else
        return intervals;
        }
        return intervals;

    }
 
}
