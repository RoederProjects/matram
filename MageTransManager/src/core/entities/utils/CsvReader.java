package core.entities.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {

	/**
	 *Autor: N. Eckert
	 *	FileName beschreibt den Dateipfad+Dateinamen der zu importierenden CSV Datei.
	 */
	
	private String FileName;
	
	public CsvReader(String FileName) {
		this.FileName = FileName;
	}
	
	public String[][] readCsv() {
		/**
		 *Liest die Datensätze aus einer CSV Datei ein und gibt sie als Array wieder zurück.
		 *Die einzulesende Datei wird durch die "FileName" Variable bestimmt. 
		 */
		
	    FileReader myFile = null;
	    BufferedReader buff = null;
	    final List<String> lines = new ArrayList<String>();
	 
	    try {
	    	myFile = new FileReader(FileName);
	        buff = new BufferedReader(myFile);
	        String line;
	        while ((line = buff.readLine()) != null) {
	            lines.add(line);
	        }
	    } catch (IOException e) {
	        System.err.println("Error2 :" + e);
	    } finally {
	        try {
	            buff.close();
	            myFile.close();
	        } catch (IOException e) {
	            System.err.println("Error2 :" + e);
	        }
	    }
	 
	    final String[][] valuesArray = new String[lines.size()][];
	    int cnt = 0;
	    for (final String line : lines) {
	        valuesArray[cnt++] = line.split(",");
	    }
	    
	    return valuesArray;	
	}
}
