package ManyToOne;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import com.google.common.collect.HashMultimap;


public class testCase {

	@Test
	public void test() {
	/*
	HashMultimap<String, Object> TargAndSrcs = HashMultimap.create();
    System.out.print("Enter String:");
	Scanner in = new Scanner(System.in);
	Scanner test = new Scanner(in.nextLine());
	String tero = test.next();
	if(test.hasNextInt()){
		TargAndSrcs.put(tero, test.nextInt());
	}
	else if (test.hasNextDouble()) {
		TargAndSrcs.put(tero, test.nextDouble());
	}
	else if (test.hasNextBoolean()) {
		TargAndSrcs.put(tero, test.nextBoolean());
	}
	else  {
		TargAndSrcs.put(tero, test.next());
	}
	System.out.println(TargAndSrcs.entries());
	*/
	MtOCollection mto = new MtOCollection();
	MtOCollection mto1 = new MtOCollection();
	mto.connect(25, "Test");
	mto1.connect(25, "Test");
	mto.connect(26, "Test");
	mto1.connect(26, "Test");
	System.out.println(mto.equals(mto1));
	MtOCollection mto2 = new MtOCollection();
	MtOCollection mto3 = new MtOCollection();
	mto2.connect(25, "Test");
	mto2.connect(26, "Test");
	mto3.connect(25, "Test");
	System.out.println(mto2.equals(mto3));
	}

}
