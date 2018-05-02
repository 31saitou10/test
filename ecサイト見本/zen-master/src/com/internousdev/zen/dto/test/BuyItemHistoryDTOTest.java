package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.BuyItemHistoryDTO;

public class BuyItemHistoryDTOTest {


	/*
	 * String productNamekana
	 * getter
	 */
	@Test
	public void testGetProduct_namekana1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testGetProduct_namekana12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setProduct_namekana(expected);

		assertEquals(expected, dto.getProduct_namekana());
	}


	/*
	 * String productNamekana
	 * setter
	 */
	@Test
	public void testSetProduct_namekana1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	@Test
	public void testSetProduct_namekana12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";
		dto.setProduct_namekana(expected);
		assertEquals(expected, dto.getProduct_namekana());
	}

	/*
	 * String Image_file_path
	 * getter
	 */
	@Test
	public void testGetImage_file_path1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testImage_file_path7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}


	/*
	 * String Image_file_path
	 * setter
	 */
	@Test
	public void testSetImage_file_path1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testSetImage_file_path12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}


	/*
	 * String Release_company
	 * getter
	 */
	@Test
	public void testGetRelease_company1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}



	/*
	 * String Release_company
	 * Setter
	 */
	@Test
	public void testSetRelease_company1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testSetRelease_company12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}


	/*
	 * String User_id
	 * getter
	 */
	@Test
	public void testGetUser_id1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}


	/*
	 * String User_id
	 * Setter
	 */
	@Test
	public void testSetUser_id1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testSetUser_id12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}


	/*
	 * String Product_name
	 * getter
	 */
	@Test
	public void testGetProduct_name1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}




	/*
	 * String Product_name
	 * Setter
	 */
	@Test
	public void testSetProduct_name1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testSetProduct_name12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	/*
	 * String Product_count
	 * getter
	 */
	@Test
	public void testGetProduct_count1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}




	/*
	 * String Product_count
	 * Setter
	 */
	@Test
	public void testSetProduct_count1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testSetProduct_count12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}


	/*
	 * String Price
	 * getter
	 */
	@Test
	public void testGetPrice1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGePrice7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}




	/*
	 * String Price
	 * Setter
	 */
	@Test
	public void testSetPrice1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testSetPrice12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}


	/*
	 * String Regist_date
	 * getter
	 */
	@Test
	public void testGetRegist_date1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}




	/*
	 * String Regist_date
	 * Setter
	 */
	@Test
	public void testSetRegist_date1() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "漢字";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date2() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "bbb";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date3() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｂｂｂ";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date4() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "111";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date5() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "１１１";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date6() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "あああ";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date7() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date8() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "ｱｱｱ";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date9() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "アアア";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date10() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = " ¥n　";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date11() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testSetRegist_date12() {
		BuyItemHistoryDTO dto = new BuyItemHistoryDTO();
		String expected = "null";

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}


}
