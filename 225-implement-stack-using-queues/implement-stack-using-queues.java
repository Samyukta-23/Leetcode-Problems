class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        Queue<Integer> st=new LinkedList<>();
        int ans=-1;
        while(!q.isEmpty()){
            ans=q.poll();
            if(q.isEmpty()) break;
            st.offer(ans);
        }
        while(!st.isEmpty()){
            q.offer(st.poll());
        }
        return ans;
    }
    
    public int top() {
        Queue<Integer> st=new LinkedList<>();
        int ans=-1;
        while(!q.isEmpty()){
            ans=q.poll();
            st.offer(ans);
        }
        while(!st.isEmpty()){
            q.offer(st.poll());
        }
        return ans;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */