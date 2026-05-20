class Test{
    public static void main(String args[]){
        // Problem 1---String Convert to lower case
        String str = "KHUSHI";
        str  = str.toLowerCase();
        System.out.println(str);

        // Problem 2---String Convert to upper case
        String str2 = "khushi";
        str2 = str.toUpperCase();
        System.out.println(str2);

        // Problem 3---Replace the alphabet in String
        String str3 = "Seeta Seeta";
        str3 = str3.replace("S","M");  //all S in String replace with M---i.e. Meeta Meeta
        System.out.println(str3);
        str3 = str3.replace("h","n");    //this change Mohan--i.e. Monan
        System.out.println(str3);
    }
}