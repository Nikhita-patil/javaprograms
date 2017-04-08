package dataStructure;

public class BubbleSort {
	
	static String[] bubbleSortInt(String t1[]) {
		String tempStr = "";
		  for (int t = 0; t < t1.length - 1; t++) {
	            for (int i= 0; i < t1.length - t -1; i++) {
	                if(t1[i+1].compareTo(t1[i])<0) {
	                    tempStr = t1[i];
	                    t1[i] = t1[i + 1];
	                    t1[i + 1] = tempStr;
	                }
	            }
	        }
		return t1;
	}
	public static void main(String[] args) {
		String s1[] = {"Nikita","Chaitra","Miral","Modi"};
		s1 = bubbleSortInt(s1);
		for(String s2 : s1)
			System.out.println(s2);
	}

}
