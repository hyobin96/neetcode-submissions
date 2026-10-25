class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> y - x);
        
        for (int stone: stones) heap.add(stone);

        while (heap.size() > 1) {
           int x = heap.poll();
           int y = heap.poll();

        //    System.out.println("x = " + x + "y = " + y);

           if (x > y) {
            heap.add(x - y);
           } 
        }

        return heap.size() == 0 ? 0 : heap.peek();
    }
}
