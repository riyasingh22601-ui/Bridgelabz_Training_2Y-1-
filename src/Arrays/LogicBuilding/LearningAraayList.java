package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningAraayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1,5);
        list.add(7,8);
        list.add(8,6);
        list.add(3,4);
        list.add(9,10);
        System.out.println("List the array"+list);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++) {
            nums[i] = list.get(i);
        }
        System.out.println("We have converted the arrayList into array");
        System.out.println(Arrays.toString(nums));
        }
    }

