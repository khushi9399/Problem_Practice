import java.util.ArrayList;
class Intersection{
    public static void main(String args[]){
        int arr1[] = {1,4,2,8,0,9};
        int arr2[] = {2,4,6,9};
        ArrayList<Integer> union = new ArrayList<Integer>();

        int i,j;
        i=j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                if((union.size()-1 == 0) && ((union.get(union.size()-1) != arr1[i]))){
                    union.add(arr1[i]);
                    System.out.println("Test1");
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if((union.size()-1 == 0) && ((union.get(union.size()-1) != arr2[j]))){
                    union.add(arr2[j]);
                     System.out.println("Test2");
                }
                j++;
            }
            else if(arr1[i] == arr2[j]){
                if((union.size()-1 == 0) && ((union.get(union.size()-1) != arr1[i]))){
                    union.add(arr1[i]);
                     System.out.println("Test3");
                }
                i++;
                j++;
            }
        }
        while(i < arr1.length){
                if((union.size()-1 == 0) && ((union.get(union.size()-1) == arr1[i]))){
                    union.add(arr1[i]);
                     System.out.println("Test3");
                    i++;
                }
        }
        while(j < arr2.length){
                if((union.size()-1 == 0) && ((union.get(union.size()-1) == arr2[j]))){
                    union.add(arr2[j]);
                     System.out.println("Test4");
                    j++;
                }
        }
         System.out.println("Test5");
        System.out.println(union);
    }
}