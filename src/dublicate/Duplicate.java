package dublicate;

import java.util.HashMap;
import java.util.Map;
//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap
public class Duplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 2, 3};
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numsMap.put(i, nums[i]);
        }

        int count = 0;

        for (Map.Entry entry : numsMap.entrySet()) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == (int)entry.getValue() && i != (int)entry.getKey())
                    count++;
            }
        }

        System.out.println(count);

    }
}
