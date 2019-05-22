package com.vcs.lects.l08.tasks;

public class Resource {

	private String data = "secret data";

	public String readData() {
		return data;
	}

	public void writeData(String data) {
		this.data = data;
	}

}

class Manager {
	public void readWrite(Resource data) {
		String secret = data.readData(); // Ok
		data.writeData("new data"); // Ok
	}
}

class Reader {
	public void read(Resource data) {
		data.readData(); // Ok
		data.writeData("new data"); // NOT OK
	}
}

class Writer {
	public void write(Resource data) {
		data.readData(); // NOT OK
		data.writeData("new data"); // Ok
	}
}
