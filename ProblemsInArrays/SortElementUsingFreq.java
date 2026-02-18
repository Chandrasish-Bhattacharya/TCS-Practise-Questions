
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SortElementUsingFreq{
    public static int[] SortWithFreq(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1); // here the keys are the array element and the values are the freq
        }
        Integer[] result = new Integer[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            result[i] = arr[i];
        }

        Arrays.sort(result , new Comparator<Integer>(){
            public int compare(Integer a , Integer b){
                if(map.get(a) == map.get(b)){
                return a - b;
            }
            return map.get(b) - map.get(a);
            }
        });
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = result[i];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 4, 3, 1, 2};
        int[] result = SortWithFreq(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}