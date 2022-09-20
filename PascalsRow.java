public class PascalsRow {
    public int[] getRow(int A) {
        int[] pas = new int[A+1];
        int[][]pas_= new int[A+1][A+1];
        pas[0] =1;
         if(A == 0){
             return pas;
         }
         if(A == 1){
             pas[0] = 1;
             pas[1] = 1;
             return pas;
         }
        
        for (int i = 1; i<A+1; i++){
             if(pas_[i][1]==0)
                 pas_[i] = getRow(A-1);
            pas[i] = pas[i-1]* (A-i+1) /i;
        }
         for(int i=A; i>A/2;i--){
             pas[i]=pas[A-i];
         }
        pas[A]=1;
        return pas;
        
    }

    public int[] getPascalRow(int A) {
        int[] pas = new int[A+1];
        pas[0] =1;
     //this is the formula for getting particular element of kth row
// derived from PnC
// nCr = (nCr-1 * (n - r + 1))/r   
        for (int i = 1; i<A+1; i++){
            pas[i] = pas[i-1]* (A-i+1) /i;
        }
        pas[A]=1;
        return pas;
        
    }

/*
We observe that each element of the row can be written in the form of

row[i] = choose(n,i)
where 0 <= i <= n.
Instead of calculating the choose function that relies on computing huge factorials, we can exploit the relation between nCk-1 and nCk

nCk = (nCk-1)(n-K+1)/k

if using binomial expansion you can notice that you can create the k'th element of the n'th row like so:

k = column
n = row

k'th element in the n'th row:   
pascal_triangle[n][k] = n! / ((n-k)!k!)
= ((n-k+1) / (n-k+1)) * n! / ((n-k)!(k-1)k!)
= (n! / ((n-k+1)!(k-1)!)) * ((n-k+1)/k)
= pascal_triangle[n][k-1] * ((n-k+1)/k)

we know that the first element is always 1, so now we can use this formula to generate the rest of the elements

*/
}
