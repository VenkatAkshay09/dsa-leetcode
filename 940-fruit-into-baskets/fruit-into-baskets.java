class Solution {
    public int totalFruit(int[] fruits) {
        int fruitType = 0; 
        int low=0;
        int count = Integer.MIN_VALUE;
        Map<Integer,Integer> basket = new HashMap<>();
        for (int high = 0; high < fruits.length; high++) {
            if(basket.containsKey(fruits[high])) 
                basket.put(fruits[high],basket.get(fruits[high])+1);
            else {
                basket.put(fruits[high],1);
                fruitType++;
            }
            while(fruitType>2){
                basket.put(fruits[low], basket.get(fruits[low])-1);
                if(basket.get(fruits[low])==0){
                    basket.remove(fruits[low]);
                    fruitType--;
                }
                low++;
            }
            if(fruitType<=2) count= Math.max(count, high-low+1);
        }
        return count;
    }
}