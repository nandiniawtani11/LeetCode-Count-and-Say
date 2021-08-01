class Solution {
    String s="1";
    public String countAndSay(int n) {
        if(n==1)
            return s;
        if(s.length()==1)
        {
            s=s+"1";
            System.out.println(s);
            return countAndSay(n-1);
        }
        else
        {
            String str="";
            char[] ch=s.toCharArray();//1 1
            int count=1;
            int i=0;
            for(i=0;i<ch.length-1;i++)
            {
                if(ch[i]==ch[i+1])
                    count=count+1;
                else
                {
                    str=str+count+ch[i];
                    count=1;
                }
            }
            if(ch[i]==ch[i-1])
            {
                str=str+count+ch[i];
            }
            else
            {
                str=str+"1"+ch[i];
            }
             s=str;
        }
        return countAndSay(n-1);
    }
}
