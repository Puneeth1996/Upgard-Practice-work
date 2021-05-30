// Minimum Element in a Sorted and Rotated Array
// You are given a sorted array of 'n' elements. The array has been rotated on an unknown pivot. You need to find the minimum element in the array.
// Approach
// You can solve this using binary search. The minimum element is the only element whose previous element is greater than it. If there is no previous element, then there is no rotation (the first element is the minimum). You check this condition for the middle element by comparing it with the (mid-1) th and (mid+1) th elements.
// If the minimum element is not at the middle (neither mid nor mid+1), then the minimum element lies in either the left half or the right half. 
// If the middle element is smaller than the last element, then the minimum element lies in the left half.
// Else, the minimum element lies in the right half.

public class minFromSortedArray {

}
