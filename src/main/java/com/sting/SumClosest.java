package com.sting;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/*to be corrected*/
public class SumClosest {

    public static void main(String[] args) throws IOException {

        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(bufRead.readLine());
        int[] nums = Arrays.stream(bufRead.readLine().split(",")).mapToInt(Integer::parseInt).toArray();


        int sum = threeSum(nums,n);

        bufWriter.write("sum is " + sum);

        bufWriter.newLine();

        bufWriter.close();
        bufWriter.close();

    }

    private static int threeInterval(int[] numbers, int target){



        return 0;
    }

    private static int threeSum(int[] nums, int target) {

        Arrays.sort(nums);
        int x=0;
        int z= nums.length-1;
        int sum = 0;
        boolean increase = true;
        boolean decrease = true;
        int lastSum=0;
        int i = 0;
        int[] xnum = new int[nums.length];
        do{
            xnum[i]=nums[i]-target;
            i++;
        }while(i<nums.length);

        i=0;
        int[] ynum = new int[nums.length];
        do{
            ynum[i]=target-nums[i];
            i++;
        }while(i<nums.length);

        nums=nums;
        xnum = xnum;
        ynum = ynum;

        do{
            sum = nums[x] + nums[x+1] + nums[z];
            if(sum == target)
                return sum;

            if(sum>target && increase) {
                x++;
                decrease = false;
            }
            else if(sum<target && decrease) {
                z--;
                increase=false;
            }else if(Math.abs(target-sum)<Math.abs(target-lastSum))
            {
                return sum;
            }else
                return lastSum;

            lastSum= sum;
        } while(x!= nums.length-2 || z!=x+2);

        return nums[x] + nums[x+1] + nums[z];

    }

    private static int threeSumClosest(int[] nums, int target) {
        int[] x = new int[3];
        int i = 3;
        x[0] = nums[0];
        x[1] = nums[1];
        x[2] = nums[2];

        int z = (x[0]+x[1]+x[2]);
        if(z==target || nums.length == 3)
            return z;

        do{
            int k = target - nums[i];
            if(k<=(target - x[0]))
                x[0] = nums[i];
            else if(k<=(target - x[1]))
                x[1] = nums[i];
            else if(k<=(target - x[2]))
                x[2] = nums[i];

            if((x[0]+x[1]+x[2]) == target)
                break;
        i++;
        }while(i < nums.length);

        return (x[0]+x[1]+x[2]);
    }

}
