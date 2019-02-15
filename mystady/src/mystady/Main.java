package mystady;

public class Main {


	public static void main(String[] args) {

		try {
			Manager mg = new Manager();
			FileData data = new MyReader("src/memo.txt").readFileData();
			FileData data2 = new MyReader("src/sellData.txt").readFileData();
			mg.addFileData(data);

			Object[] o = {"a","b","c"};
			Record r = new Record(o);

			mg.addRecord("memo", r);

			mg.removeFileData(data2);

			//System.out.println(mg.dataBase);














		}catch(Exception e) {
			System.out.println(e);
		}
	}




}
