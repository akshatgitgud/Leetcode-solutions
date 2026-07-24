package sorting;

import java.util.Arrays;

public class avgSalaryExcludingMinMax {
    public static void main(String[] args) {
        
    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        return (double)sum/(salary.length-2);

    }
}