package core.entities.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {

	/**
	 *Autor: N. Eckert
	 *	FileName beschreibt den Dateipfad+Dateinamen, welche die exportierte CSV Datei erhält
	 *	Delimiter beschreibt das Trennzeichen, mit dem die Datensätze innerhalb der CSV Datei getrennt werden
	 */
	
	private String FileName;
	private String Delimiter;
	
	public CsvWriter(String FileName, String Delimiter) {
		this.FileName = FileName;
		this.Delimiter = Delimiter;
	}
	
	public void writeCsv(String[][] valuesArray) {
		/**
		 *Schreibt die Datensätze, die über das zweidimensionale Array eingelesen werden,
		 *in eine CSV Datei. Der Dateiname wird anhand der "FileName" Variable bestimmt.
		 */
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
			for (int i = 0; i < valuesArray.length; i++) {
				for (int j = 0; j < valuesArray[i].length; j++) {
					writer.write(valuesArray[i][j]+Delimiter);
				}
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
