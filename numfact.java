class numfact {
    public int trailingZeroes(int n) {
        int rem=1,s=0,count=0;
        for(int i=n;i>=1;i--)
        {
           rem=rem*i;
        }
        while(rem!=0) 
            {
              s=n%10;
              if(s==0)
                  count=count+1;
              n=n/10;
              
            }
         
        return count;
    }
}
