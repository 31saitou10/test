package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.ProductDTO;

public class ProductDTOTest {

	/*
	 * String product_count
	 * getter
	 */
	@Test
	public void testGetProduct_count1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testGetProduct_count12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_count(expected);
		assertEquals(expected,dto.getProduct_count());
	}
	/*
	 * String product_count
	 * setter
	 */
	@Test
	public void testSetProduct_count1() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "漢字";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count2() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "bbb";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count3() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "ｂｂｂ";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count4() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "111";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count5() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "１１１";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count6() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "あああ";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count7() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count8() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "ｱｱｱ";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count9() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "アアア";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());

	}@Test
	public void testSetProduct_count10() {
		 ProductDTO dto = new ProductDTO();
		 String expected = " ¥n　";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count11() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}
	@Test
	public void testSetProduct_count12() {
		 ProductDTO dto = new ProductDTO();
		 String expected = "null";
		 dto.setProduct_count(expected);
		 assertEquals(expected,dto.getProduct_count());
	}

	/*
	 * int id
	 * getter
	 */
	@Test
	public void testGetId1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testGetId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testGetId3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testGetId4() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/*
	 * int id
	 * setter
	 */
	@Test
	public void testSetId1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;
		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testSetId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;
		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testSetId3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483648;
		dto.setId(expected);
		assertEquals(expected,dto.getId());
	}
	@Test
	public void testSetId4() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setId(expected);
			assertEquals(expected, dto.getId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/*
	 * int product_id
	 * getter
	 */
	@Test
	public void testGetProduct_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;
		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());
	}
	@Test
	public void testGetProduct_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;
		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());
	}
	@Test
	public void testGetProduct_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483648;
		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());
	}
	@Test
	public void testGetProduct_id4() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setProduct_id(expected);
			assertEquals(expected, dto.getProduct_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProduct_id5() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setProduct_id(expected);
			assertEquals(expected, dto.getProduct_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/*
	 * int product_id
	 * setter
	 */
	@Test
	public void testSetProduct_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;
		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());
	}
	@Test
	public void testSetProduct_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;
		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());
	}
	public void testSetProduct_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483648;
		dto.setProduct_id(expected);
		assertEquals(expected,dto.getProduct_id());
	}
	@Test
	public void testSetProduct_id4() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setProduct_id(expected);
			assertEquals(expected, dto.getProduct_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProduct_id5() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setProduct_id(expected);
			assertEquals(expected, dto.getProduct_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/*
	 * String product_name
	 * getter
	 */
	@Test
	public void testGetProduct_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testGetProduct_name12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	/*
	 * String product_name
	 * setter
	 */
	@Test
	public void testSetProduct_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	@Test
	public void testSetProduct_name12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_name(expected);
		assertEquals(expected,dto.getProduct_name());
	}
	/*
	 * String product_name_kana
	 * getter
	 */
	@Test
	public void testGetProduct_name_kana1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testGetProduct_name_kana12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	/*
	 * String product_name_kana
	 * setter
	 */
	@Test
	public void testSetProduct_name_kana1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	@Test
	public void testSetProduct_name_kana12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_name_kana(expected);
		assertEquals(expected,dto.getProduct_name_kana());
	}
	/*
	 * String product_description
	 * getter
	 */
	@Test
	public void testGetProduct_description1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testGetProduct_description12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	/*
	 * String product_description
	 * setter
	 */
	@Test
	public void testSetProduct_description1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	@Test
	public void testSetProduct_description12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setProduct_description(expected);
		assertEquals(expected,dto.getProduct_description());
	}
	/*
	 * String keywords
	 * getter
	 */
	@Test
	public void testGetKeywords1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testGetKeywords12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	/*
	 * String keywords
	 * setter
	 */
	@Test
	public void testSetKeywords1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testSetKeywords2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testSetKeywords3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	@Test
	public void testSetKeywords4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}@Test
	public void testSetKeywords12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setKeywords(expected);
		assertEquals(expected,dto.getKeywords());
	}
	/*
	 * int category_id
	 * getter
	 */
	@Test
	public void testGetCategory_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;
		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());
	}@Test
	public void testGetCategory_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;
		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());
	}@Test
	public void testGetCategory_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483648;
		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());
	}@Test
	public void testGetCategory_id4() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setCategory_id(expected);
			assertEquals(expected, dto.getCategory_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}@Test
	public void testGetCategory_id5() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setCategory_id(expected);
			assertEquals(expected, dto.getCategory_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/*
	 * int category_id
	 * setter
	 */
	@Test
	public void testSetCategory_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;
		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());
	}@Test
	public void testSetCategory_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;
		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());
	}@Test
	public void testSetCategory_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483648;
		dto.setCategory_id(expected);
		assertEquals(expected,dto.getCategory_id());
	}@Test
	public void testSetCategory_id4() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("2147483648");
			dto.setCategory_id(expected);
			assertEquals(expected, dto.getCategory_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}@Test
	public void testSetCategory_id5() {
		ProductDTO dto = new ProductDTO();
		try{
			int expected = Integer.parseInt("-2147483649");
			dto.setCategory_id(expected);
			assertEquals(expected, dto.getCategory_id());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/*
	 * String price
	 * getter
	 */
	@Test
	public void testGetPrice1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testGetPrice8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}
	public void testGetPrice9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}
	public void testGetPrice10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}
	public void testGetPrice11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}
	public void testGetPrice12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}
	/*
	 * String price
	 * setter
	 */
	@Test
	public void testSetPrice1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}@Test
	public void testSetPrice12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setPrice(expected);
		assertEquals(expected,dto.getPrice());
	}

	/*
	 * String image_file_path
	 * getter
	 */
	@Test
	public void testGetImage_file_path1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testGetImage_file_path12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}
	/*
	 * String image_file_path
	 * setter
	 */
	@Test
	public void testSetImage_file_path1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}@Test
	public void testSetImage_file_path12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setImage_file_path(expected);
		assertEquals(expected,dto.getImage_file_path());
	}
	/*
	 * String image_file_name
	 * getter
	 */
	@Test
	public void testGetImage_file_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testGetImage_file_name12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}
	/*
	 * String iamge_file_name
	 * setter
	 */
	@Test
	public void testSetImage_file_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}@Test
	public void testSetImage_file_name12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setImage_file_name(expected);
		assertEquals(expected,dto.getImage_file_name());
	}
	/*
	 * String release_date
	 * getter
	 */
	@Test
	public void testGetRelease_date1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testGetRelease_date12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}
	/*
	 * String release_date
	 * setter
	 */
	@Test
	public void testSetRelease_date1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}@Test
	public void testSetRelease_date12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setRelease_date(expected);
		assertEquals(expected,dto.getRelease_date());
	}
	/*
	 * String release_company
	 * getter
	 */
	@Test
	public void testGetRelease_company1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testGetRelease_company12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}
	/*
	 * String release_company
	 * setter
	 */
	@Test
	public void testSetRelease_company1() {
		ProductDTO dto = new ProductDTO();
		String expected = "漢字";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company2() {
		ProductDTO dto = new ProductDTO();
		String expected = "bbb";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company3() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｂｂｂ";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company4() {
		ProductDTO dto = new ProductDTO();
		String expected = "111";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company5() {
		ProductDTO dto = new ProductDTO();
		String expected = "１１１";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company6() {
		ProductDTO dto = new ProductDTO();
		String expected = "あああ";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company7() {
		ProductDTO dto = new ProductDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}@Test[];:";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company8() {
		ProductDTO dto = new ProductDTO();
		String expected = "ｱｱｱ";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company9() {
		ProductDTO dto = new ProductDTO();
		String expected = "アアア";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company10() {
		ProductDTO dto = new ProductDTO();
		String expected = " ¥n　";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company11() {
		ProductDTO dto = new ProductDTO();
		String expected = "";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}@Test
	public void testSetRelease_company12() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";
		dto.setRelease_company(expected);
		assertEquals(expected,dto.getRelease_company());
	}
}
