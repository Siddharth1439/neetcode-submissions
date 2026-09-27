class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for(char task : tasks) {
            freq[task - 'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int f: freq){
            if(f > 0){
                pq.offer(f);
            }
        }
        Queue<int[]> q = new LinkedList<>();

        int time = 0;

        while(!pq.isEmpty() || !q.isEmpty()){
            time++;

            if(!q.isEmpty() && q.peek()[1] == time){
                pq.offer(q.poll()[0]);
            }
            if(!pq.isEmpty()){
                int rem = pq.poll();
                rem--;

                if(rem > 0){
                    q.offer(new int[] { rem,time + n + 1});
                }
            }
        }
        return time;

        
    }
}
