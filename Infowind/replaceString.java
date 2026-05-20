class ReplaceString{
    public static void main(String args[]){
        String str = "hello";

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.setCharAt(i, '*');
            }
        }
        System.out.print(sb.toString());
    }
}