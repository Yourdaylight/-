package BasicPractice;

import java.util.Arrays;
import java.util.Scanner;
public class ʮ������ת�˽��� {
	public static void main(String[] args) {
		// �������� n
		Scanner scanner = new Scanner(System.in);
		String input_n = scanner.nextLine();
		int n = Integer.parseInt(input_n);

		// ��������ʮ�����������ַ���
		String[] input_nums = new String[n];
		for (int i = 0; i < n; i++) {
			input_nums[i] = scanner.nextLine();
		}
		scanner.close();
		// ʮ�����Ʊ�
		String[] HEXs = { 
			"0", "1", "2", "3", "4", "5", "6", "7", 
			"8", "9", "A", "B", "C", "D", "E", "F"
		};
		// �����Ʊ�
		String[] BINs = { 
			"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
			"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" 
		};
		// �˽��Ʊ�
		String[] OCTs = { 
			"0", "1", "2", "3", "4", "5", "6", "7"
		};
		
		// ʮ�����Ʊ�Ͷ����Ʊ������г�Ա��ֵһһ��Ӧ
		// ʮ�����Ʊ������Ʊ�Ͱ˽��Ʊ���ǰ��λ��Ա��ֵһһ��Ӧ

		for (int m = 0; m < n; m++) { // ����ÿ��ʮ����������
			String hex = input_nums[m]; // ʮ�����Ʊ�ʾ��ʽ
			StringBuffer sbBin = new StringBuffer();
			StringBuffer sbOct = new StringBuffer();

			// ʮ������ת������
			// ��ʮ��������ÿһλת������λ�Ķ���������
			for (int i = 0; i < hex.length(); i++) { // ����ÿ��ʮ������λ
				String c = Character.toString(hex.charAt(i));
				// ��ѯ��ǰλ�ַ��� HEXs�е��±�
				int index = Arrays.binarySearch(HEXs, c);
				sbBin.append(BINs[index]);
			}

			// �ڶ�������ǰ��������ɸ�"0"��ʹ�ö�������λ��Ϊ 3 �ı���
			while (sbBin.length() % 3 != 0) {
				sbBin.insert(0, "0");
			}
			int octLen = sbBin.length() / 3; // ����Ŀ��˽������ĳ���
			// ÿ��ȡ��λ����������ת���ɶ�Ӧ�İ˽���
			for (int i = 0; i < octLen; i++) {
				String span = sbBin.substring(3 * i, 3 * i + 3);
				int index = Arrays.binarySearch(BINs, "0" + span);
				sbOct.append(OCTs[index]);
			}

			// ��ʱ�Ѿ��õ��������Ҫȥ��ǰ�� 0
			while (sbOct.charAt(0) == '0') {
				sbOct.delete(0, 1);
			}

			System.out.println(sbOct.toString());
		}
	}


}
