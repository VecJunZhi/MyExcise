import java.util.ArrayList;
import java.util.List;


public class Hand_Num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	outNum(16);
	

	}
	public static void outNum(int i){
		int ii=i%8;
		
		List<String> list = new ArrayList<String>();
		list.add("1Ĵָ");
		list.add("2ʳָ");
		list.add("3��ָ");
		list.add("4����ָ");
		list.add("5Сָ");
		list.add("4����ָ");
		list.add("3��ָ");
		list.add("2ʳָ");
		if(ii==0){
		System.out.println(list.get(1));
		}else{
		System.out.println(list.get(ii-1));
		System.out.println("hello");
		}
		
		
	} 

}
