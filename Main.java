import java.util.*;
class Main{
	
	public static void main(String... args){
		
		ArrayList<String> a = new ArrayList<>();
		int i = 1;
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		a.add("Kashif "+(i++));
		String [] ak= new String [19];
		ak = a.toArray(ak);
		HashSet<Integer> b = new HashSet();
		b.add(55);
		b.add(65);
		b.add(81);
		b.add(44);
		b.add(38);
		b.add(54);
		b.add(64);
		ArrayList kk = new ArrayList();
		kk.add(38);
		kk.add(54);
		kk.add(5);
		// a.forEach((Object k)->System.out.println(k));
		// System.out.println(Arrays.toString(ak));
		System.out.println(a);
		System.out.println(a.add("Kashif 2"));
		System.out.println(b);
		
		// b.removeIf(k->(k%2==0));
		b.retainAll(kk);
		System.out.println(b);
		
	}
}
