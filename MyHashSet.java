class MyHashSet {

   HashSet<Integer> h;  
    public MyHashSet() {
        h=new HashSet<Integer>();
    }
    
    public void add(int key) {
        h.add(key);
    }
    
    public void remove(int key) {
        h.remove(key);
        
    }
    public boolean contains(int key) {
        return h.contains(key);
        
    }
}
