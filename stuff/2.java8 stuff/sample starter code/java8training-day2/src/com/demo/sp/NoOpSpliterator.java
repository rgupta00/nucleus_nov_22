package com.demo.sp;

import java.util.Spliterator;
import java.util.function.Consumer;

public class NoOpSpliterator implements Spliterator<String> {

	Spliterator<String> spliterator;
	
	public NoOpSpliterator(Spliterator<String> spliterator){
		this.spliterator=spliterator;
	}
	@Override
	public boolean tryAdvance(Consumer<? super String> action) {
		boolean hasMore=this.spliterator.tryAdvance(t-> {
			action.accept(t);
		});
		return hasMore;
	}

	@Override
	public Spliterator<String> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return this.spliterator.estimateSize();
	}

	@Override
	public int characteristics() {
		return this.spliterator.characteristics();
	}

}
