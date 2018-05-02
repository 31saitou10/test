package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.MyPageDTO;

public class MyPageDTOTest {



	//漢字
		@Test
		public void testGetFamilyName1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//半角英字
		@Test
		public void testGetFamilyName2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//全角英字
		@Test
		public void testGetFamilyName3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//半角数字
		@Test
		public void testGetFamilyName4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//全角数字
		@Test
		public void testGetFamilyName5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//ひらがな
		@Test
		public void testGetFamilyName6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//特殊記号
		@Test
		public void testGetFamilyName7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//半角カタカナ
		@Test
		public void testGetFamilyName8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//全角カタカナ
		@Test
		public void testGetFamilyName9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetFamilyName10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetFamilyName11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//null
		@Test
		public void testGetFamilyName12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		//空文字
		@Test
		public void testGetFamilyName13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}

		@Test
		public void testSetFamilyName13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFamilyName(expected);
			assertEquals(expected, dto.getFamilyName());
		}




		//漢字
		@Test
		public void testGetFamilyNameKana1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//半角英字
		@Test
		public void testGetFamilyNameKana2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//全角英字
		@Test
		public void testGetFamilyNameKana3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//半角数字
		@Test
		public void testGetFamilyNameKana4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//全角数字
		@Test
		public void testGetFamilyNameKana5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//ひらがな
		@Test
		public void testGetFamilyNameKana6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//特殊記号
		@Test
		public void testGetFamilyNameKana7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//半角カタカナ
		@Test
		public void testGetFamilyNameKana8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//全角カタカナ
		@Test
		public void testGetFamilyNameKana9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetFamilyNameKana10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetFamilyNameKana11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//null
		@Test
		public void testGetFamilyNameKana12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		//空文字
		@Test
		public void testGetFamilyNameKana13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}

		@Test
		public void testSetFamilyNameKana13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFamilyNameKana(expected);
			assertEquals(expected, dto.getFamilyNameKana());
		}


	//漢字
		@Test
		public void testGetFirstName1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//半角英字
		@Test
		public void testGetFirstName2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//全角英字
		@Test
		public void testGetFirstName3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//半角数字
		@Test
		public void testGetFirstName4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//全角数字
		@Test
		public void testGetFirstName5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//ひらがな
		@Test
		public void testGetFirstName6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//特殊記号
		@Test
		public void testGetFirstName7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//半角カタカナ
		@Test
		public void testGetFirstName8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//全角カタカナ
		@Test
		public void testGetFirstName9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetFirstName10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetFirstName11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//null
		@Test
		public void testGetFirstName12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		//空文字
		@Test
		public void testGetFirstName13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}

		@Test
		public void testSetFirstName13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFirstName(expected);
			assertEquals(expected, dto.getFirstName());
		}







	//漢字
		@Test
		public void testGetFirstNameKana1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana1(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "漢字";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//半角英字
		@Test
		public void testGetFirstNameKana2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana2(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "abcde";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//全角英字
		@Test
		public void testGetFirstNameKana3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana3(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//半角数字
		@Test
		public void testGetFirstNameKana4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana4(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "12345";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//全角数字
		@Test
		public void testGetFirstNameKana5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana5(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "１２３４５";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//ひらがな
		@Test
		public void testGetFirstNameKana6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana6(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいうえお";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//特殊記号
		@Test
		public void testGetFirstNameKana7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana7(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//半角カタカナ
		@Test
		public void testGetFirstNameKana8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana8(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//全角カタカナ
		@Test
		public void testGetFirstNameKana9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana9(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "カタカナ";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetFirstNameKana10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana10(){
			MyPageDTO dto = new MyPageDTO();
			String expected = " ¥n　";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetFirstNameKana11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana11(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//null
		@Test
		public void testGetFirstNameKana12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana12(){
			MyPageDTO dto = new MyPageDTO();
			String expected = null;
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		//空文字
		@Test
		public void testGetFirstNameKana13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}

		@Test
		public void testSetFirstNameKana13(){
			MyPageDTO dto = new MyPageDTO();
			String expected = "";
			dto.setFirstNameKana(expected);
			assertEquals(expected, dto.getFirstNameKana());
		}





	//漢字
	@Test
	public void testGetSex1(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "漢字";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex1(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "漢字";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//半角英字
	@Test
	public void testGetSex2(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "abcde";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex2(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "abcde";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//全角英字
	@Test
	public void testGetSex3(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex3(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//半角数字
	@Test
	public void testGetSex4(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "12345";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex4(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "12345";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//全角数字
	@Test
	public void testGetSex5(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "１２３４５";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex5(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "１２３４５";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//ひらがな
	@Test
	public void testGetSex6(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいうえお";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex6(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいうえお";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//特殊記号
	@Test
	public void testGetSex7(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex7(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//半角カタカナ
	@Test
	public void testGetSex8(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex8(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//全角カタカナ
	@Test
	public void testGetSex9(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "カタカナ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex9(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "カタカナ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetSex10(){
		MyPageDTO dto = new MyPageDTO();
		String expected = " ¥n　";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex10(){
		MyPageDTO dto = new MyPageDTO();
		String expected = " ¥n　";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetSex11(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex11(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//null
	@Test
	public void testGetSex12(){
		MyPageDTO dto = new MyPageDTO();
		String expected = null;
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex12(){
		MyPageDTO dto = new MyPageDTO();
		String expected = null;
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	//空文字
	@Test
	public void testGetSex13(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex13(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}








	//漢字
	@Test
	public void testGetEmail1(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "漢字";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail1(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "漢字";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//半角英字
	@Test
	public void testGetEmail2(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "abcde";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail2(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "abcde";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//全角英字
	@Test
	public void testGetEmail3(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail3(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//半角数字
	@Test
	public void testGetEmail4(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "12345";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail4(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "12345";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//全角数字
	@Test
	public void testGetEmail5(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "１２３４５";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail5(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "１２３４５";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//ひらがな
	@Test
	public void testGetEmail6(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいうえお";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail6(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいうえお";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//特殊記号
	@Test
	public void testGetEmail7(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail7(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//半角カタカナ
	@Test
	public void testGetEmail8(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail8(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//全角カタカナ
	@Test
	public void testGetEmail9(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "カタカナ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail9(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "カタカナ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetEmail10(){
		MyPageDTO dto = new MyPageDTO();
		String expected = " ¥n　";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail10(){
		MyPageDTO dto = new MyPageDTO();
		String expected = " ¥n　";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetEmail11(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail11(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//null
	@Test
	public void testGetEmail12(){
		MyPageDTO dto = new MyPageDTO();
		String expected = null;
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail12(){
		MyPageDTO dto = new MyPageDTO();
		String expected = null;
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	//空文字
	@Test
	public void testGetEmail13(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail13(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}








	//漢字
	@Test
	public void testGetUserId1(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "漢字";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId1(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "漢字";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//半角英字
	@Test
	public void testGetUserId2(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "abcde";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId2(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "abcde";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//全角英字
	@Test
	public void testGetUserId3(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId3(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//半角数字
	@Test
	public void testGetUserId4(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "12345";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId4(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "12345";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//全角数字
	@Test
	public void testGetUserId5(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "１２３４５";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId5(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "１２３４５";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//ひらがな
	@Test
	public void testGetUserId6(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいうえお";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId6(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいうえお";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//特殊記号
	@Test
	public void testGetUserId7(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId7(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//半角カタカナ
	@Test
	public void testGetUserId8(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId8(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//全角カタカナ
	@Test
	public void testGetUserId9(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "カタカナ";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId9(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "カタカナ";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetUserId10(){
		MyPageDTO dto = new MyPageDTO();
		String expected = " ¥n　";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId10(){
		MyPageDTO dto = new MyPageDTO();
		String expected = " ¥n　";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetUserId11(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId11(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//null
	@Test
	public void testGetUserId12(){
		MyPageDTO dto = new MyPageDTO();
		String expected = null;
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId12(){
		MyPageDTO dto = new MyPageDTO();
		String expected = null;
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	//空文字
	@Test
	public void testGetUserId13(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testSetUserId13(){
		MyPageDTO dto = new MyPageDTO();
		String expected = "";
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}






//漢字
@Test
public void testGetPassword1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "漢字";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword1(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "漢字";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//半角英字
@Test
public void testGetPassword2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abcde";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword2(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "abcde";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//全角英字
@Test
public void testGetPassword3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "ｄｆｇｈｊ";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword3(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "ｄｆｇｈｊ";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//半角数字
@Test
public void testGetPassword4(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "12345";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword4(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "12345";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//全角数字
@Test
public void testGetPassword5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "１２３４５";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword5(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "１２３４５";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//ひらがな
@Test
public void testGetPassword6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいうえお";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword6(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あいうえお";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//特殊記号
@Test
public void testGetPassword7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword7(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//半角カタカナ
@Test
public void testGetPassword8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "ｶﾀｶﾅ";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword8(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "ｶﾀｶﾅ";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//全角カタカナ
@Test
public void testGetPassword9(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "カタカナ";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword9(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "カタカナ";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//半角スペース,全角スペース,改行
@Test
public void testGetPassword10(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ¥n　";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword10(){
	MyPageDTO dto = new MyPageDTO();
	String expected = " ¥n　";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
@Test
public void testGetPassword11(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あ漢ア１ｆｱ1f";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword11(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "あ漢ア１ｆｱ1f";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//null
@Test
public void testGetPassword12(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword12(){
	MyPageDTO dto = new MyPageDTO();
	String expected = null;
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

//空文字
@Test
public void testGetPassword13(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}

@Test
public void testSetPassword13(){
	MyPageDTO dto = new MyPageDTO();
	String expected = "";
	dto.setPassword(expected);
	assertEquals(expected, dto.getPassword());
}
}

