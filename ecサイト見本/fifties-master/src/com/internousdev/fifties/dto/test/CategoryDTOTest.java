package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.fifties.dto.CategoryDTO;

public class CategoryDTOTest {


	//get Id test
	@Test
	public void testGetId1() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// set Id test
	@Test
	public void testSetId1() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// get Category_id test
	@Test
	public void testGetCategory_id1() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id2() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id3() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id4() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategory_id(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetCategory_id5() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategory_id(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set Category_id test
	@Test
	public void testSetCategory_id() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id2() {
		CategoryDTO dto = new CategoryDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id3() {
		CategoryDTO dto = new CategoryDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id4() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategory_id(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetCategory_id5() throws Exception{
		CategoryDTO dto = new CategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategory_id(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// get Category_name test
	@Test
	public void testGetCategory_name1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_name12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}



	// Set Category_name test
	@Test
	public void testSetCategory_name1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_name12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategory_name(expected);
		String actual = dto.getCategory_name();
		assertEquals(expected, actual);
	}


	// get Category_description test
	@Test
	public void testGetCategory_description1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory_description12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}


	// set Category_descriprion test
	@Test
	public void testSetCategory_description1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategory_description12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategory_description(expected);
		String actual = dto.getCategory_description();
		assertEquals(expected, actual);
	}


		// get Insert_date test

	@Test
	public void testGetInsert_date1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}

	//set Insert_date test
	@Test
	public void testSetInsert_date1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}

	// get Update_date test
	@Test
	public void testGetUpdate_date1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdate_date12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}

		// set Update_date test
	@Test
	public void testSetUpdate_date1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "-2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "null";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "　";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date8() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date9() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date10() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date11() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdate_date12() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected, actual);
	}

}
