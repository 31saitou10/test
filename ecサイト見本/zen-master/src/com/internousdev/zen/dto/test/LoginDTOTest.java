package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.LoginDTO;

public class LoginDTOTest {


	public void testGetId1() {
		LoginDTO dto = new LoginDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	@Test
	public void testSetId1() {
		LoginDTO dto = new LoginDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testGetId2() {
		LoginDTO dto = new LoginDTO();
		int expected =  2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}
	public void testSetId2() {
		LoginDTO dto = new LoginDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	//最小値
		@Test
		public void testGetId3(){
			LoginDTO dto = new LoginDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		public void testSetId3(){
			LoginDTO dto = new LoginDTO();
			int expected = -2147483648;
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}

		//最大値以上
		@Test
		public void testGetId4(){
			LoginDTO dto = new LoginDTO();
			try{
				int expected = Integer.parseInt("2147483648");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		public void testSetId4(){
			LoginDTO dto = new LoginDTO();
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
			LoginDTO dto = new LoginDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

		public void testSetId5(){
			LoginDTO dto = new LoginDTO();
			try{
				int expected = Integer.parseInt("-2147483649");
				dto.setId(expected);
				assertEquals(expected, dto.getId());
			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}


	//userId

		//漢字
		@Test
		public void testGetLoginUserId1(){
			LoginDTO dto = new LoginDTO();
			String expected = "漢字";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetUserId1(){
			LoginDTO dto = new LoginDTO();
			String expected = "漢字";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//半角英字
		@Test
		public void testGetLoginUserId2(){
			LoginDTO dto = new LoginDTO();
			String expected = "abcde";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId2(){
			LoginDTO dto = new LoginDTO();
			String expected = "abcde";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//全角英字
		@Test
		public void testGetLoginUserId3(){
			LoginDTO dto = new LoginDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId3(){
			LoginDTO dto = new LoginDTO();
			String expected = "ｄｆｇｈｊ";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//半角数字
		@Test
		public void testGetLoginUserId4(){
			LoginDTO dto = new LoginDTO();
			String expected = "12345";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId4(){
			LoginDTO dto = new LoginDTO();
			String expected = "12345";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//全角数字
		@Test
		public void testGetLoginUserId5(){
			LoginDTO dto = new LoginDTO();
			String expected = "１２３４５";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId5(){
			LoginDTO dto = new LoginDTO();
			String expected = "１２３４５";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//ひらがな
		@Test
		public void testGetLoginUserId6(){
			LoginDTO dto = new LoginDTO();
			String expected = "あいうえお";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId6(){
			LoginDTO dto = new LoginDTO();
			String expected = "あいうえお";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//特殊記号
		@Test
		public void testGetLoginUserId7(){
			LoginDTO dto = new LoginDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId7(){
			LoginDTO dto = new LoginDTO();
			String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//半角カタカナ
		@Test
		public void testGetLoginUserId8(){
			LoginDTO dto = new LoginDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId8(){
			LoginDTO dto = new LoginDTO();
			String expected = "ｶﾀｶﾅ";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//全角カタカナ
		@Test
		public void testGetLoginUserId9(){
			LoginDTO dto = new LoginDTO();
			String expected = "カタカナ";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId9(){
			LoginDTO dto = new LoginDTO();
			String expected = "カタカナ";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//半角スペース,全角スペース,改行
		@Test
		public void testGetLoginUserId10(){
			LoginDTO dto = new LoginDTO();
			String expected = " ¥n　";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId10(){
			LoginDTO dto = new LoginDTO();
			String expected = " ¥n　";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
		@Test
		public void testGetLoginUserId11(){
			LoginDTO dto = new LoginDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId11(){
			LoginDTO dto = new LoginDTO();
			String expected = "あ漢ア１ｆｱ1f";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//null
		@Test
		public void testGetLoginUserId12(){
			LoginDTO dto = new LoginDTO();
			String expected = null;
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId12(){
			LoginDTO dto = new LoginDTO();
			String expected = null;
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		//空文字
		@Test
		public void testGetLoginUserId13(){
			LoginDTO dto = new LoginDTO();
			String expected = "";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}

		@Test
		public void testSetLoginUserId13(){
			LoginDTO dto = new LoginDTO();
			String expected = "";
			dto.setLoginUserId(expected);
			assertEquals(expected, dto.getLoginUserId());
		}



			//漢字
			@Test
			public void testGetLoginPassword1(){
				LoginDTO dto = new LoginDTO();
				String expected = "漢字";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword1(){
				LoginDTO dto = new LoginDTO();
				String expected = "漢字";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//半角英字
			@Test
			public void testGetLoginPassword2(){
				LoginDTO dto = new LoginDTO();
				String expected = "abcde";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword2(){
				LoginDTO dto = new LoginDTO();
				String expected = "abcde";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//全角英字
			@Test
			public void testGetLoginPassword3(){
				LoginDTO dto = new LoginDTO();
				String expected = "ｄｆｇｈｊ";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword3(){
				LoginDTO dto = new LoginDTO();
				String expected = "ｄｆｇｈｊ";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//半角数字
			@Test
			public void testGetLoginPassword4(){
				LoginDTO dto = new LoginDTO();
				String expected = "12345";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword4(){
				LoginDTO dto = new LoginDTO();
				String expected = "12345";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//全角数字
			@Test
			public void testGetLoginPassword5(){
				LoginDTO dto = new LoginDTO();
				String expected = "１２３４５";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword5(){
				LoginDTO dto = new LoginDTO();
				String expected = "１２３４５";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//ひらがな
			@Test
			public void testGetLoginPassword6(){
				LoginDTO dto = new LoginDTO();
				String expected = "あいうえお";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword6(){
				LoginDTO dto = new LoginDTO();
				String expected = "あいうえお";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//特殊記号
			@Test
			public void testGetLoginPassword7(){
				LoginDTO dto = new LoginDTO();
				String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword7(){
				LoginDTO dto = new LoginDTO();
				String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//半角カタカナ
			@Test
			public void testGetLoginPassword8(){
				LoginDTO dto = new LoginDTO();
				String expected = "ｶﾀｶﾅ";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword8(){
				LoginDTO dto = new LoginDTO();
				String expected = "ｶﾀｶﾅ";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//全角カタカナ
			@Test
			public void testGetLoginPassword9(){
				LoginDTO dto = new LoginDTO();
				String expected = "カタカナ";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword9(){
				LoginDTO dto = new LoginDTO();
				String expected = "カタカナ";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//半角スペース,全角スペース,改行
			@Test
			public void testGetLoginPassword10(){
				LoginDTO dto = new LoginDTO();
				String expected = " ¥n　";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword10(){
				LoginDTO dto = new LoginDTO();
				String expected = " ¥n　";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
			@Test
			public void testGetLoginPassword11(){
				LoginDTO dto = new LoginDTO();
				String expected = "あ漢ア１ｆｱ1f";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword11(){
				LoginDTO dto = new LoginDTO();
				String expected = "あ漢ア１ｆｱ1f";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//null
			@Test
			public void testGetLoginPassword12(){
				LoginDTO dto = new LoginDTO();
				String expected = null;
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword12(){
				LoginDTO dto = new LoginDTO();
				String expected = null;
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			//空文字
			@Test
			public void testGetLoginPassword13(){
				LoginDTO dto = new LoginDTO();
				String expected = "";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}

			@Test
			public void testSetLoginPassword13(){
				LoginDTO dto = new LoginDTO();
				String expected = "";
				dto.setLoginPassword(expected);
				assertEquals(expected, dto.getLoginPassword());
			}


	//漢字
	@Test
	public void testGetFamilyName1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//半角英字
	@Test
	public void testGetFamilyName2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//全角英字
	@Test
	public void testGetFamilyName3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//半角数字
	@Test
	public void testGetFamilyName4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//全角数字
	@Test
	public void testGetFamilyName5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//ひらがな
	@Test
	public void testGetFamilyName6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//特殊記号
	@Test
	public void testGetFamilyName7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//半角カタカナ
	@Test
	public void testGetFamilyName8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//全角カタカナ
	@Test
	public void testGetFamilyName9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetFamilyName10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetFamilyName11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//null
	@Test
	public void testGetFamilyName12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	//空文字
	@Test
	public void testGetFamilyName13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testSetFamilyName13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFamilyName(expected);
		assertEquals(expected, dto.getFamilyName());
	}




	//漢字
	@Test
	public void testGetFirstName1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//半角英字
	@Test
	public void testGetFirstName2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//全角英字
	@Test
	public void testGetFirstName3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//半角数字
	@Test
	public void testGetFirstName4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//全角数字
	@Test
	public void testGetFirstName5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//ひらがな
	@Test
	public void testGetFirstName6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//特殊記号
	@Test
	public void testGetFirstName7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//半角カタカナ
	@Test
	public void testGetFirstName8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//全角カタカナ
	@Test
	public void testGetFirstName9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetFirstName10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetFirstName11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//null
	@Test
	public void testGetFirstName12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	//空文字
	@Test
	public void testGetFirstName13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testSetFirstName13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFirstName(expected);
		assertEquals(expected, dto.getFirstName());
	}




	//漢字
	@Test
	public void testGetFamilyNameKana1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//半角英字
	@Test
	public void testGetFamilyNameKana2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//全角英字
	@Test
	public void testGetFamilyNameKana3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//半角数字
	@Test
	public void testGetFamilyNameKana4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//全角数字
	@Test
	public void testGetFamilyNameKana5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//ひらがな
	@Test
	public void testGetFamilyNameKana6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//特殊記号
	@Test
	public void testGetFamilyNameKana7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//半角カタカナ
	@Test
	public void testGetFamilyNameKana8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//全角カタカナ
	@Test
	public void testGetFamilyNameKana9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetFamilyNameKana10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetFamilyNameKana11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//null
	@Test
	public void testGetFamilyNameKana12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	//空文字
	@Test
	public void testGetFamilyNameKana13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFamilyNameKana(expected);
		assertEquals(expected, dto.getFamilyNameKana());
	}


	//漢字
	@Test
	public void testGetFirstNameKana1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana1(){
		LoginDTO dto = new LoginDTO();
		String expected = "漢字";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//半角英字
	@Test
	public void testGetFirstNameKana2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana2(){
		LoginDTO dto = new LoginDTO();
		String expected = "abcde";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//全角英字
	@Test
	public void testGetFirstNameKana3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana3(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｄｆｇｈｊ";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//半角数字
	@Test
	public void testGetFirstNameKana4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana4(){
		LoginDTO dto = new LoginDTO();
		String expected = "12345";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//全角数字
	@Test
	public void testGetFirstNameKana5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana5(){
		LoginDTO dto = new LoginDTO();
		String expected = "１２３４５";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//ひらがな
	@Test
	public void testGetFirstNameKana6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana6(){
		LoginDTO dto = new LoginDTO();
		String expected = "あいうえお";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//特殊記号
	@Test
	public void testGetFirstNameKana7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana7(){
		LoginDTO dto = new LoginDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//半角カタカナ
	@Test
	public void testGetFirstNameKana8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana8(){
		LoginDTO dto = new LoginDTO();
		String expected = "ｶﾀｶﾅ";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//全角カタカナ
	@Test
	public void testGetFirstNameKana9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana9(){
		LoginDTO dto = new LoginDTO();
		String expected = "カタカナ";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//半角スペース,全角スペース,改行
	@Test
	public void testGetFirstNameKana10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana10(){
		LoginDTO dto = new LoginDTO();
		String expected = " ¥n　";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
	@Test
	public void testGetFirstNameKana11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana11(){
		LoginDTO dto = new LoginDTO();
		String expected = "あ漢ア１ｆｱ1f";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//null
	@Test
	public void testGetFirstNameKana12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana12(){
		LoginDTO dto = new LoginDTO();
		String expected = null;
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	//空文字
	@Test
	public void testGetFirstNameKana13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana13(){
		LoginDTO dto = new LoginDTO();
		String expected = "";
		dto.setFirstNameKana(expected);
		assertEquals(expected, dto.getFirstNameKana());
	}



//漢字
@Test
public void testGetLoginFlg1(){
	LoginDTO dto = new LoginDTO();
	String expected = "漢字";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg1(){
	LoginDTO dto = new LoginDTO();
	String expected = "漢字";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//半角英字
@Test
public void testGetLoginFlg2(){
	LoginDTO dto = new LoginDTO();
	String expected = "abcde";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg2(){
	LoginDTO dto = new LoginDTO();
	String expected = "abcde";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//全角英字
@Test
public void testGetLoginFlg3(){
	LoginDTO dto = new LoginDTO();
	String expected = "ｄｆｇｈｊ";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg3(){
	LoginDTO dto = new LoginDTO();
	String expected = "ｄｆｇｈｊ";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//半角数字
@Test
public void testGetLoginFlg4(){
	LoginDTO dto = new LoginDTO();
	String expected = "12345";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg4(){
	LoginDTO dto = new LoginDTO();
	String expected = "12345";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//全角数字
@Test
public void testGetLoginFlg5(){
	LoginDTO dto = new LoginDTO();
	String expected = "１２３４５";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg5(){
	LoginDTO dto = new LoginDTO();
	String expected = "１２３４５";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//ひらがな
@Test
public void testGetLoginFlg6(){
	LoginDTO dto = new LoginDTO();
	String expected = "あいうえお";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg6(){
	LoginDTO dto = new LoginDTO();
	String expected = "あいうえお";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//特殊記号
@Test
public void testGetLoginFlg7(){
	LoginDTO dto = new LoginDTO();
	String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg7(){
	LoginDTO dto = new LoginDTO();
	String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//半角カタカナ
@Test
public void testGetLoginFlg8(){
	LoginDTO dto = new LoginDTO();
	String expected = "ｶﾀｶﾅ";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg8(){
	LoginDTO dto = new LoginDTO();
	String expected = "ｶﾀｶﾅ";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//全角カタカナ
@Test
public void testGetLoginFlg9(){
	LoginDTO dto = new LoginDTO();
	String expected = "カタカナ";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg9(){
	LoginDTO dto = new LoginDTO();
	String expected = "カタカナ";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//半角スペース,全角スペース,改行
@Test
public void testGetLoginFlg10(){
	LoginDTO dto = new LoginDTO();
	String expected = " ¥n　";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg10(){
	LoginDTO dto = new LoginDTO();
	String expected = " ¥n　";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//ひらがな、漢字、カタカナ、数字、アルファベット(全角、半角込み)
@Test
public void testGetLoginFlg11(){
	LoginDTO dto = new LoginDTO();
	String expected = "あ漢ア１ｆｱ1f";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg11(){
	LoginDTO dto = new LoginDTO();
	String expected = "あ漢ア１ｆｱ1f";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//null
@Test
public void testGetLoginFlg12(){
	LoginDTO dto = new LoginDTO();
	String expected = null;
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg12(){
	LoginDTO dto = new LoginDTO();
	String expected = null;
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

//空文字
@Test
public void testGetLoginFlg13(){
	LoginDTO dto = new LoginDTO();
	String expected = "";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}

@Test
public void testSetLoginFlg13(){
	LoginDTO dto = new LoginDTO();
	String expected = "";
	dto.setLoginFlg(expected);
	assertEquals(expected, dto.getLoginFlg());
}
}