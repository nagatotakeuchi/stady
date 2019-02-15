package mystady;

public class Manager {

	String name;
	DataBase dataBase;



	public Manager() {
		dataBase = new DataBase();
	}

//add
	public void addFileData(FileData data) {
		dataBase.addFileData(data);
	}
	public void addRecord(String fileDataName, Record record) {
		if(!dataBase.addRecord(fileDataName, record)) System.out.println("指定のファイルデータが存在しませんでした。");
	}

//remove
	public void removeFileData(String fileDataName) {
		if(!dataBase.removeFileData(fileDataName)) System.out.println("指定のファイルデータが存在しませんでした。");
	}
	public void removeFileData(FileData data) {
		if(!dataBase.removeFileData(data)) System.out.println("指定のファイルデータが存在しませんでした。");
	}

//set
	public void setRecord() {}
//Tableを使うために二次元配列での同期が楽そう。もしくは、マネージャークラスに
	//テーブル名と縦横の位置を知らせて更新させるメソッドを作る。
	//
	//データのサイズを確認する必要性が出る可能性がある。

}
