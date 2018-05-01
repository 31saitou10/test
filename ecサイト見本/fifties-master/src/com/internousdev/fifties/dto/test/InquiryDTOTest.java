package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.fifties.dto.InquiryDTO;

public class InquiryDTOTest {

	@Test
	public void testGetName1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetName12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}


	// set Name test
	@Test
	public void testSetName1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setName(expected);
		String actual = dto.getName();
		assertEquals(expected, actual);
	}


		// get Email test
	@Test
	public void testGetEmail1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}


	// set Email test
	@Test
	public void testSetEmail1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}


	// get Inquiry_type test
	@Test
	public void testGetInquiry_type1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_type12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}


	// set Inquiry_type test
	@Test
	public void testSetInquiry_type1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_type12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInquiry_type(expected);
		String actual = dto.getInquiry_type();
		assertEquals(expected, actual);
	}

	// get Inquiry_body test
	@Test
	public void testGetInquiry_body1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInquiry_body12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}

	// set Inquiry_body test
	@Test
	public void testSetInquiry_body1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInquiry_body12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInquiry_body(expected);
		String actual = dto.getInquiry_body();
		assertEquals(expected, actual);
	}

	// get Id test
	@Test
	public void testGetId1() {
		InquiryDTO dto = new InquiryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		InquiryDTO dto = new InquiryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		InquiryDTO dto = new InquiryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		InquiryDTO dto = new InquiryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		InquiryDTO dto = new InquiryDTO();
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
		InquiryDTO dto = new InquiryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		InquiryDTO dto = new InquiryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		InquiryDTO dto = new InquiryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		InquiryDTO dto = new InquiryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		InquiryDTO dto = new InquiryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

		// get Insert_date test
	@Test
	public void testGetInsert_date() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "0";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsert_date12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}


	// set Insert_date test
	@Test
	public void testSetInsert_date1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "-2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "　";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsert_date12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected, actual);
	}

}
