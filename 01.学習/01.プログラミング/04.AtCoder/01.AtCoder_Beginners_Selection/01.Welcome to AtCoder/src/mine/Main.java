package mine;

import java.util.Scanner;

//問題「https://atcoder.jp/contests/abs/tasks/practice_1」
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//手順
		//1.キーボードから数字の入力値を受け取る(3回)
		//2.キーボードから文字の入力値を受け取る(1回)
		//3.1の入力値を足す
		//4.3の値を出力する
		//5.2の文字を出力する

		//キーボードから入力された値を取得
		Scanner scanner = new Scanner(System.in);

		//キーボードから取得した数値を格納する配列を定時
		int[] inputInt =  new int[3];

		//合計を格納する変数
		int sum = 0;

		//キーボードから入力された数値を格納
		for(int i=0;i<3;i++) {
			System.out.println(i+1 + "つめの数値を入力して下さい。");
			inputInt[i] = scanner.nextInt();
		}

		//入力された数値を合計
		for(int j:inputInt) {
			sum = sum + j;
		}

		//キーボードから入力された数値を格納
		System.out.println("文字を入力して下さい。");
		String inputString = scanner.next();

		//出力
		System.out.println(sum + " " + inputString);
	}

}
