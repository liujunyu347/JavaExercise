package com.flexon.apple;

import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] input = new int[]{3, 4, 4, 5, 4, 3, 3, 1, 3, 2, 2};
        SortByFrequency sort = new SortByFrequency();
        System.out.println(Arrays.toString(sort.sortByFrequency(input)));
    }

    public int[] sortByFrequency(int[] array){
        List<Integer> res = new ArrayList<>();
        int[] count = new int[array.length];
        for (int num : array){
            count[num]++;
        }
        PriorityQueue<CountNum> pq = new PriorityQueue<CountNum>(16, new Comparator<CountNum>() {
            @Override
            public int compare(CountNum o1, CountNum o2) {
                if (o1.count == o2.count){
                    return 0;
                }
                return o1.count > o2.count ? -1 : 1;
            }
        });
        for (int i = 0; i < count.length; i++){
            pq.offer(new CountNum(count[i], i));
        }
        while(!pq.isEmpty()){
            CountNum cur = pq.poll();
            while(cur.count != 0){
                res.add(cur.num);
                cur.count--;
            }
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}

class CountNum{
    int count;
    int num;

    public CountNum(int count, int num){
        this.count = count;
        this.num = num;
    }
}
