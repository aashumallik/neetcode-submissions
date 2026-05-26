class Solution {
    public boolean isAnagram(String s, String t) {
    
    
HashMap<Character,Integer> map = new HashMap<Character,Integer>();

    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            int counter = map.get(c)+1;
            map.put(c,counter);
        }else{
            map.put(c,1);
        }
    }
    for(int i=0;i<t.length();i++){
        char c= t.charAt(i);
        if(map.containsKey(c)){
            int counter = map.get(c)-1;
            map.put(c,counter);
        }else{
            return false;
        }
    
    }
    for(int count:map.values()){
        if(count !=0){
            return false;
        }

    }
    return true;
    }
}