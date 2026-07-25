class Solution {
    public String originalDigits(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,0);
        }
        for(char ch:s.toCharArray()){
            map.put(ch,map.get(ch)+1);
        }
        String[] arr={
            "two","four","six","eight","zero","one","three","five","seven","nine"
        };
        char[] charr={
            'w','u','x','g','z','o','t','v','s','i'
        };
        StringBuilder ans=new StringBuilder();
        if(map.containsKey('w')){
            for(int i=0;i<map.get('w');i++){
                map.put('t',map.get('t')-1);
                if(map.get('t')==0){
                    map.remove('t');
                }
                map.put('o',map.get('o')-1);
                if(map.get('o')==0){
                    map.remove('o');
                }
                ans.append(2);
            }
            map.remove('w');
            
        }
        if(map.containsKey('x')){
            for(int i=0;i<map.get('x');i++){
                map.put('s',map.get('s')-1);
                if(map.get('s')==0){
                    map.remove('s');
                }
                map.put('i',map.get('i')-1);
                if(map.get('i')==0){
                    map.remove('i');
                }
                ans.append(6);
            }
            map.remove('x');
            
        }
        if(map.containsKey('z')){
            for(int i=0;i<map.get('z');i++){
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                map.put('o',map.get('o')-1);
                if(map.get('o')==0){
                    map.remove('o');
                }
                map.put('r',map.get('r')-1);
                if(map.get('r')==0){
                    map.remove('r');
                }
                ans.append(0);
            }
            map.remove('z');
            
        }
        if(map.containsKey('u')){
            for(int i=0;i<map.get('u');i++){
                map.put('f',map.get('f')-1);
                if(map.get('f')==0){
                    map.remove('f');
                }
                map.put('o',map.get('o')-1);
                if(map.get('o')==0){
                    map.remove('o');
                }
                map.put('r',map.get('r')-1);
                if(map.get('r')==0){
                    map.remove('r');
                }
                ans.append(4);
            }
            map.remove('u');
            
        }
        if(map.containsKey('f')){
            for(int i=0;i<map.get('f');i++){
                map.put('i',map.get('i')-1);
                if(map.get('i')==0){
                    map.remove('i');
                }
                map.put('v',map.get('v')-1);
                if(map.get('v')==0){
                    map.remove('v');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                ans.append(5);
            }
            map.remove('f');
            
        }
        if(map.containsKey('o')){
            for(int i=0;i<map.get('o');i++){
                map.put('n',map.get('n')-1);
                if(map.get('n')==0){
                    map.remove('n');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                
                ans.append(1);
            }
            map.remove('o');
            
        }
        if(map.containsKey('g')){
            for(int i=0;i<map.get('g');i++){
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                map.put('i',map.get('i')-1);
                if(map.get('i')==0){
                    map.remove('i');
                }
                map.put('h',map.get('h')-1);
                if(map.get('h')==0){
                    map.remove('h');
                }
                map.put('t',map.get('t')-1);
                if(map.get('t')==0){
                    map.remove('t');
                }
                ans.append(8);
            }
            map.remove('g');
            
        }
        if(map.containsKey('h')){
            for(int i=0;i<map.get('h');i++){
                map.put('t',map.get('t')-1);
                if(map.get('t')==0){
                    map.remove('t');
                }
                map.put('r',map.get('r')-1);
                if(map.get('r')==0){
                    map.remove('r');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                ans.append(3);
            }
            map.remove('h');
            
        }
        if(map.containsKey('v')){
            for(int i=0;i<map.get('v');i++){
                map.put('s',map.get('s')-1);
                if(map.get('s')==0){
                    map.remove('s');
                }
                map.put('n',map.get('n')-1);
                if(map.get('n')==0){
                    map.remove('n');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                ans.append(7);
            }
            map.remove('v');
            
        }
        if(map.containsKey('i')){
            for(int i=0;i<map.get('i');i++){
                map.put('n',map.get('n')-1);
                if(map.get('n')==0){
                    map.remove('n');
                }
                map.put('n',map.get('n')-1);
                if(map.get('n')==0){
                    map.remove('n');
                }
                map.put('e',map.get('e')-1);
                if(map.get('e')==0){
                    map.remove('e');
                }
                ans.append(9);
            }
            map.remove('i');
            
        }
        char[] sort=ans.toString().toCharArray();
        Arrays.sort(sort);
        ans=new StringBuilder();
        for(char ch:sort){
            ans.append(ch);
        }
        return ans.toString();
    }
}