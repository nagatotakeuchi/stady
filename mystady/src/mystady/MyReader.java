package mystady;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MyReader {

	BufferedReader reader;
	String filePath;

	public MyReader(String filePath) throws FileNotFoundException{
		this.filePath = filePath;
		reader = new BufferedReader(new FileReader(filePath));
	}



	public FileData readFileData() throws IOException{
		List<Record> recordList = new ArrayList<>();
		Record r = null;
		while((r =readRecord()) != null) {
			recordList.add(r);
		}
		reader.close();
		return new FileData(recordList, filePath);
	}

	private Record readRecord() throws IOException{
		String line;
		line = reader.readLine();
		if(line == null) {
			return null;
		}
		return new Record(line.split(" ",0));
	}



}
