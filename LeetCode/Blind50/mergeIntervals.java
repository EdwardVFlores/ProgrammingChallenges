public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
    Stack<int[]> stack = new Stack<>();
    //System.out.println(Arrays.deepToString(intervals));
    
    stack.push(intervals[0]);
    for(int i = 0; i < intervals.length - 1; i++){
        int[] firstInt = stack.pop();
        int minFirst = firstInt[0];
        int maxFirst = firstInt[1];
        int minSecond = intervals[i+1][0];
        int maxSecond = intervals[i+1][1];
        if(maxFirst >= minSecond) {
            int min = Math.min(minFirst, minSecond);
            int max = Math.max(maxFirst, maxSecond);
            int[] newInterval = new int[]{min,max};
            stack.push(newInterval);
        } else {
            stack.push(new int[]{minFirst,maxFirst});
            stack.push(new int[]{minSecond,maxSecond});
        }
    }
    int[][] answers = new int[stack.size()][2];
    int i = 0;
    while(!stack.isEmpty()){
        answers[i++] = stack.pop();
    }
    return answers;
}