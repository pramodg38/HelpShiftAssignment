package com.helpshif.assignment.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * This class handles the key value functionality.
 * 
 * @author pramodg
 *
 */
public class KeyValueDataStructure {

	private Data data;
	private List<Data> dataList;

	/**
	 * instantiating new object of this DS.
	 */
	public KeyValueDataStructure() {
		this.dataList = new ArrayList<Data>();
	}

	/**
	 * inner class to hold the data item for this DS.
	 * 
	 * @author pramodg
	 *
	 */
	private class Data {
		private Integer key;
		private String value;

		/**
		 * initializes data instance with key value.
		 * 
		 * @param {@link Integer} - key of the data item
		 * @param {@link String} - value of the data item
		 */
		Data(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	/**
	 * inserts the new element into this key value data structure.
	 * 
	 * @param {@link Integer} - key of the data item
	 * @param {@link String} - value of the data item
	 */
	public void insert(Integer key, String value) {
		this.data = new Data(key, value);
		// check for the same key before adding
		for (int i = 0; i < dataList.size(); i++) {
			Data tempData = dataList.get(i);
			if (tempData.key.equals(key)) {
				// remove the existing object
				dataList.remove(i);
				break;
			}
		}
		dataList.add(data);
	}

	/**
	 * fetching the value based on key provided.
	 * 
	 * @param {@link Integer} - key of the data item
	 * @return {@link String} - value of the key, returns null if not found.
	 */
	public String retrive(Integer key) {
		for (int i = 0; i < this.dataList.size(); i++) {
			Data data = dataList.get(i);
			if (key.equals(data.key)) {
				return data.value;
			}

		}
		return null;
	}

	/**
	 * displaying the state of the this DS in key-value form.
	 */
	public void displayDSState() {
		for (int i = 0; i < this.dataList.size(); i++) {
			Data data = dataList.get(i);
			System.out.println("<" + data.key + " " + data.value + ">");
		}
	}

}
