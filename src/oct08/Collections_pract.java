package oct08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collections_pract {
public static void main(String args[]){
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
}
