package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.fifties.dto.AddressDTO;

public class AddressDTOTest {


// get Id test
	@Test
	public void testGetId1() {
		AddressDTO dto = new AddressDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		AddressDTO dto = new AddressDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		AddressDTO dto = new AddressDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		AddressDTO dto = new AddressDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		AddressDTO dto = new AddressDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//set Id test
	@Test
	public void testSetId1() {
		AddressDTO dto = new AddressDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		AddressDTO dto = new AddressDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		AddressDTO dto = new AddressDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		AddressDTO dto = new AddressDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		AddressDTO dto = new AddressDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testGetUserId1() {
		AddressDTO dto = new AddressDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		AddressDTO dto = new AddressDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3() {
		AddressDTO dto = new AddressDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId4() {
		AddressDTO dto = new AddressDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		AddressDTO dto = new AddressDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		AddressDTO dto = new AddressDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId7() {
		AddressDTO dto = new AddressDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		AddressDTO dto = new AddressDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		AddressDTO dto = new AddressDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId11() {
		AddressDTO dto = new AddressDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId12() {
		AddressDTO dto = new AddressDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//set UserId test
	@Test
	public void testSetUserId1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId6() {
		AddressDTO dto = new AddressDTO();
		String expected=" ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId7() {
		AddressDTO dto = new AddressDTO();
		String expected="　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId8() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId9() {
		AddressDTO dto = new AddressDTO();
		String expected="あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId10() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId11() {
		AddressDTO dto = new AddressDTO();
		String expected="abcあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId12() {
		AddressDTO dto = new AddressDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//get FamilyName test
	@Test
	public void testGetFamilyName1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName6() {
		AddressDTO dto = new AddressDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName7() {
		AddressDTO dto = new AddressDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName8() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName9() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName10() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName11() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName12() {
		AddressDTO dto = new AddressDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}




	// set Family Name test
	@Test

	public void testSetFamilyName1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName6() {
		AddressDTO dto = new AddressDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName7() {
		AddressDTO dto = new AddressDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName8() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName9() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName10() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName11() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName12() {
		AddressDTO dto = new AddressDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	// get FirstName test
	@Test
	public void testGetFirstName1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//set First Name test
	@Test
	public void testSetFirstName1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}


	// get FamilyNameKana test
	@Test
	public void testGetFamilyNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana6() {
		AddressDTO dto = new AddressDTO();
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana7() {
		AddressDTO dto = new AddressDTO();
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana8() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana9() {
		AddressDTO dto = new AddressDTO();
		String expected="あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana10() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana11() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana12() {
		AddressDTO dto = new AddressDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	// set FamilyNameKana test
	@Test
	public void testSetFamilyNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana6() {
		AddressDTO dto = new AddressDTO();
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana7() {
		AddressDTO dto = new AddressDTO();
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana8() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana9() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana10() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana11() {
		AddressDTO dto = new AddressDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana12() {
		AddressDTO dto = new AddressDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

		// get FirstNameKana test
	@Test
	public void testGetFirstNameKana() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana1() {
		AddressDTO dto = new AddressDTO();
		String expected="0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana2() {
		AddressDTO dto = new AddressDTO();
		String expected="2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana3() {
		AddressDTO dto = new AddressDTO();
		String expected="-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana4() {
		AddressDTO dto = new AddressDTO();
		String expected="null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana5() {
		AddressDTO dto = new AddressDTO();
		String expected="";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}


	//get Zip11 test
	@Test
	public void testGetZip111() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip112() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip113() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip114() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip115() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip116() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip117() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip118() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip119() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip1110() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip1111() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetZip1112() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetZip11() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip112() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip113() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip114() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip115() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip116() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip117() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip118() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip119() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip1110() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip1111() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetZip1112() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setZip11(expected);
		String actual = dto.getZip11();
		assertEquals(expected, actual);
	}



	// get Addr11 test
	@Test
	public void testGetAddr111() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr112() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr113() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr114() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr115() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr116() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr117() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr118() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr119() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr1110() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr1111() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddr1112() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}


	//set Addr11 test
	@Test
	public void testSetAddr111() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr112() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr113() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr114() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr115() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr116() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr117() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr118() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr119() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr1110() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr1111() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddr1112() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setAddr11(expected);
		String actual = dto.getAddr11();
		assertEquals(expected, actual);
	}


	// get Telnumber test
	@Test
	public void testGetTelNumber1() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber2() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber3() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber4() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber5() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}

		//set TelNumber
	@Test
	public void testSetTelNumber1() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber2() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber3() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber4() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber5() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setTelNumber(expected);
		String actual = dto.getTelNumber();
		assertEquals(expected, actual);
	}


	// get Email test
	@Test
	public void testGetEmail1() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail2() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail3() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail4() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail5() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//set Email test
	@Test
	public void testSetEmail1() {
		AddressDTO dto = new AddressDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail2() {
		AddressDTO dto = new AddressDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail3() {
		AddressDTO dto = new AddressDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail4() {
		AddressDTO dto = new AddressDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail5() {
		AddressDTO dto = new AddressDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail6() {
		AddressDTO dto = new AddressDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail7() {
		AddressDTO dto = new AddressDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail8() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail9() {
		AddressDTO dto = new AddressDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail10() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail11() {
		AddressDTO dto = new AddressDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail12() {
		AddressDTO dto = new AddressDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// get RegistDate test
	@Test
	public void testGetRegistDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() throws ParseException {
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	//set RegistDate test
	@Test
	public void testSetRegistDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() throws ParseException {
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}


	// get UpdateDate test
	@Test
	public void testGetUpdateDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException{
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate1() {
		AddressDTO dto = new AddressDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() throws ParseException{
		AddressDTO dto = new AddressDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}
}
