package dataStructure;

public class Balanced {
	public static void main(String[] args)
    {
       String str="{{()}";
       boolean b=isBalanced(str);
       if(b)
        System.out.println("yes");
         else
        System.out.println("no");
    }
static boolean isBalanced(String st)
   {
     stack s1=new stack(st.length());
     char ch[]=st.toCharArray();
     for(int i=0;i<ch.length;i++)
      {
         if(ch[i]=='{' || ch[i]=='(' || ch[i]== '[')
           {
             s1.push(ch[i]);
           }
       else
         {
            switch(ch[i])
             {
                case ']' :if((char) s1.pop()!='[')
                          return false;
                          break;
                case ')':if((char) s1.pop()!='(')
                         return false;
                         break;
                case '}':if((char) s1.pop()!='{')
                	      return false;
                         break;
             }
         }
}
return s1.isEmpty();
}
}
           
