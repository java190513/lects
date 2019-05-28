package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Jira {

	private int number = 0;

	private List<String> tasks = new ArrayList<>();

	public void sukuriaDefekta() {

		synchronized (tasks) {
			tasks.add("ticket number: " + number++);
		}

	}

	public int kiekDarbuDarLiko() {
		return tasks.size();
	}

	public boolean atsidaroIrSprendzia() {

		synchronized (tasks) {

			if (!tasks.isEmpty()) {

				String myTask = tasks.remove(tasks.size() - 1);

				if (myTask == null || myTask.endsWith("Done")) {
					System.out.println("TO NEGALI BUTI !!! " + myTask);
				}

				myTask += "Done";

				tasks.add(myTask);
				// DO more stuff

				tasks.remove(tasks.size() - 1);
				return true;
			}

		}
		return false;

	}

}
