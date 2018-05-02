package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.ResetPasswordDTO;

public class ResetPasswordDTOTest {


	/*
	 * String LoginId
	 * getter
	 */
	@Test
	public void testGetLoginId1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "漢字";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "bbb";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｂｂｂ";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "111";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "１１１";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あああ";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｱｱｱ";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "アアア";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ¥n　";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}


	/*
	 * String LoginId
	 * setter
	 */
	@Test
	public void testSetLoginId1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "漢字";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "bbb";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｂｂｂ";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "111";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "１１１";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あああ";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｱｱｱ";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "アアア";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ¥n　";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testSetLoginId12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";
		dto.setLoginId(expected);
		assertEquals(expected, dto.getLoginId());
	}


	/*
	 * String Password
	 * getter
	 */
	@Test
	public void testGetPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "漢字";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "bbb";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｂｂｂ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "111";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "１１１";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あああ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｱｱｱ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "アアア";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ¥n　";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}


	/*
	 * String Password
	 * setter
	 */
	@Test
	public void testSetPassword1() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "漢字";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword2() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "bbb";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword3() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｂｂｂ";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword4() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "111";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword5() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "１１１";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword6() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "あああ";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword7() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword8() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "ｱｱｱ";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword9() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "アアア";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword10() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = " ¥n　";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword11() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testSetPassword12() {
		ResetPasswordDTO dto = new ResetPasswordDTO();
		String expected = "null";
		dto.setPassword(expected);
		assertEquals(expected, dto.getPassword());
	}

}
