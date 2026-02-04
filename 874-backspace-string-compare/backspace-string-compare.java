class Solution {
    public boolean backspaceCompare(String s, String t) {
        List<Character> res1 = new ArrayList<>();
        int c1 = 0, c2=0;
        List<Character> res2 = new ArrayList<>();
        for(int i=s.length()-1; i>=0;i-- ){
            if( s.charAt(i)=='#') c1++;
            else if(c1>0) c1--;
            else res1.add(s.charAt(i));
        }
        for(int i=t.length()-1; i>=0;i-- ){
            if( t.charAt(i)=='#') c2++;
            else if(c2>0) c2--;
            else res2.add(t.charAt(i));
        }
        return res1.equals(res2);
    }
}