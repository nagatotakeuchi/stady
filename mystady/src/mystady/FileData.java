package mystady;

import java.util.List;

public class FileData {
	private String fileDataName;
	private String path;
	private List<Record> recordList;

	public FileData(List<Record> recordList, String path) {
		this.recordList = recordList;
		this.path = path;
		setName(path);
	}

	private void setName(String path) {
		int beginIndex = path.lastIndexOf('/');
		int endIndex = path.lastIndexOf('.');
		this.fileDataName = path.substring(beginIndex+1, endIndex);
	}

//add
	public void addRecord(Record record) {
		recordList.add(record);
	}
	public boolean addRecord(String fileDataName, Record record) {
		if(fileDataName.equals(this.fileDataName)) {
			recordList.add(record);
			return true;
		}else {
			return false;
		}
	}













	public String getFileDataName() {
		return this.fileDataName;
	}




	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		recordList.forEach(n -> sb.append(n + "\n"));
		return sb.toString();
	}
}
