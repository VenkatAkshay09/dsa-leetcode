class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0, max = 0;
        Map<Integer, Integer> basket = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {
            basket.put(fruits[high], basket.getOrDefault(fruits[high], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[low], basket.get(fruits[low]) - 1);
                if (basket.get(fruits[low]) == 0) {
                    basket.remove(fruits[low]);
                }
                low++;
            }

            max = Math.max(max, high - low + 1);
        }
        return max;
    }
}
