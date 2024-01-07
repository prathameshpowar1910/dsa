class Solution {
    public static boolean isGreater(int candy,int extraCandies,int maxCandies) {
        if (candy + extraCandies >= maxCandies) {
            return true;
        }
        return false;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            boolean res = isGreater(candy, extraCandies, maxCandies);
            result.add(res);
        }

        return result;
    }
}
