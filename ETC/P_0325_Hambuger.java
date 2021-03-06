package PRACTICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_0325_Hambuger {

	/*
	 * 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의
	 * 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
	 * 
	 * 햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
	 * 
	 * 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다. 넷째 줄에는 콜라의 가격,
	 * 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.
	 * 
	 */

	public static void main(String args[]) throws IOException {//버퍼 연습 
		int mostLow = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int burger = 2001;
		int drink = 2001; //초기화 해주기 

		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"번째 버거입력(총3가지):");
			int value = Integer.parseInt(br.readLine());
			if (value < burger) {	// 최솟값 찾기
				burger = value;
			}
		}
 
		// 음료
		for (int i = 0; i < 2; i++) {
			System.out.println(i+1+"번째 음료입력(총2가지):");
			int value = Integer.parseInt(br.readLine());
			if (value < drink) {	// 최솟값 찾기
				drink = value;
			}
		}
		
		mostLow = burger + drink - 50;
		
		System.out.println(mostLow);
	}
		
		
	}
