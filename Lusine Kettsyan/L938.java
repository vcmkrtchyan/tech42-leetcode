class Solution {

	static int sum = 0;

	public static int rangeSumBST(TreeNode root, int low, int high) {
        
		if(root == null) {
			return sum;
		}
	
		calcSum(root, low, high);
		return sum;
    }


	private static void calcSum(TreeNode root, int low, int high) {
		if(root == null) {
			return;
		}
		if(root.val >= low ) {
			rangeSumBST(root.left, low, high);
		}
		if(root.val >= low && root.val <= high) {
			sum += root.val;
		}
		if(root.val <= high ) {
			rangeSumBST(root.right, low, high);
		}
	}
}