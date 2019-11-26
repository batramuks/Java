import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface FunInterf{
	public void print();
}

interface ISquare{
	public int square(int a);
}
interface IMultiply{
	public int multiply(int a,int b);
}


public class Demo {

	public static void main(String[] args) {

		/*** Create own Functional Interface****/
		
		FunInterf fi=()->System.out.println("Functional Interface");
		fi.print();
		
		ISquare is=i->i*i;
		System.out.println(is.square(10));
		
		IMultiply im=(a,b)->a*b;
		System.out.println(im.multiply(10,20));
		
		/*** Create Thread using Lamda expression****/
		
		Runnable r=()->{
			for(int i=0;i<10;i++)
				System.out.println("Child Thread");
		};
		new Thread(r).start();
		
		/*** Sort using Lamda expression****/
		
		List<Integer> lst = new ArrayList<Integer> ();
		lst.add(10);
		lst.add(50);
		lst.add(3);
		Comparator <Integer> c=(a,b)->(a<b)?-1:(a>b)?1:0;
		Collections.sort(lst,c);
		System.out.println(lst);
		
		/*** Filter even number using Lamda expression****/
		List l2=lst.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		
	
		/***Function Interface ****/
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println("Using Funtion Interface   "+f.apply(2));
		
				
		/****Predicate Interface ****/
		
		Predicate<Integer> p=i->i%2==0;
		System.out.println("Using Perdicate Interface  "+p.test(100));
			
				
		/**** Using Filter method ***/
		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

		List<String> longnames = names.stream() // converting the list to stream
				.filter(str -> str.length() > 6) // filter the stream to create
				.collect(Collectors.toList()); // collect the final stream and convert it to a List

		System.out.println(longnames);
		
		/**** Using Map method ***/

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> sqrList = num.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(sqrList);
		
		

	}
}
