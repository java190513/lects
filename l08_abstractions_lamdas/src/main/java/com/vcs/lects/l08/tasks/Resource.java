package com.vcs.lects.l08.tasks;

public class Resource implements DataReader, DataWriter {


	public static void main(String[] args) {
		Resource res = new Resource();
		new Manager().readWrite(res);
		new Reader().read(res);
		new Writer().write(res);
	}


	private String data = "secret data";

	@Override
	public String readData() {
		return data;
	}
	@Override
	public void writeData(String data) {
		this.data = data;
	}

}

interface DataReader {
	String readData();
}

interface DataWriter{
	void writeData(String data);
}

class Manager {
	public void readWrite(Resource data) {
		String secret = data.readData(); // Ok
		data.writeData("new data"); // Ok
	}
}

class Reader {
	public void read(DataReader data) {
		data.readData(); // Ok
//		data.writeData("new data"); // NOT OK
	}
}

class Writer {
	public void write(DataWriter data) {
//		data.readData(); // NOT OK
		data.writeData("new data"); // Ok
	}
}
