class map1{
    static int map(int n, String keys[], int arr[], String s)
    {
        // code here
        HashMap<String,Integer> x= new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
         x.put(keys[i],arr[i]);
        if(x.containsKey(s))
           return x.get(s);
        else 
          return -1;
    }
}
