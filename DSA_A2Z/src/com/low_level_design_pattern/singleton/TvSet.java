package com.low_level_design_pattern.singleton;

public class TvSet {

	private static volatile TvSet tvSetInstance = null;

	private TvSet() {
		if (tvSetInstance != null) {
			throw new RuntimeException("you are trying to break singleton Pattern!!!!!!!!!!!!!!");
		}
		System.out.println("Instancetiated only once...");
	}

	public static TvSet getTvSetInstance() {
		if (tvSetInstance == null) {
			// optimization so thread dont need to wait for single operation
			synchronized (TvSet.class) {// t1 ,t2
				if (tvSetInstance == null) {// double check
					tvSetInstance = new TvSet();
				}
			}
		}
		return tvSetInstance;
	}

	// t0 -t1
//	  t5 -t1 ,t3
}
