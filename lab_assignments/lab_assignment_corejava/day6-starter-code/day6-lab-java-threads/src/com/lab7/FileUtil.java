package com.lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileUtil {
	public static List<String> readFile(String fileName) {
		List<String> lines = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
}
