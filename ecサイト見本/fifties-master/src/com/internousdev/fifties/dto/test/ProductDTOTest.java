package com.internousdev.fifties.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.fifties.dto.ProductDTO;

public class ProductDTOTest {

	@Test
	public void testGetId1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetId1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// get Product_id test
	@Test
	public void testGetProduct_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_id4() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProduct_id(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProduct_id5() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProduct_id(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetProduct_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setProduct_id(expected);
		int actual = dto.getProduct_id();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_id4() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProduct_id(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	public void testSetProduct_id5() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProduct_id(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testGetProduct_name() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProduct_name1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setProduct_name(expected);
		String actual = dto.getProduct_name();
		assertEquals(expected, actual);
	}


	// get Product_name_kana test
	@Test
	public void testGetProduct_name_kana1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana2() {
		ProductDTO dto = new ProductDTO();
		String expected = "2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana3() {
		ProductDTO dto = new ProductDTO();
		String expected = "-2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana4() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana5() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana6() {
		ProductDTO dto = new ProductDTO();
		String expected = " ";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana7() {
		ProductDTO dto = new ProductDTO();
		String expected = "　";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana8() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana9() {
		ProductDTO dto = new ProductDTO();
		String expected = "あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana10() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana11() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_name_kana12() {
		ProductDTO dto = new ProductDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}



	// set Product_name_kana test
	@Test
	public void testSetProduct_name_kana1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana2() {
		ProductDTO dto = new ProductDTO();
		String expected = "2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana3() {
		ProductDTO dto = new ProductDTO();
		String expected = "-2147483647";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana4() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana5() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana6() {
		ProductDTO dto = new ProductDTO();
		String expected = " ";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana7() {
		ProductDTO dto = new ProductDTO();
		String expected = "　";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana8() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana9() {
		ProductDTO dto = new ProductDTO();
		String expected = "あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_name_kana10() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}

	public void testSetProduct_name_kana11() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}

	public void testSetProduct_name_kana12() {
		ProductDTO dto = new ProductDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_name_kana(expected);
		String actual = dto.getProduct_name_kana();
		assertEquals(expected, actual);
	}


	//  get Product_description test
	@Test
	public void testGetProduct_description1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description2() {
		ProductDTO dto = new ProductDTO();
		String expected = "2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description3() {
		ProductDTO dto = new ProductDTO();
		String expected = "-2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description4() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description5() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description6() {
		ProductDTO dto = new ProductDTO();
		String expected = " ";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description7() {
		ProductDTO dto = new ProductDTO();
		String expected = "　";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description8() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description9() {
		ProductDTO dto = new ProductDTO();
		String expected = "あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description10() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description11() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_description12() {
		ProductDTO dto = new ProductDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}



	// set Product_description test
	@Test
	public void testSetProduct_description() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description2() {
		ProductDTO dto = new ProductDTO();
		String expected = "2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description3() {
		ProductDTO dto = new ProductDTO();
		String expected = "-2147483647";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description4() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description5() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description6() {
		ProductDTO dto = new ProductDTO();
		String expected = " ";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description7() {
		ProductDTO dto = new ProductDTO();
		String expected = "　";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description8() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description9() {
		ProductDTO dto = new ProductDTO();
		String expected = "あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description10() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description11() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_description12() {
		ProductDTO dto = new ProductDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProduct_description(expected);
		String actual = dto.getProduct_description();
		assertEquals(expected, actual);
	}



	// get Category_id test
	@Test
	public void testGetCategory_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategory_id4() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setCategory_id(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testGetCategory_id5() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setCategory_id(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	// set Category_id test
	@Test
	public void testSetCategory_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setCategory_id(expected);
		int actual = dto.getCategory_id();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategory_id4() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setCategory_id(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testSetCategory_id5() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setCategory_id(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	//　get Product_Product_stock test
	@Test
	public void testGetProduct_stoc1k() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setProduct_stock(expected);
		int actual = dto.getProduct_stock();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_stock2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setProduct_stock(expected);
		int actual = dto.getProduct_stock();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProduct_stock3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setProduct_stock(expected);
		int actual = dto.getProduct_stock();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProduct_stock4() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setProduct_stock(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testGetProduct_stock5() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setProduct_stock(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}



	//set Product_stock test
	@Test
	public void testSetProduct_Product_stock1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setProduct_stock(expected);
		int actual = dto.getProduct_stock();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_stock2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setProduct_stock(expected);
		int actual = dto.getProduct_stock();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProduct_stock3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setProduct_stock(expected);
		int actual = dto.getProduct_stock();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProduct_stock4() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setProduct_stock(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testSetProduct_stock5() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setProduct_stock(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	// get Price test
	@Test
	public void testGetPrice1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice2() {
		ProductDTO dto = new ProductDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		ProductDTO dto = new ProductDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax =10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception{
		ProductDTO dto = new ProductDTO();
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
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice2() {
		ProductDTO dto = new ProductDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		ProductDTO dto = new ProductDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax =10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception{
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax =-10000000;
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


	// get Image_file_path test
	@Test
	public void testGetImage_file_path1() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImage_file_path6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImage_file_path12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}



	// set Image_file_path test
	@Test
	public void testSetImage_file_path() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImage_file_path6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setImage_file_path(expected);
		String actual = dto.getImage_file_path();
		assertEquals(expected,actual);
	}


	// get Image_file_name test
	@Test
	public void testGetImage_file_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = "2147483647";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "-2147483647";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = " ";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "　";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name8() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name9() {
		ProductDTO dto = new ProductDTO();
		String expected = "あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name10() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name11() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImage_file_name12() {
		ProductDTO dto = new ProductDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}


	// set Image_file_name test
	@Test
	public void testSetImage_file_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = "2147483647";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "-2147483647";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = "null";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = " ";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "　";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name8() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name9() {
		ProductDTO dto = new ProductDTO();
		String expected = "あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name10() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name11() {
		ProductDTO dto = new ProductDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImage_file_name12() {
		ProductDTO dto = new ProductDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImage_file_name(expected);
		String actual = dto.getImage_file_name();
		assertEquals(expected, actual);
	}


	// get Release_date test
	@Test
	public void testGetRelease_date1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRelease_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetRelease_date6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetRelease_date12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}



	// set Release_date  test
	@Test
	public void testSetRelease_date1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRelease_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetRelease_date6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setRelease_date(expected);
		String actual = dto.getRelease_date();
		assertEquals(expected,actual);
	}


	//get Release_company test
	@Test
	public void testGetRelease_company1() {
		ProductDTO dto = new ProductDTO();
		String expected="0";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRelease_company2() {
		ProductDTO dto = new ProductDTO();
		String expected="2147483647";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company3() {
		ProductDTO dto = new ProductDTO();
		String expected="-2147483647";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company4() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company5() {
		ProductDTO dto = new ProductDTO();
		String expected="";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company6() {
		ProductDTO dto = new ProductDTO();
		String expected=" ";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company7() {
		ProductDTO dto = new ProductDTO();
		String expected="　";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company8() {
		ProductDTO dto = new ProductDTO();
		String expected="abc123";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company9() {
		ProductDTO dto = new ProductDTO();
		String expected="あいう１２３";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company10() {
		ProductDTO dto = new ProductDTO();
		String expected="abc123あいう１２３";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company11() {
		ProductDTO dto = new ProductDTO();
		String expected="abc123あいう１２３漢字";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRelease_company12() {
		ProductDTO dto = new ProductDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}


	// set Release_company test
	@Test
	public void testSetRelease_company1() {
		ProductDTO dto = new ProductDTO();
		String expected="0";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRelease_company2() {
		ProductDTO dto = new ProductDTO();
		String expected="2147483647";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company3() {
		ProductDTO dto = new ProductDTO();
		String expected="-2147483647";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company4() {
		ProductDTO dto = new ProductDTO();
		String expected="null";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company5() {
		ProductDTO dto = new ProductDTO();
		String expected="";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company6() {
		ProductDTO dto = new ProductDTO();
		String expected=" ";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company7() {
		ProductDTO dto = new ProductDTO();
		String expected="　";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company8() {
		ProductDTO dto = new ProductDTO();
		String expected="abc123";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company9() {
		ProductDTO dto = new ProductDTO();
		String expected="あいう１２３";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company10() {
		ProductDTO dto = new ProductDTO();
		String expected="abc123あいう１２３";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company11() {
		ProductDTO dto = new ProductDTO();
		String expected="abc123あいう１２３漢字";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRelease_company12() {
		ProductDTO dto = new ProductDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setRelease_company(expected);
		String actual = dto.getRelease_company();
		assertEquals(expected, actual);
	}


	// get Status test
	@Test
	public void testGetStatus1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus4() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setStatus(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testGetStatus5() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setStatus(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	@Test
	public void testSetStatus1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus2() {
		ProductDTO dto = new ProductDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus3() {
		ProductDTO dto = new ProductDTO();
		int expected = -2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus4() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setStatus(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}
	@Test
	public void testSetStatus5() throws Exception {
		ProductDTO dto = new ProductDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setStatus(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	// get Insert_date test
	@Test
	public void testGetInsert_date1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsert_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsert_date3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsert_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testGetInsert_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testGetInsert_date6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testGetInsert_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testGetInsert_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testGetInsert_date9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testGetInsert_date10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsert_date11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetInsert_date12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	// set Insert_date test
	@Test
	public void testSetInsert_date1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testSetInsert_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testSetInsert_date6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testSetInsert_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testSetInsert_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testSetInsert_date9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setInsert_date(expected);
		assertEquals(expected,dto.getInsert_date());
	}
	@Test
	public void testSetInsert_date10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setInsert_date(expected);
		String actual = dto.getInsert_date();
		assertEquals(expected,actual);
	}


	// get Update_date test
	@Test
	public void testGetUpdate_date1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUpdate_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUpdate_date3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUpdate_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testGetUpdate_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testGetUpdate_date6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testGetUpdate_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testGetUpdate_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testGetUpdate_date9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testGetUpdate_date10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}
	@Test

	public void testGetUpdate_date11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUpdate_date12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}



	// set Update_date test
	@Test
	public void testSetUpdate_date1() {
		ProductDTO dto = new ProductDTO();
		String expected ="0";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date2() {
		ProductDTO dto = new ProductDTO();
		String expected ="2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date3() {
		ProductDTO dto = new ProductDTO();
		String expected ="-2147483647";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date4() {
		ProductDTO dto = new ProductDTO();
		String expected ="null";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testSetUpdate_date5() {
		ProductDTO dto = new ProductDTO();
		String expected ="";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testSetUpdate_date6() {
		ProductDTO dto = new ProductDTO();
		String expected =" ";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testSetUpdate_date7() {
		ProductDTO dto = new ProductDTO();
		String expected ="　";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testSetUpdate_date8() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testSetUpdate_date9() {
		ProductDTO dto = new ProductDTO();
		String expected ="あいう１２３";

		dto.setUpdate_date(expected);
		assertEquals(expected,dto.getUpdate_date());
	}
	@Test
	public void testSetUpdate_date10() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date11() {
		ProductDTO dto = new ProductDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date12() {
		ProductDTO dto = new ProductDTO();
		String expected ="ａｂｃあいう１２３";

		dto.setUpdate_date(expected);
		String actual = dto.getUpdate_date();
		assertEquals(expected,actual);
	}

}
