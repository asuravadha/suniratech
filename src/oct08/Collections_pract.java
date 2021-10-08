package oct08;

import java.util.*;

public class Collections_pract {
    public static void arraylist(){
        ArrayList<Integer> data= new ArrayList<>();
        for(int i=0;i<5;i++){
            data.add(i);
        }
        //modify data thorugh index
        data.set(0,123);
        //remove a value through index
        data.remove(2);
//    //to clear the data
//    data.clear();
        System.out.println("data from array list");
//before sorting
        System.out.println("before sorting");
        for(int info:data) {
            System.out.println(info);
        }
        System.out.println("after sorting");
        Collections.sort(data);
        for(int info:data) {
            System.out.println(info);
        }
        //lat position data
        System.out.println("last position data "+data.get(data.size()-1));

//to compared parllel index values in arrays
        int[] array1={1,2,5,7,9,0};
        int[] array2={1,6,5,8,9,1};
        for(int i=0;i<array1.length;i++){
            if(array1[i]==array2[i]){
                System.out.println("index "+i+ " got same values array 1 :"+array1[i]+" array2: "+array2[i] );
            }
        }
    }
    private static void hashmap() {
        HashMap<String,String> details=new HashMap<>();
        details.put("name","Eswar");
        details.put("role","web");
        details.put("experience","5");
        //display entire hashmap
        System.out.println(details);
        //specific key==> value
        System.out.println(details.get("name"));
        //find size
        System.out.println(details.size());
        //remove a value using key
        details.remove("experience");
        //display entire hashmap
        System.out.println(details);
////clear data in hash map
//        details.clear();
        //traverse through key details
for(String data: details.keySet()){
    System.out.println(data);
}
//traverse through values
        for(String data: details.values()){
            System.out.println(data);
        }

    }
    private static void hashset(){
        Scanner input=new Scanner(System.in);
        HashSet<String> data=new HashSet<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter  data");
            data.add(input.next());
        }
        System.out.println("data added to hasset ");
//traverse thourgh hashset

        for(String info:data){
            System.out.println("this is the data"+info);
        }
        //find a value
        System.out.println(data.contains("a"));
////clear hashset
//        data.clear();
        //size of my hash set
        System.out.println(data.size());

    }
public static void main(String args[]){
    //call arraylist to implement it
    //arraylist();
    //call hashmap to implement it
//    hashmap();
//call hashset to implement it
    hashset();

}


}
