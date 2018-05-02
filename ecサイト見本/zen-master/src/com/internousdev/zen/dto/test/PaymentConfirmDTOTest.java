package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.PaymentConfirmDTO;

public class PaymentConfirmDTOTest {



	/*
	 * int Id getter
	 */

	// 0
	@Test
	public void testGetId1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	// 最大値
	@Test
	public void testGetId2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	// 最小値
	@Test
	public void testGetId3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	// 最大値以上
	@Test
	public void testGetId4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	// 最小値以下
	@Test
	public void testGetId5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/*
	 * int userId setter
	 */

	// 0
	@Test
	public void testSetId1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	// 最大値
	@Test
	public void testSetId2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	// 最小値
	@Test
	public void testSetId3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	// 最大値以上
	@Test
	public void testSetId4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	// 最小値以下
	@Test
	public void testSetId5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	/*
	 * String user_id getter
	 */

	@Test
	public void testGetUser_id1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testGetUser_id12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	/*
	 * String user_id setter
	 */

	@Test
	public void testSetUser_id1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}
	@Test
	public void testSetUser_id12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}


	/*
	 * String family_name getter
	 */

	@Test
	public void testGetFamily_name1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testGetFamily_name12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	/*
	 * String family_name setter
	 */

	@Test
	public void testSetFamily_name1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}
	@Test
	public void testSetFamily_name12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}


	/*
	 * String first_name getter
	 */

	@Test
	public void testGetFirst_name1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testGetFirst_name12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	/*
	 * String first_name setter
	 */

	@Test
	public void testSetFirst_name1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}
	@Test
	public void testSetFirst_name12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	/*
	 * String family_name_kana getter
	 */

	@Test
	public void testGetFamily_name_kana1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testGetFamily_name_kana12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	/*
	 * String family_name_kana setter
	 */

	@Test
	public void testSetFamily_name_kana1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}
	@Test
	public void testSetFamily_name_kana12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}



	/*
	 * String first_name_kana getter
	 */

	@Test
	public void testGetFirst_name_kana1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testGetFirst_name_kana12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	/*
	 * String first_name_kana setter
	 */

	@Test
	public void testSetFirst_name_kana1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}
	@Test
	public void testSetFirst_name_kana12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}



	/*
	 * String email getter
	 */

	@Test
	public void testGetEmail1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testGetEmail12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	/*
	 * String email setter
	 */

	@Test
	public void testSetEmail1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}
	@Test
	public void testSetEmail12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}



	/*
	 * String tel_number getter
	 */

	@Test
	public void testGetTel_number1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testGetTel_number12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	/*
	 * String tel_number setter
	 */

	@Test
	public void testSetTel_number1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}
	@Test
	public void testSetTel_number12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}




	/*
	 * String user_address getter
	 */

	@Test
	public void testGetUser_address1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testGetUser_address12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	/*
	 * String user_address setter
	 */

	@Test
	public void testSetUser_address1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}
	@Test
	public void testSetUser_address12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}




	/*
	 * String regist_date getter
	 */

	@Test
	public void testGetRegist_date1() {
		PaymentConfirmDTO dto= new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testGetRegist_date12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}

	/*
	 * String regist_date setter
	 */

	@Test
	public void testSetRegist_date1() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "漢字";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date2() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "bbb";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date3() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｂｂｂ";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date4() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "111";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date5() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "１１１";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date6() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "あああ";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date7() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date8() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "ｱｱｱ";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date9() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "アアア";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date10() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = " ¥n　";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date11() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}
	@Test
	public void testSetRegist_date12() {
		PaymentConfirmDTO dto = new PaymentConfirmDTO();
		String expected = "null";
		dto.setRegist_date(expected);
		assertEquals(expected, dto.getRegist_date());
	}



}
