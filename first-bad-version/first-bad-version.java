/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int low = 1, high = n;
        
        while(low <= high){
            int mid = low + (high-low) / 2;
            
            boolean midBad = isBadVersion(mid);
            boolean lowBad = isBadVersion(low);
            boolean highBad = isBadVersion(high);
            
            if(highBad & midBad){
                high = mid-1;
            }
            else {
               low = mid + 1;
            }
          
        }
        return low;
    }
}