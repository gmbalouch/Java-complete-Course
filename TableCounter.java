class TableCounter{

	public static void main(String[] args) {
		int table_no=Integer.parseInt(args[0]);
		int counter_no=Integer.parseInt(args[1]);
		
		for(int i=1; i<=counter_no; i++) {
			System.out.println(table_no+" x "+ i +" = "+table_no*i  );
		}
	}
}