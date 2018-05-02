package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.DestinationAddDTO;

public class DestinationAddDTOTest {


	/*
	 * String User_id
	 * getter
	 */
	@Test
	public void testGetUser_id1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}


	/*
	 * String User_id
	 * setter
	 */
	@Test
	public void testSetUser_id1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}


	/*
	 * String Family_name
	 * getter
	 */
	@Test
	public void testGetFamily_name1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}


	/*
	 * String Family_name
	 * setter
	 */
	@Test
	public void testSetFamily_name1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}


	/*
	 * String First_name
	 * getter
	 */
	@Test
	public void testGetFirst_name1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}


	/*
	 * String First_name
	 * setter
	 */
	@Test
	public void testSetFirst_name1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}


	/*
	 * String Family_name_kana
	 * getter
	 */
	@Test
	public void testGetFamily_name_kana1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}


	/*
	 * String Family_name_kana
	 * setter
	 */
	@Test
	public void testSetFamily_name_kana1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void Family_name_kana3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}




	/*
	 * String First_name_kana
	 * getter
	 */
	@Test
	public void testGetFirst_name_kana1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}


	/*
	 * String First_name_kana
	 * setter
	 */
	@Test
	public void testSetFirst_name_kana1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}



	/*
	 * String User_address
	 * getter
	 */
	@Test
	public void testGetUser_address1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testGetUser_address12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setUser_address(expected);

		assertEquals(expected, dto.getUser_address());
	}


	/*
	 * String User_address
	 * setter
	 */
	@Test
	public void testSetUser_address1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}

	@Test
	public void testSetUser_address12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setUser_address(expected);
		assertEquals(expected, dto.getUser_address());
	}



	/*
	 * String Tel_number
	 * getter
	 */
	@Test
	public void testGetTel_number1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testGetTel_number12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setTel_number(expected);

		assertEquals(expected, dto.getTel_number());
	}


	/*
	 * String Tel_number
	 * setter
	 */
	@Test
	public void testSetTel_number1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}

	@Test
	public void testSetTel_number12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setTel_number(expected);
		assertEquals(expected, dto.getTel_number());
	}


	/*
	 * String Email
	 * getter
	 */
	@Test
	public void testGetEmail1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}


	/*
	 * String Email
	 * setter
	 */
	@Test
	public void testSetEmail1() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "漢字";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail2() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "bbb";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail3() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｂｂｂ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail4() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "111";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail5() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "１１１";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail6() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "あああ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail7() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail8() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "ｱｱｱ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail9() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "アアア";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail10() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = " ¥n　";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail11() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail12() {
		DestinationAddDTO dto = new DestinationAddDTO();
		String expected = "null";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}


//	int
//idのテスト


	@Test
	public void testGetId1(){
		DestinationAddDTO dto = new DestinationAddDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetId1(){
		DestinationAddDTO dto = new DestinationAddDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId2(){
		DestinationAddDTO dto = new DestinationAddDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetId2(){
		DestinationAddDTO dto = new DestinationAddDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId3(){
		DestinationAddDTO dto = new DestinationAddDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetId3(){
		DestinationAddDTO dto = new DestinationAddDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId4(){
		DestinationAddDTO dto = new DestinationAddDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetId4(){
		DestinationAddDTO dto = new DestinationAddDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetId5(){
		DestinationAddDTO dto = new DestinationAddDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetId5(){
		DestinationAddDTO dto = new DestinationAddDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


}
