package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.fifties.dto.PurchaseHistoryDTO;

public class PurchaseHistoryDTOTest {


	// get ProductName test
	@Test
	public void testGetProductName1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}


	// set ProductName test
	@Test
	public void testSetProductName1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}



	// get ProductNameKana test
	@Test
	public void testGetProductNameKana1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}


	// set ProductNameKana test
	@Test
	public void testSetProductNameKana1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}


	// get ProductDescriprion test
	@Test
	public void testGetProductDescription1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}


	// set ProductDescription test
	@Test
	public void testSetProductDescription1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	// set ImageFileName
	@Test
	public void testSetImageFileName1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}


	// set ImageFilePath test
	@Test
	public void testSetImageFilePath1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// get Price test
	@Test
	public void testGetPrice1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() throws Exception{
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetPrice5() throws Exception{
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	// set Price test
	@Test
	public void testSetPrice1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetPrice3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() throws Exception{
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMax =10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetPrice5() throws Exception{
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMax =-10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


	// get count test
	@Test
	public void testGetCount1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 0;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCount2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCount3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCount4() throws Exception {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}

	@Test
	public void testGetCount5() throws Exception {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	// set Count test
	@Test
	public void testSetCount1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 0;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCount2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCount3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCount4() throws Exception {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}

	@Test
	public void testSetCount5() throws Exception {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	// get ReleaseCompany test
	@Test
	public void testGetReleaseCompany1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected=" ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}


	// set ReleaseCompany test
	@Test
	public void testSetReleaseCompany1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected=" ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}


	// get ReleaseDate test
	@Test
	public void testGetReleaseDate1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetReleaseDate1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDate12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}


	// get Id test
	@Test
	public void testGetId1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}



	// set Id test
	@Test
	public void testSetId1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "0";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "null";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected, actual);
	}


	//get ProductId test
	@Test
	public void testGetProductId1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="0";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="-2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="null";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected=" ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected=" ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	// set ProductId test
		@Test
		public void testSetProductId1() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "0";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId2() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "2147483647";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId3() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "-2147483647";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId4() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "null";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId5() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId6() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = " ";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId7() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "　";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId8() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "abc123";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId9() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "あいう１２３";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId10() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "abc123あいう１２３";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId11() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductId12() {
			PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setProductId(expected);
			String actual = dto.getProductId();
			assertEquals(expected, actual);
		}



		//get InsertDate
	@Test
	public void testGetInsertDate1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsertDate12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}


	// set InsertDate test
	@Test
	public void testSetInsertDate1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testSetInsertDate5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testSetInsertDate6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testSetInsertDate7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testSetInsertDate8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testSetInsertDate9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setInsertDate(expected);
		assertEquals(expected,dto.getInsertDate());
	}

	@Test
	public void testSetInsertDate10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsertDate12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCount1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetProductCount1() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="0";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="-2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount4() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="null";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount5() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount6() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected =" ";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount7() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="　";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount8() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount9() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount10() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount11() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount12() {
		PurchaseHistoryDTO dto =new PurchaseHistoryDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

}
