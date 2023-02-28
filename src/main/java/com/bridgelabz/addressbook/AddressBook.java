package com.bridgelabz.addressbook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

public class AddressBook  {
	public void writeAddressBook() throws IOException {

		FileWriter outputfile = new FileWriter(
				"D:\\BridgelabzClassWork\\Assignment-243\\Day28-Addressbook-JSON\\write.csv");

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// create a List which contains String array
		ArrayList<String[]> addrsBook = new ArrayList<String[]>();
		addrsBook.add(new String[] { "FirstName", "LastName", "City", "State", "Zip", "Email" });
		addrsBook.add(new String[] { "Bhuwan", "Arya", "haldwani", "uttarkhand", "263126", "aryabhuwan873@gmail.com" });
		addrsBook.add(new String[] { "akshay", "kumar", "Banglore", "bijnaur", "235256", "akshy@gmail.com" });
		addrsBook.add(new String[] { "Amit", "badhana", "Paris", "Bihar", "283122", "Amit@gmail" });
		writer.writeAll(addrsBook);

		writer.writeAll(addrsBook);

//	         // closing writer connection
		writer.close();

	}

	public void readAddressBook() throws IOException, Exception {

		FileReader filereader = new FileReader(
				"D:\\BridgelabzClassWork\\Assignment-243\\Day28-Addressbook-JSON\\read.csv");

		// create csvReader object and skip first Line
		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		List<String[]> allData = csvReader.readAll();

		// print Data
		for (String[] row : allData) {
			for (String cell : row) {
				System.out.print(cell + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		AddressBook obj = new AddressBook();
		obj.writeAddressBook();
		obj.readAddressBook();

	}
}

	
   