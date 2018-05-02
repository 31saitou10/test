package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.CartDTO;

public class CartDTOTest {

	@Test
	public void testGetId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testGetId2() {
		CartDTO dto = new CartDTO();
		int expected =  2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}
	public void testSetId2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	//最小値
		@Test
		public void testGetId3(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		public void testSetId3(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		//最大値以上
		@Test
		public void testGetId4(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		public void testSetId4(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		//最小値以下
		@Test
		public void testGetId5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

		public void testSetId5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}


	@Test
	public void testGetProduct_id1() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetProduct_id1() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testGetProduct_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetProduct_id2(){
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());

	}



	@Test
	public void testGetProduct_name() {
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setProduct_name(expected);
		assertEquals(expected, dto.getProduct_name());
	}


	@Test
	public void testSetProduct_name() {
		CartDTO dto = new CartDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setProduct_name(expected);
		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name_kana1() {
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setProduct_name_kana(expected);
		assertEquals(expected, dto.getProduct_name_kana());
	}

	//半角英字
		@Test
		public void testGetProductNameKana2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//全角英字
		@Test
		public void testGetProductNameKana3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//半角数字
		@Test
		public void testGetProductNameKana4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//全角数字
		@Test
		public void testGetProductNameKana5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//ひらがな
		@Test
		public void testGetProductNameKana6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//特殊記号
		@Test
		public void testGetProductNameKana7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}


		//半角カタカナ
		@Test
		public void testGetProductNameKana8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}
		//全角カタカナ
		@Test
		public void testGetProductNameKana9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetProductNameKana10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetProductNameKana11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//null
		@Test
		public void testGetProductNameKana12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		//空文字
		@Test
		public void testGetProductNameKana13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}

