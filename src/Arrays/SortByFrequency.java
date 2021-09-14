package Arrays;

import java.util.*;

public class SortByFrequency {

    public static void sor(int []arr,int n){
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> al=new ArrayList<>(map.entrySet());
        Collections.sort(al,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer>e1,Map.Entry<Integer,Integer>e2){
                if(e1.getValue()!=e2.getValue()){
                    return e2.getValue()-e1.getValue();
                }
                else return e1.getKey()-e2.getKey();
            }
        });
        // System.out.println(al);
        int k=0;
        for(int i=0;i<al.size();i++){
            Map.Entry<Integer,Integer>temp=al.get(i);
            int value=temp.getKey();
            int f=temp.getValue();
            for(int j=0;j<f;j++){
                arr[k++]=value;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 4, 6, 4};
        sor(arr, arr.length);
    }
}
