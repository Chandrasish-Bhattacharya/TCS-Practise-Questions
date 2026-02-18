
import java.util.Arrays;
import java.util.HashMap;



public class RankInTheArray{
    public static void arrayRankTransform(int[] arr) {
        int[] sa = arr.clone();
        Arrays.sort(sa);
        HashMap<Integer , Integer> list = new HashMap();
        int rank = 1;
        for(int i : sa){
            if(!list.containsKey(i)){
                list.put(i ,rank++);
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
                arr[i] = list.get(arr[i]);
        }      
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,15,8,25,9};
        arrayRankTransform(arr);
        for(int i : arr){
        System.out.print(i + " ");
        }

    }

}