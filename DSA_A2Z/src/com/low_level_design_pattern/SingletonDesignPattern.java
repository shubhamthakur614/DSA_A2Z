package com.low_level_design_pattern;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * - The singleton design pattern say that the class can have only one single instance.if we try to create another
 * instance of the same class you we get the same old instance of that class
 *  - in Simple word a class can be instanciated only once.
 *  -In singleton design pattern we have to create the private constructor so that its not availble for
 *  client or other member to instantialte the new object for the class .
 *  -By making constructor private so that client can not call it again and again and instantiate the object.
 * 
 * -ExecutorService is an interface which allow us to execute our application in multithreded environment
 */
public class SingletonDesignPattern {

	public static void main(String[] args) {
//		TvSet tvSet = TvSet.getTvSetInstance();
//		TvSet tvSet1 = TvSet.getTvSetInstance();
//		System.out.println(tvSet.hashCode());
//		System.out.println(tvSet1.hashCode());
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> TvSet.getTvSetInstance());
		executorService.execute(() -> TvSet.getTvSetInstance());
		executorService.execute(() -> TvSet.getTvSetInstance());
		executorService.execute(() -> TvSet.getTvSetInstance());

	}
}
