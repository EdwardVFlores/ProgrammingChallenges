class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < target.length; i++){
            seen.put(target[i], seen.getOrDefault(target[i],0) + 1);
        }
        for(int i = 0; i < arr.length; i++) {
            if(seen.get(arr[i]) == null || seen.get(arr[i]) < 0) return false;
            seen.put(arr[i], seen.get(arr[i]) - 1);
        }
        for(int i : seen.values()) {
            if(i > 0) return false;
        }
        
        return true;
    }
}