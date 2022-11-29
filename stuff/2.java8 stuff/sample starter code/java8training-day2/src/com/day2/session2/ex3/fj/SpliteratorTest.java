package com.day2.session2.ex3.fj;

import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class SpliteratorTest {

   public static void main(String[] args) {
      Random random = new Random(100);
      int[] array = IntStream.rangeClosed(1, 1_000_000).toArray();
      int max = StreamSupport.stream(new FindMaxSpliterator(array, 0, array.length - 1), true)	  
     .reduce(0, Integer::max, Integer::max);
      System.out.println(max);
   }

   private static class FindMaxSpliterator implements Spliterator<Integer> {
      int start, end;
      int[] arr;

      public FindMaxSpliterator(int[] arr, int start, int end) {
          this.arr = arr;
          this.start = start;
          this.end = end;
      }

      @Override
      public boolean tryAdvance(Consumer<? super Integer> action) {
          if (start <= end) {
              action.accept(arr[start]);
              start++;
              return true;
          }
          return false;
      }

      @Override
      public Spliterator<Integer> trySplit() {
          if (end - start < 1000) {
              return null;
          }

          int mid = (start + end) / 2;
          int oldstart = start;
          start = mid + 1;
          return new FindMaxSpliterator(arr, oldstart, mid);
      }

      @Override
      public long estimateSize() {
          return end - start;
      }

      @Override
      public int characteristics() {
          return ORDERED | SIZED | IMMUTABLE | SUBSIZED;
      }
   }
}