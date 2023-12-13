package com.udemy.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
//		System.out.println(binarySearchImpl.binarySearch(new int[] {12, 3, 5}, 3));

		ApplicationContext applicationContext = SpringApplication.run(PracticeApplication.class,
				args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl.binarySearch(new int[] {12, 3, 5}, 3));
		
	}

}
