import java.util.*;
public class magicallatterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int k=sc.nextInt();
         int n=sc.nextInt();

         int[] array=new int[n];
         for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
         }
         Deque<Integer> dq=new ArrayDeque<>();
         List<Integer>maxlist=new ArrayList<>();

         for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && array[dq.peekLast()]<=array[i]){
                dq.pollFirst();
            }
            dq.offerLast(i);

            if(i>=k-1){
                maxlist.add(array[dq.peekFirst()]);
            }
         }

         int res=Integer.MAX_VALUE;

         for(int max:maxlist){
            res=Math.min(res,max);
         }

         System.out.println(res);
         sc.close();
    }
}
