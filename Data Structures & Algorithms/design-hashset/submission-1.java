class MyHashSet {
    boolean[] vis;
    public MyHashSet() {
        vis=new boolean[1000001];
    }
    
    public void add(int key) {
        vis[key]=true;
    }
    
    public void remove(int key) {
        vis[key]=false;
    }
    
    public boolean contains(int key) {
        return vis[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */