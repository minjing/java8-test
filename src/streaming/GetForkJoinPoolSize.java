package streaming;

import java.util.concurrent.ForkJoinPool;

public class GetForkJoinPoolSize {

	public static void main(String[] args) {
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool.getParallelism());
	}
}
