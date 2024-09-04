package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExcepetionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked

        Object object = null;
        System.out.println(object.toString()); // NullPointerException

        int[] nums =  {1,2};
        System.out.println(nums[2]); //ArrayIndexOutOfBoundsException


    }
}