		public void testSetProductNameKana13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setProduct_name_kana(expected);
			assertEquals(expected, dto.getProduct_name_kana());
		}



	@Test
	public void testGetProduct_description1() {
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}


	@Test
	public void testSetProduct_description1() {
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}



	//半角英字
		@Test
		public void testGetProductDescription2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		public void testSetProductDescription2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//全角英字
		@Test
		public void testGetProductDescription3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		public void testSetProductDescription3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//半角数字
		@Test
		public void testGetProductDescription4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		public void testSetProductDescription4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//全角数字
		@Test
		public void testGetProductDescription5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		public void testSetProductDescription5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//ひらがな
		@Test
		public void testGetProductDescription6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		public void testSetProductDescription6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//特殊記号
		@Test
		public void testGetProductDescription7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}
		public void testSetProductDescription7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//半角カタカナ
		@Test
		public void testGetProductDescription8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}
		public void testSetProductDescription8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}
		//全角カタカナ
		@Test
		public void testGetProductDescription9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		public void testSetProductDescription9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetProductDescription10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}
		public void testSetProductDescription10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetProductDescription11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}
		public void testSetProductDescription11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//null
		@Test
		public void testGetProductDescription12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}

		//空文字
		@Test
		public void testGetProductDescription13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}
		public void testSetProductDescription13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setProduct_description(expected);
			assertEquals(expected, dto.getProduct_description());
		}


	@Test
	public void testGetCategory_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setCategory_id(expected);
		assertEquals(expected, dto.getCategory_id());
	}
	@Test
	public void testSetCategory_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setCategory_id(expected);
		assertEquals(expected, dto.getCategory_id());
	}


	public void testGetCategory_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetCategory_id2(){
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());

	}


	public void testGetCategory_id3() {
		CartDTO dto = new CartDTO();
		int expected =  2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}
	public void testSetCategory_id3() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	//最小値
		@Test
		public void testGetCategory_id4(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		public void testSetCategory_id4(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		//最大値以上
		@Test
		public void testGetCategory_id5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		public void testCategory_id5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		//最小値以下
		@Test
		public void testGetCategory_id6(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

		public void testSetId6(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}





	@Test
	public void testGetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	public void testGetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetPrice2(){
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());

	}


	public void testGetPrice3() {
		CartDTO dto = new CartDTO();
		int expected =  2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}
	public void testSetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	//最小値
		@Test
		public void testGetPrice4(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		public void testSetPrice4(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		//最大値以上
		@Test
		public void testGetPrice5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		public void testSetPrice5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		//最小値以下
		@Test
		public void testGetPrice6(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

		public void testSetPrice6(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}


	@Test
	public void testGetStock1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setStock(expected);
		assertEquals(expected, dto.getStock());
	}

	@Test
	public void testSetStock1() {
		CartDTO dto = new CartDTO();
		int expected = 0;
		dto.setStock(expected);
		assertEquals(expected, dto.getStock());
	}

	public void testGetStock2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetStock2(){
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());

	}


	public void testGetStock3() {
		CartDTO dto = new CartDTO();
		int expected =  2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}
	public void testSetStock3() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	//最小値
		@Test
		public void testGetStock4(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		public void testSetStock4(){
			CartDTO dto = new CartDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		//最大値以上
		@Test
		public void testGetStock5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		public void testSetStock5(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		//最小値以下
		@Test
		public void testGetStock6(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

		public void testSetStock6(){
			CartDTO dto = new CartDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

	@Test
	public void testGetImage_file_path() {
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setImage_file_path(expected);
		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path1() {
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setImage_file_path(expected);
		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_name1() {
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setImage_file_path(expected);
		assertEquals(expected, dto.getImage_file_path());
	}

	//半角英字
			@Test
			public void testGetImage_file_name2(){
				CartDTO dto = new CartDTO();
				String expected = "abcde";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			public void testSetImage_file_name2(){
				CartDTO dto = new CartDTO();
				String expected = "abcde";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//全角英字
			@Test
			public void testGetImage_file_name3(){
				CartDTO dto = new CartDTO();
				String expected = "ｄｆｇｈｊ";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			public void testSetImage_file_name3(){
				CartDTO dto = new CartDTO();
				String expected = "ｄｆｇｈｊ";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//半角数字
			@Test
			public void testGetImage_file_name4(){
				CartDTO dto = new CartDTO();
				String expected = "12345";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			public void testSetImage_file_name4(){
				CartDTO dto = new CartDTO();
				String expected = "12345";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//全角数字
			@Test
			public void testGetImage_file_name5(){
				CartDTO dto = new CartDTO();
				String expected = "１２３４５";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			public void testSetImage_file_name5(){
				CartDTO dto = new CartDTO();
				String expected = "１２３４５";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//ひらがな
			@Test
			public void testGetImage_file_name6(){
				CartDTO dto = new CartDTO();
				String expected = "あいうえお";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			public void testSetImage_file_name6(){
				CartDTO dto = new CartDTO();
				String expected = "あいうえお";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//特殊記号
			@Test
			public void testGetImage_file_name7(){
				CartDTO dto = new CartDTO();
				String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}
			public void testSetImage_file_name7(){
				CartDTO dto = new CartDTO();
				String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//半角カタカナ
			@Test
			public void testGetImage_file_name8(){
				CartDTO dto = new CartDTO();
				String expected = "ｶﾀｶﾅ";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}
			public void testSetImage_file_name8(){
				CartDTO dto = new CartDTO();
				String expected = "ｶﾀｶﾅ";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}
			//全角カタカナ
			@Test
			public void testGetImage_file_name9(){
				CartDTO dto = new CartDTO();
				String expected = "カタカナ";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			public void testSetImage_file_name9(){
				CartDTO dto = new CartDTO();
				String expected = "カタカナ";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//半角スペース,全角スペース,改行
			@Test
			public void testGetImage_file_name10(){
				CartDTO dto = new CartDTO();
				String expected = " ¥n　";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}
			public void testSetImage_file_name10(){
				CartDTO dto = new CartDTO();
				String expected = " ¥n　";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
			@Test
			public void testGetImage_file_name11(){
				CartDTO dto = new CartDTO();
				String expected = "あ漢ア１ｆｱ1f";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}
			public void testSetImage_file_name11(){
				CartDTO dto = new CartDTO();
				String expected = "あ漢ア１ｆｱ1f";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//null
			@Test
			public void testGetImage_file_name12(){
				CartDTO dto = new CartDTO();
				String expected = null;
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}

			//空文字
			@Test
			public void testGetImage_file_name13(){
				CartDTO dto = new CartDTO();
				String expected = "";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}
			public void testSetImage_file_name13(){
				CartDTO dto = new CartDTO();
				String expected = "";
				dto.setProduct_description(expected);
				assertEquals(expected, dto.getProduct_description());
			}



	@Test
	public void testGetRelease_date1() {
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setRelease_date(expected);
		assertEquals(expected, dto.getRelease_date());
	}


	@Test
	public void testSetRelease_date1() {
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setRelease_date(expected);
		assertEquals(expected, dto.getRelease_date());
	}


	//半角英字
	@Test
	public void testGetRelease_date2(){
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	public void testSetRelease_date2(){
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//全角英字
	@Test
	public void testGetRelease_date3(){
		CartDTO dto = new CartDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	public void testSetRelease_date3(){
		CartDTO dto = new CartDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//半角数字
	@Test
	public void testGetRelease_date4(){
		CartDTO dto = new CartDTO();
		String expected = "12345";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	public void testSetRelease_date4(){
		CartDTO dto = new CartDTO();
		String expected = "12345";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//全角数字
	@Test
	public void testGetRelease_date5(){
		CartDTO dto = new CartDTO();
		String expected = "１２３４５";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	public void testSetRelease_date5(){
		CartDTO dto = new CartDTO();
		String expected = "１２３４５";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//ひらがな
	@Test
	public void testGetRelease_date6(){
		CartDTO dto = new CartDTO();
		String expected = "あいうえお";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	public void testSetRelease_date6(){
		CartDTO dto = new CartDTO();
		String expected = "あいうえお";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//特殊記号
	@Test
	public void testGetRelease_date7(){
		CartDTO dto = new CartDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}
	public void testSetRelease_date7(){
		CartDTO dto = new CartDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//半角カタカナ
	@Test
	public void testGetRelease_date8(){
		CartDTO dto = new CartDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}
	public void testSetRelease_date8(){
		CartDTO dto = new CartDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}
	//全角カタカナ
	@Test
	public void testGetRelease_date9(){
		CartDTO dto = new CartDTO();
		String expected = "カタカナ";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	public void testSetRelease_date9(){
		CartDTO dto = new CartDTO();
		String expected = "カタカナ";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetRelease_date10(){
		CartDTO dto = new CartDTO();
		String expected = " ¥n　";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}
	public void testSetRelease_date10(){
		CartDTO dto = new CartDTO();
		String expected = " ¥n　";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetRelease_date11(){
		CartDTO dto = new CartDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}
	public void testSetRelease_date11(){
		CartDTO dto = new CartDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//null
	@Test
	public void testGetRelease_date12(){
		CartDTO dto = new CartDTO();
		String expected = null;
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}

	//空文字
	@Test
	public void testGetRelease_date13(){
		CartDTO dto = new CartDTO();
		String expected = "";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}
	public void testSetRelease_date13(){
		CartDTO dto = new CartDTO();
		String expected = "";
		dto.setProduct_description(expected);
		assertEquals(expected, dto.getProduct_description());
	}



	@Test
	public void testGetRelease_company1() {
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setRelease_company(expected);
		assertEquals(expected, dto.getRelease_company());
	}




	public void testSetRelease_company1(){
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setRelease_company(expected);
		assertEquals(expected, dto.getRelease_company());
	}

	//半角英字
		@Test
		public void testGetRelease_company2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//全角英字
		@Test
		public void testGetRelease_company3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());		}

		public void testSetRelease_company3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//半角数字
		@Test
		public void testGetRelease_company4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//全角数字
		@Test
		public void testGetRelease_company5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//ひらがな
		@Test
		public void testGetRelease_company6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//特殊記号
		@Test
		public void testGetRelease_company7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}


		//半角カタカナ
		@Test
		public void testGetRelease_company8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}
		//全角カタカナ
		@Test
		public void testGetRelease_company9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetRelease_company10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetRelease_company11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//null
		@Test
		public void testGetRelease_company12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		//空文字
		@Test
		public void testGetRelease_company13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}

		public void testSetRelease_company13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setRelease_company(expected);
			assertEquals(expected, dto.getRelease_company());
		}




	@Test
	public void testGetRegist_date1() {
		CartDTO dto = new CartDTO();
		String expected = "漢字";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}

	public void testSetRegist_date1(){
		CartDTO dto = new CartDTO();
		String expected = "abcde";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}

	//半角英字
		@Test
		public void testGetRegist_date2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date2(){
			CartDTO dto = new CartDTO();
			String expected = "abcde";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//全角英字
		@Test
		public void testGetRegist_date3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date3(){
			CartDTO dto = new CartDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//半角数字
		@Test
		public void testGetRegist_date4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date4(){
			CartDTO dto = new CartDTO();
			String expected = "12345";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//全角数字
		@Test
		public void testGetRegist_date5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date5(){
			CartDTO dto = new CartDTO();
			String expected = "１２３４５";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//ひらがな
		@Test
		public void testGetRegist_date6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date6(){
			CartDTO dto = new CartDTO();
			String expected = "あいうえお";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//特殊記号
		@Test
		public void testGetRegist_date(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date7(){
			CartDTO dto = new CartDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}


		//半角カタカナ
		@Test
		public void testGetRegist_date8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date8(){
			CartDTO dto = new CartDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}
		//全角カタカナ
		@Test
		public void testGetRegist_date9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date9(){
			CartDTO dto = new CartDTO();
			String expected = "カタカナ";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetRegist_date10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date10(){
			CartDTO dto = new CartDTO();
			String expected = " ¥n　";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetRegist_date11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date11(){
			CartDTO dto = new CartDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//null
		@Test
		public void testGetRegist_date12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date12(){
			CartDTO dto = new CartDTO();
			String expected = null;
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		//空文字
		@Test
		public void testGetRegist_date13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}

		public void testSetRegist_date13(){
			CartDTO dto = new CartDTO();
			String expected = "";
			dto.setRegist_date(expected);
			assertEquals(expected, dto.getRegist_date());
		}



}
