package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.InquiryDTO;

public class InquiryDTOTest {


	/*
	 * String Name
	 * getter
	 */
	@Test
	public void testGetName1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}

	@Test
	public void testGetName12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setName(expected);

		assertEquals(expected, dto.getName());
	}


	/*
	 * String Name
	 * setter
	 */
	@Test
	public void testSetName1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}

	@Test
	public void testSetName12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";
		dto.setName(expected);
		assertEquals(expected, dto.getName());
	}


	/*
	 * String Mailaddress
	 * getter
	 */
	@Test
	public void testGetMailaddress1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testGetMailaddress12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setMailaddress(expected);

		assertEquals(expected, dto.getMailaddress());
	}


	/*
	 * String Mailaddress
	 * setter
	 */
	@Test
	public void testSetMailaddress1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}

	@Test
	public void testSetMailaddress12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";
		dto.setMailaddress(expected);
		assertEquals(expected, dto.getMailaddress());
	}


	/*
	 * String Qtype
	 * getter
	 */
	@Test
	public void testGetQtype1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testGetQtype12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setQtype(expected);

		assertEquals(expected, dto.getQtype());
	}


	/*
	 * String Body
	 * setter
	 */
	@Test
	public void testSetQtype1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}

	@Test
	public void testSetQtype12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";
		dto.setQtype(expected);
		assertEquals(expected, dto.getQtype());
	}


	/*
	 * String Body
	 * getter
	 */
	@Test
	public void testGetBody1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testGetBody12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";

		dto.setBody(expected);

		assertEquals(expected, dto.getBody());
	}


	/*
	 * String Body
	 * setter
	 */
	@Test
	public void testSetBody1() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "漢字";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody2() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "bbb";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody3() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｂｂｂ";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody4() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "111";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody5() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "１１１";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody6() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "あああ";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody7() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody8() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "ｱｱｱ";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody9() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "アアア";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody10() {
		InquiryDTO dto = new InquiryDTO();
		String expected = " ¥n　";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody11() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

	@Test
	public void testSetBody12() {
		InquiryDTO dto = new InquiryDTO();
		String expected = "null";
		dto.setBody(expected);
		assertEquals(expected, dto.getBody());
	}

}
