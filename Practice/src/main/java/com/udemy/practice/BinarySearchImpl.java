package com.udemy.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	SortAlgorithm sortAlgorithm;

//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int number) {
//		implement sorting logic
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

}
