import java.io.*;
import java.util.*;

public class Global_Alignment {
	public static void main(String[] args) {
		Map<String, Map<String, Integer>> map = ReadBlosum
				.getMap(readFile("Blosum62.txt"));
		System.out.println(map);
		String s1 = "THADCDN";
		String s2 = "AWCN";
		printBlosum(map, s1, s2);
		int[][] blo2DArray = getblo2DArray(map, s1, s2);
		for (int r = 0; r < blo2DArray.length; r++) {
			System.out.println(Arrays.toString(blo2DArray[r]));
		}
		System.out.println();
		int[][] alignment = getAlignment(blo2DArray);
		for (int r = 0; r < alignment.length; r++) {
			System.out.println(Arrays.toString(alignment[r]));
		}
		char[][] arrows = getArrows(map, alignment, s1, s2) ;
		for (int r = 0; r < arrows.length; r++) {
			System.out.println(Arrays.toString(arrows[r]));
		}
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

	public static void printBlosum(Map<String, Map<String, Integer>> map,
			String s1, String s2) {
		System.out.print("\n ");
		for (int i = 0; i < s2.length(); i++) {
			System.out.printf("%5S", s2.substring(i, i + 1));
		}
		System.out.println();

		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.substring(i, i + 1));
			for (int j = 0; j < s2.length(); j++) {
				int num = map.get(s1.substring(i, i + 1)).get(
						s2.substring(j, j + 1));
				System.out.printf("%5d", num);
			}
			System.out.println();
		}
	}

	public static int[][] getblo2DArray(Map<String, Map<String, Integer>> map,
			String s1, String s2) {
		int[][] BloNum = new int[8][5];
		for (int r = 0; r < BloNum.length; r++) {
			for (int c = 0; c < BloNum[r].length; c++) {
				if (r == 0) {
					BloNum[r][c] = 0;
				} else if (c == 0) {
					BloNum[r][c] = 0;
				} else {
					int num = map.get(s1.substring(r - 1, r)).get(
							s2.substring(c - 1, c));
					BloNum[r][c] = num;
				}
			}
		}
		return BloNum;
	}

	public static int[][] getAlignment(int[][] blo2DArray) {
		for (int i = 1; i < blo2DArray.length; i++) {
			for (int j = 1; j < blo2DArray[i].length; j++) {
				int matching = blo2DArray[i][j];
				int topLeft = blo2DArray[i - 1][j - 1];
				int newTopLeft = matching + topLeft;
				int left = blo2DArray[i - 1][j] - 4;
				int top = blo2DArray[i][j - 1] - 4;
				int max = Math.max(newTopLeft, Math.max(left, top));
				blo2DArray[i][j] = max;
			}
		}
		return blo2DArray;
	}

	public static char[][] getArrows(Map<String, Map<String, Integer>> map,
			int[][] alignment, String s1, String s2) {
		char[][] tracking = new char[7][4];
		for (int r = alignment.length; r > 1; r--) {
			for (int c = alignment[r].length; c > 1; c--) {
				tracking[r][c] = '-';
//				if (alignment[r][c] == alignment[r - 1][c - 1]
//						+ map.get(s1.substring(r - 1, r)).get(
//								s2.substring(c - 1, c))) {
//					tracking[r][c] = '\\';
//				}
//				if (alignment[r][c] == alignment[r][c-1] - 4) {
//					tracking[r][c] = '-';
//				}
//				else if (alignment[r][c] == alignment[c-1][r] - 4) {
//					tracking[r][c] = '|';
//				}
//				else {
//					tracking[r][c] = '0';
//				}
			}
		}
		return tracking;
	}
}
