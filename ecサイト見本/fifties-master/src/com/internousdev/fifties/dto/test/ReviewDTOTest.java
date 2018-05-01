package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.fifties.dto.ReviewDTO;

public class ReviewDTOTest {


	// get id test
	@Test
	public void testGetId() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId4() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// set id test
	@Test
	public void testSetId1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId4() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// get ProductId test
	@Test
	public void testGetProductId1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}


	// set ProductId test
	@Test
	public void testSetProductId() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}



	// get UserId test
	@Test
	public void testGetUserId() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// set UserId test
	@Test
	public void testSetUserId1() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		ReviewDTO dto = new ReviewDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId10() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId11() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId12() {
		ReviewDTO dto = new ReviewDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}


	// get ReviewTitle
	@Test
	public void testGetReviewTitle1() {
		ReviewDTO dto = new ReviewDTO();
		String expected="0";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle2() {
		ReviewDTO dto = new ReviewDTO();
		String expected="2147483647";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle3() {
		ReviewDTO dto = new ReviewDTO();
		String expected="-2147483647";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle4() {
		ReviewDTO dto = new ReviewDTO();
		String expected="null";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle5() {
		ReviewDTO dto = new ReviewDTO();
		String expected="";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle6() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle7() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle8() {
		ReviewDTO dto = new ReviewDTO();
		String expected="　";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle9() {
		ReviewDTO dto = new ReviewDTO();
		String expected="あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle10() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle11() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewTitle12() {
		ReviewDTO dto = new ReviewDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}


	// set ReviewTitle test
	@Test
	public void testSetReviewTitle1() {
		ReviewDTO dto = new ReviewDTO();
		String expected="0";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle2() {
		ReviewDTO dto = new ReviewDTO();
		String expected="2147483647";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle3() {
		ReviewDTO dto = new ReviewDTO();
		String expected="-2147483647";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle4() {
		ReviewDTO dto = new ReviewDTO();
		String expected="null";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle5() {
		ReviewDTO dto = new ReviewDTO();
		String expected="";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle6() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle7() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle8() {
		ReviewDTO dto = new ReviewDTO();
		String expected="　";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle9() {
		ReviewDTO dto = new ReviewDTO();
		String expected="あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle10() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle11() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewTitle12() {
		ReviewDTO dto = new ReviewDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReviewTitle(expected);
		String actual = dto.getReviewTitle();
		assertEquals(expected,actual);
	}


	// get ReviewBody test
	@Test
	public void testGetReviewBody1() {
		ReviewDTO dto = new ReviewDTO();
		String expected="0";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody2() {
		ReviewDTO dto = new ReviewDTO();
		String expected="2147483647";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody3() {
		ReviewDTO dto = new ReviewDTO();
		String expected="-2147483647";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody4() {
		ReviewDTO dto = new ReviewDTO();
		String expected="null";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody5() {
		ReviewDTO dto = new ReviewDTO();
		String expected="";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody6() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody7() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody8() {
		ReviewDTO dto = new ReviewDTO();
		String expected="　";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody9() {
		ReviewDTO dto = new ReviewDTO();
		String expected="あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody10() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody11() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReviewBody12() {
		ReviewDTO dto = new ReviewDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}



	@Test
	public void testSetReviewBody1() {
		ReviewDTO dto = new ReviewDTO();
		String expected="0";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody2() {
		ReviewDTO dto = new ReviewDTO();
		String expected="2147483647";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody3() {
		ReviewDTO dto = new ReviewDTO();
		String expected="-2147483647";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody4() {
		ReviewDTO dto = new ReviewDTO();
		String expected="null";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody5() {
		ReviewDTO dto = new ReviewDTO();
		String expected="";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody6() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody7() {
		ReviewDTO dto = new ReviewDTO();
		String expected=" ";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody8() {
		ReviewDTO dto = new ReviewDTO();
		String expected="　";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testsetReviewBody9() {
		ReviewDTO dto = new ReviewDTO();
		String expected="あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReviewBody10() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetReviewBody11() {
		ReviewDTO dto = new ReviewDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	@Test
	public void testsetReviewBody12() {
		ReviewDTO dto = new ReviewDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReviewBody(expected);
		String actual = dto.getReviewBody();
		assertEquals(expected,actual);
	}

	// get ReviewScore test
	@Test
	public void testGetReviewScore1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewScore2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewScore3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewScore4() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setReviewScore(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetReviewScore5() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setReviewScore(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}


	// set ReviewScore test
	@Test
	public void testSetReviewScore1() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 0;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewScore2() {
		ReviewDTO dto = new ReviewDTO();
		int expected = 2147483647;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewScore3() {
		ReviewDTO dto = new ReviewDTO();
		int expected = -2147483647;

		dto.setReviewScore(expected);
		int actual = dto.getReviewScore();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewScore4() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setReviewScore(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetReviewScore5() throws Exception{
		ReviewDTO dto = new ReviewDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setReviewScore(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}


	//get Datetime test
	@Test
	public void testGetDatetime1() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="0";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime2() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="2147483647";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime3() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="-2147483647";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime4() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="null";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime5() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime6() {
		ReviewDTO dto = new ReviewDTO();
		String expected =" ";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime7() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="　";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime8() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime9() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="あいう１２３";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime10() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime11() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDatetime12() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}



	// set Datetime test
	@Test
	public void testSetDatetime1() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="0";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime2() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="2147483647";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime3() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="-2147483647";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime4() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="null";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime5() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime6() {
		ReviewDTO dto = new ReviewDTO();
		String expected =" ";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime7() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="　";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime8() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime9() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="あいう１２３";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime10() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime11() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDatetime12() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setDatetime(expected);
		String actual = dto.getDatetime();
		assertEquals(expected,actual);
	}



	// get InsertDate test
	@Test
	public void testGetInsertDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected =" ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate9() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate10() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate11() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate12() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}


	// set InsertDate test
	@Test
	public void testSetInsertDate1() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate2() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate3() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate4() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate5() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate6() {
		ReviewDTO dto = new ReviewDTO();
		String expected =" ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate7() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate8() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate9() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate10() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate11() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate12() {
		ReviewDTO dto = new ReviewDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}


}
