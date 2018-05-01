package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.fifties.dto.UserUpdateDTO;

public class UserUpdateDTOTest {


	// get User_id test
	@Test
	public void testGetUser_id1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "0";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "null";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = " ";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "　";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUser_id10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUser_id12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}



	// set User_id test
	@Test
	public void testSetUser_id1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "0";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "null";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = " ";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "　";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUser_id12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUser_id(expected);
		String actual = dto.getUser_id();
		assertEquals(expected, actual);
	}

	//get Password test
	@Test
	public void testGetPassword1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetPassword1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}


	//get Email test
	@Test
	public void testGetEmail1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}


	// set Email test
	@Test
	public void testSetEmail1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//get NewPassword test
	@Test
	public void testGetNewPassword1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="0";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="2147483647";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="-2147483647";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="null";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected =" ";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewPassword12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	// set NewPassword test
	@Test
	public void testSetNewPassword1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="0";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="2147483647";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="-2147483647";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="null";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected =" ";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="　";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewPassword12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setNewPassword(expected);
		String actual = dto.getNewPassword();
		assertEquals(expected, actual);
	}


	// get RePassword test
	@Test
	public void testGetRePassword1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="0";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="2147483647";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="-2147483647";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="null";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected =" ";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="　";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="あいう１２３";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRePassword12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}


	// set RePassword test
	@Test
	public void testSetRePassword1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="0";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="2147483647";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="-2147483647";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="null";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected =" ";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="　";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="あいう１２３";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRePassword12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setRePassword(expected);
		String actual = dto.getRePassword();
		assertEquals(expected, actual);
	}



	//get NewEmail test
	@Test
	public void testGetNewEmail1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="0";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="2147483647";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="-2147483647";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="null";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected =" ";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="　";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetNewEmail8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="あいう１２３";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetNewEmail12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}


	// set NewEmail test
	@Test
	public void testSetNewEmail1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="0";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="2147483647";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="-2147483647";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="null";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected =" ";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="　";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="あいう１２３";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNewEmail12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setNewEmail(expected);
		String actual = dto.getNewEmail();
		assertEquals(expected, actual);
	}


	// get FamilyName test
	@Test
	public void testGetFamilyName1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}



	// set FamilyName test
	@Test
	public void testSetFamilyName1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}


	// get FirstName test
	@Test
	public void testGetFirstName1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}



	// set FirstName test
	@Test
	public void testSetFirstName1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}


	// get FamilyNameKana test
	@Test
	public void testGetFamilyNameKana1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}



	//set FamilyNameKana test
	@Test
	public void testSetFamilyNameKana() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected=" ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}



	// get FirstNameKana
	@Test
	public void testGetFirstNameKana1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}



	// set FirstNameKana
	@Test
	public void testSetFirstNameKana1() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana2() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana3() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana4() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana5() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected="";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana6() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana7() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana8() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana9() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana10() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana11() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana12() {
		UserUpdateDTO dto =  new UserUpdateDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
}
