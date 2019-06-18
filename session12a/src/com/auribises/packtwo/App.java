package com.auribises.packtwo;
import com.auribises.packone.One;// import is used to access a class in some other packge
//import com.auribises.packone.Two; : Error : default class cannot be imported

//Package level Inheritance

class Three extends One{
	void show() {
		protShow();//indirectly
		//defShow(); err
		//pvtShow(); err
		
	}
}
public class App {

	public static void main(String[] args) {
		
		
		One oRef = new One();
		
		//oRef.pvtShow(); : Not Accessible error
		//oRef.defShow(); : err
		//oRef.protShow();: err
//		oRef.pubShow(); : ok
		
		
		Three tRef = new Three();
		tRef.pubShow();
//		tRef.protShow(); error directly not accesible

	}

}

//default 		: is accessible only within the package
//protected 	: is accessible only within the package. 
//				  protected is accessible by the child after inheritance relationship outside the package
//public  		: is accessible within the package and outside the package also

//1. private 
//2. default
//3. protected
//4. public
