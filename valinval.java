class valinval {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        char[] ch=s.toCharArray();
        char v;
        for(char i:ch)
        {
            v=st.empty()?'*':st.peek();
            if(v=='('&&i==')')
                st.pop();
            else if(v=='['&&i==']')
                st.pop();
             else if(v=='{'&&i=='}')
                st.pop();
            else
                st.push(i);
        }
        return (st.empty()?true:false);
    }
}
