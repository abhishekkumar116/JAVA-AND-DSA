package leetcodeHashMap;
import java.util.*;
public class findAllAnagramInString {
    public List<Integer> findAnagrams(String s, String p) {
        int st = 0;
        int e = p.length() -1;
        List<Integer> ans = new ArrayList<Integer>();
        if(p.length() > s.length() || st > e) return ans;

        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmp = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch, 0) + 1);
        }


        for(int i = 0; i <=e ; i++){
            char ch = s.charAt(i);
            hms.put(ch, hms.getOrDefault(ch, 0) + 1);
        }

        if(hms.equals(hmp))
            ans.add(st);

        st++; e++;
        while(e < s.length()){

            // add key for e
            char ch = s.charAt(e);
            hms.put(ch, hms.getOrDefault(ch, 0) + 1);

            //remove key for st
            ch = s.charAt(st-1);
            if(hms.containsKey(ch)){
                hms.put(ch, hms.get(ch) - 1);

                if(hms.get(ch) == 0)
                    hms.remove(ch);
            }
            if(hms.equals(hmp)) ans.add(st);
            st++;
            e++;
        }
        return ans;
    }
}
// public boolean compare(HashMap<Character, Integer> pmap, HashMap<Character, Integer> smap){
//         for(char ch : smap.keySet()){
//             if(pmap.getOrDefault(ch, 0) != smap.get(ch)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public List<Integer> findAnagrams(String s, String p) {
//         HashMap<Character, Integer> pmap = new HashMap<>();
//         HashMap<Character, Integer> smap = new HashMap<>();

//         List<Integer> ans = new ArrayList<>();

//         if (s.length()==0 || p.length() == 0 || p.length()>=s.length())
//             return ans;


//         for(int i = 0; i < p.length(); i++){
//             char ch = p.charAt(i);
//             pmap.put(ch,  pmap.getOrDefault(ch, 0) + 1);
//         }

//         for(int i = 0; i < p.length(); i++){
//             char ch = s.charAt(i);
//             smap.put(ch, smap.getOrDefault(ch, 0) + 1);
//         }

//         int i = p.length();

//         while(i < s.length()){
//             if(compare(pmap, smap) == true){
//                 ans.add(i - p.length());
//             }
//             // aquire
//             char cha = s.charAt(i);
//             smap.put(cha, smap.getOrDefault(cha, 0) + 1);

//             //release
//             char chr = s.charAt((i - p.length()));

//             if(smap.get(chr) == 1){
//                 smap.remove(chr);
//             }else{
//                 smap.put(chr, smap.get(chr) - 1);
//             }
//             i++;
//         }
//         if(compare(pmap, smap) == true){
//             ans.add(i - p.length());
//         }
//         return ans;
//     }

