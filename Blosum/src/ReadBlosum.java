import java.io.*;
import java.util.*;

public class ReadBlosum {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> a = readFile("Blosum62.txt");
		System.out.println(getMap(a));
	}

	public static ArrayList<String> readFile(String path) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			FileInputStream fstream = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				lines.add(strLine);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lines;
	}

	public static Map<String, Map<String, Integer>> getMap(ArrayList<String> a) {
		String letterMap = a.get(6);
		String[] temp1 = letterMap.split(" +");
		ArrayList<String> letterList = new ArrayList<String>();
		for (int i = 1; i < temp1.length; i++) {
			letterList.add(temp1[i]);
		}
		Map<String, Map<String, Integer>> map = new LinkedHashMap<String, Map<String, Integer>>();
		for (int m = 7; m < a.size(); m++) {
			String smallMap = a.get(m);
			String[] temp2 = smallMap.split(" +");
			String key1 = smallMap.substring(0, 1);
			Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
			for (int i = 0; i < temp2.length - 1; i++) {
				String key2 = letterList.get(i);
				int value = Integer.parseInt(temp2[i + 1]);
				map2.put(key2, value);
			}
			map.put(key1, map2);
		}
		return map;
	}
}
