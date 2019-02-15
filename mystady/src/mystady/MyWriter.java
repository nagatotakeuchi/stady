package mystady;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 勉強用に作ったデータ型からテキストファイルへ書き込むクラス
 * @author nagato
 *
 */


public class MyWriter {

	PrintWriter writer;

	private MyWriter(String filePath) throws FileNotFoundException, IOException{
		writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
	}

	public void writeFileData(FileData data) {
		writer.print(data);
		writer.flush();
		writer.close();
	}

	public void writeRecord(Record record) {
		writer.print(record);
		writer.flush();
		writer.close();
	}

	public static MyWriter getMyWriter(String fileName) throws IOException{
		return new MyWriter(fileName);
	}

}
