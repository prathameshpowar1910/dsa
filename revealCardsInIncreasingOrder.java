//PROBLEM NO 950 LEETCODE

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int N = deck.length;
        int[] res = new int[N];
        Deque<Integer> indices = new LinkedList();

        for (int i = 0 ; i<N ; i++) {
            indices.add(i);
        }

        for (int card: deck) {
            int index = indices.poll();
            res[index] = card;

            if (!indices.isEmpty()) {
                indices.add(indices.poll());
            }
        }

        return res;
    }
}
