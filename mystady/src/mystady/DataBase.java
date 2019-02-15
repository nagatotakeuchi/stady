package mystady;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private List<FileData> fileDataList;

	public DataBase() {
		fileDataList = new ArrayList<>();
	}



//add
	public void addFileData(FileData data) {
		fileDataList.add(data);
	}
	public boolean addRecord(String fileDataName, Record record) {
		for(FileData f : fileDataList) {
			if(f.addRecord(fileDataName, record));
			return true;
		}
		return false;
	}


//remove
	public boolean removeFileData(String fileDataName) {
		for(FileData f : fileDataList) {
			if(f.removeFileData(fileDataName)) return fileDataList.remove(f);
		}
		return false;
	}
	public boolean removeFileData(FileData data) {
		for(FileData f : fileDataList) {
			if(f.removeFileData(data)) return fileDataList.remove(data);
		}
		return false;
	}











	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		fileDataList.forEach(n -> sb.append(n));
		return sb.toString();
	}





}
