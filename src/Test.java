import java.util.List;

public class Test {
    public static void main(String[] args) {
        //System.out.println(new CountAndSay().countAndSay(4));
        //System.out.println(new RolveNQueens().solveNQueens(4));
//        List<List<String>> results = new RolveNQueens().solveNQueens(4);
//        for(int i=0;i<results.size();i++){
//            for(int j=0;j<results.get(i).size();j++){
//                System.out.println(results.get(i).get(j));
//
//            }
//        }
//        System.out.println(new TotalNQueens().totalNQueens(4));
        //53. Maximum Subarray
//        int[] i=new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(new MaxSubArray().maxSubArray(i));
        //123. Best Time to Buy and Sell Stock III
//        int[] i=new int[]{3,3,5,0,0,3,1,4};
//        System.out.println(new MaxProfit3().maxProfit(i));
        //188. Best Time to Buy and Sell Stock IV
        int[] i=new int[]{2,6,8,7,8,7,9,4,1,2,4,5,8};
        System.out.println(new MaxProfit4().maxProfit(3,i));
    }

}
