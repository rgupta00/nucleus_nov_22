package com.demo.sp;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringOpSpliterator implements Spliterator<String> {

	Spliterator<String> spliterator;
	Predicate<String> predicate;
	
	public FilteringOpSpliterator(Spliterator<String> spliterator, Predicate<String> predicate ){
		this.spliterator=spliterator;
		this.predicate=predicate;
	}
	@Override
	public boolean tryAdvance(Consumer<? super String> action) {
		boolean hasMore=this.spliterator.tryAdvance(t-> {
			if(predicate.test(t))
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
