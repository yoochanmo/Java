package com.lec.ex17_access.constructor.pkg2;

import com.lec.ex17_access.constructor.pkg1.A;

public class C {
	A a1 = new A(false); //public
	// A a2 = new A(1.0); //protected (x)
	// A a3 = new A(1); //default (x)
	// A a4 = new A("1"); //private (x)
}
