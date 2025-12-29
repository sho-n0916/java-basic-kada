package text.section_14;

public class MethodPlus_2 {
	public static void main(String[] args) {
		
		final int postage1 = 500;
		final int postage2 = 800;
		
		//1000円を送料1を加算して表示
		addPostage(1000, postage1);
				
		//1200円を送料2を加算して表示
		addPostage(1000, postage2);
		
	}
	public static void addPostage (final int price, final int postage) {
		int total = price + postage; //価格に料金を加算
		System.out.println("送料込みの料金は" + total + "円");
		
	

}
}