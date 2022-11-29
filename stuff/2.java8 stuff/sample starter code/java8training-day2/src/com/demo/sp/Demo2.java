package com.demo.sp;

import java.util.*;
import java.util.Spliterator;

public class Demo2 {
	
	public static void main(String[] args) {
		Set<String> list = new TreeSet<>();

        Spliterator<String> s = list.spliterator();

        if (s.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }
        if (s.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }
        if (s.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }
        if (s.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (s.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }
        if (s.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }
        if (s.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }
        if (s.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }
    }
	}


