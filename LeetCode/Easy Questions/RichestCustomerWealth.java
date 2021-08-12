public class RichestCustomerWealth {
    public static void main(String[] args){
        int[][] exampleAccounts = new int[][]{{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(exampleAccounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0; i <= accounts.length - 1; i++){
            int currWealth = 0;
            for(int j = 0; j <= accounts[i].length - 1; j++){
                currWealth += accounts[i][j];
            }
            maxWealth = Math.max(currWealth,maxWealth);
        }
        return maxWealth;
    }
}
