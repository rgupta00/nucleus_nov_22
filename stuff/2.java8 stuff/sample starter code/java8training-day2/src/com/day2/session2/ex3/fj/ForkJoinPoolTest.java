package com.day2.session2.ex3.fj;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class ForkJoinPoolTest {

	public static void main(String[] args) {
		Random random = new Random(100);//.map(random::nextInt).map(i -> i * i + i)
		int[] array = IntStream.rangeClosed(1, 1_000_000)
				.skip(20).toArray();

		ForkJoinPool pool = new ForkJoinPool();
		Integer max = pool.invoke(new FindMaxTask(array, 0, array.length));
		System.out.println(max);
	}

	static class FindMaxTask extends RecursiveTask<Integer> {

		private int[] array;
		private int start, end;

		public FindMaxTask(int[] array, int start, int end) {
			this.array = array;
			this.start = start;
			this.end = end;
		}

		@Override
		protected Integer compute() {
			if (end - start <= 3000) {
				int max = -99;
				for (int i = start; i < end; i++) {
					max = Integer.max(max, array[i]);
				}
				return max;

			} else {
				int mid = (end - start) / 2 + start;
				FindMaxTask left = new FindMaxTask(array, start, mid);
				FindMaxTask right = new FindMaxTask(array, mid + 1, end);

				ForkJoinTask.invokeAll(right, left);
				int leftRes = left.getRawResult();
				int rightRes = right.getRawResult();

				return Integer.max(leftRes, rightRes);
			}
		} // end of compute

	}
}