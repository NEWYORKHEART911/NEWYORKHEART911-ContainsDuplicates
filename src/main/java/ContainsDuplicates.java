import java.util.*;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> dup = new HashSet<Integer>();
        for(int j=0; j<nums.length; j++) {
            if (dup.contains(nums[j])) {
                return true;
            }
            dup.add(nums[j]);
        }
        return false;
    }
}
