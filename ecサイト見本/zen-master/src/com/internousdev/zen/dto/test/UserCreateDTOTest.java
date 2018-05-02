package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.UserCreateDTO;

public class UserCreateDTOTest {

//	int
//idのテスト


	@Test
	public void testGetId1(){
		UserCreateDTO dto = new UserCreateDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetId1(){
		UserCreateDTO dto = new UserCreateDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId2(){
		UserCreateDTO dto = new UserCreateDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetId2(){
		UserCreateDTO dto = new UserCreateDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId3(){
		UserCreateDTO dto = new UserCreateDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}

	public void testSetId3(){
		UserCreateDTO dto = new UserCreateDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId4(){
		UserCreateDTO dto = new UserCreateDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetId4(){
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetId5(){
		UserCreateDTO dto = new UserCreateDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/*
	 * String Family_name
	 * getter
	 */
	@Test
	public void testGetFamily_name1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setFamily_name(expected);

		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testGetFamily_name12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setFamily_name(expected);
		assertEquals(expected, dto.getFamily_name());
	}

	@Test
	public void testSetFamily_name12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setFirst_name(expected);

		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testGetFirst_name12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setFirst_name(expected);
		assertEquals(expected, dto.getFirst_name());
	}

	@Test
	public void testSetFirst_name12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setFamily_name_kana(expected);

		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setFamily_name_kana(expected);
		assertEquals(expected, dto.getFamily_name_kana());
	}

	@Test
	public void testSetFamily_name_kana12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setFirst_name_kana(expected);

		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}

	@Test
	public void testSetFirst_name_kana12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";
		dto.setFirst_name_kana(expected);
		assertEquals(expected, dto.getFirst_name_kana());
	}


	/*
	 * String Sex
	 * getter
	 */
	@Test
	public void testGetSex1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}


	/*
	 * String Sex
	 * setter
	 */
	@Test
	public void testSetSex1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testSetSex12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";
		dto.setSex(expected);
		assertEquals(expected, dto.getSex());
	}


	/*
	 * String Email
	 * getter
	 */
	@Test
	public void testGetEmail1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testSetEmail12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";
		dto.setEmail(expected);
		assertEquals(expected, dto.getEmail());
	}


	/*
	 * String User_id
	 * getter
	 */
	@Test
	public void testGetUser_id1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id12() {
		UserCreateDTO dto = new UserCreateDTO();
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
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";
		dto.setUser_id(expected);
		assertEquals(expected, dto.getUser_id());
	}

	/*
	 * String Password
	 * getter
	 */
	@Test
	public void testGetPassword1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}


	/*
	 * String Password
	 * setter
	 */
	@Test
	public void testSetPassword1() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "漢字";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword2() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "bbb";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword3() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｂｂｂ";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword4() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "111";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword5() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "１１１";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword6() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "あああ";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword7() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword8() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "ｱｱｱ";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword9() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "アアア";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword10() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = " ¥n　";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword11() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword12() {
		UserCreateDTO dto = new UserCreateDTO();
		String expected = "null";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}


}
