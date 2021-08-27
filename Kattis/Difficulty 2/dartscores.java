import java.util.Scanner();
class dartscores{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int[] points = new int[]{0,20,40,60,80,100,120,140,160,180,200};
        int[] score = new int[]{10,9,8,7,6,5,4,3,2,1,0};
        for(int i = 0; i < cases; i++){
            int ans = 0;
            int shots = scan.nextInt();
            for(int j = 0; j < shots; j++){
                double x = scan.nextInt();
                doubley = scan.nextInt();
                double area = Math.sqrt(x*x+y*y);
                int low = 0;
                int high = points.length - 1;
                int mid = (high + low) / 2;
                while(low <= high) {
                    mid = (high+low) / 2;
                    if(points[mid] == area) {
                        high = mid - 1;
                        break;
                    } else if (points[mid] > area) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                ans += score[(high < 0 ? 0 : high)];
            }
            System.out.println(ans);
        }
    }
}