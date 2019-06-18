package com.auribises.packone;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One oRef = new One();
		Two tRef = new Two();
		
//		oRef.pvtShow();: not accessible error
		oRef.defShow();
		oRef.pubShow();
		oRef.protShow();
		
		System.out.println();
//		oRef.pvtShow();: not accessible error
		oRef.defShow();
		oRef.pubShow();
		oRef.protShow();
		
		
	}

}
// Rule: In 1 source file we can have only 1 public class
//private : which is not accessible outside class/object