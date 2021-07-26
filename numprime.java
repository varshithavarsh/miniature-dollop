class numprime {
    public int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++)
        {
            int temp=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                
                     temp=1;
                 break;
                
            }
            if(temp==0)
               {
                 count++;
               }
           
        }
        if(count>0)
            return count;
        else 
            return 0;
        
    }
}
