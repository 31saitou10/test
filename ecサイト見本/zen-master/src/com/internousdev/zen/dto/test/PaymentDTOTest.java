package com.internousdev.zen.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.zen.dto.PaymentDTO;

public class PaymentDTOTest {

	/*
	 * int userId getter
	 */

	// 0
	@Test
	public void testGetUserId1() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 0;
		dto.setUserID(expected);
		assertEquals(expected, dto.getUserId());
	}

	// 最大値
	@Test
	public void testGetUserId2() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 2147483647;
		dto.setUserID(expected);
		assertEquals(expected, dto.getUserId());
	}

	// 最小値
	@Test
	public void testGetUserId3() {
		PaymentDTO dto = new PaymentDTO();
		int expected = -2147483648;
		dto.setUserID(expected);
		assertEquals(expected, dto.getUserId());
	}

	// 最大値以上
	@Test
	public void testGetUserId4() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setUserID(expected);
			assertEquals(expected, dto.getUserId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	// 最小値以下
	@Test
	public void testGetUserId5() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setUserID(expected);
			assertEquals(expected, dto.getUserId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/*
	 * int userId setter
	 */

	// 0
	@Test
	public void testSetUserId1() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 0;
		dto.setUserID(expected);
		assertEquals(expected, dto.getUserId());
	}

	// 最大値
	@Test
	public void testSetUserId2() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 2147483647;
		dto.setUserID(expected);
		assertEquals(expected, dto.getUserId());
	}

	// 最小値
	@Test
	public void testSetUserId3() {
		PaymentDTO dto = new PaymentDTO();
		int expected = -2147483648;
		dto.setUserID(expected);
		assertEquals(expected, dto.getUserId());
	}

	// 最大値以上
	@Test
	public void testSetUserId4() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setUserID(expected);
			assertEquals(expected, dto.getUserId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	// 最小値以下
	@Test
	public void testSetUserId5() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setUserID(expected);
			assertEquals(expected, dto.getUserId());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/*
	 * String productId getter
	 */

	@Test
	public void testGetproductId1() {
		PaymentDTO dto= new PaymentDTO();
		String expected = "漢字";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testGetproductId12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}

	/*
	 * productId setter
	 */

	@Test
	public void testSetproductId1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}
	@Test
	public void testSetproductId12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setproductId(expected);
		assertEquals(expected, dto.getproductId());
	}

	/*
	 * productName getter
	 */
	@Test
	public void testGetProductName1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testGetProductName12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}

	/*
	 * productName setter
	 */

	@Test
	public void testSetProductName1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}
	@Test
	public void testSetProductName12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setProductName(expected);
		assertEquals(expected, dto.getProductName());
	}

	/*
	 * String price getter
	 */

	@Test
	public void testGetPrice1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testGetPrice12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	/*
	 * String price setter
	 */

	@Test
	public void testSetPrice1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}
	@Test
	public void testSetPrice12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setPrice(expected);
		assertEquals(expected, dto.getPrice());
	}

	/*
	 * Stirng productCount getter
	 */

	@Test
	public void testGetProductCount1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testGetProductCount12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}

	/*
	 * String productCount setter
	 */

	@Test
	public void testSetProductCount1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}
	@Test
	public void testSetProductCount12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setProductCount(expected);
		assertEquals(expected, dto.getProductCount());
	}

	/*
	 * Stirng imageFilePatht
	 *
	 */

	@Test
	public void testGetImageFilePath1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testGetImageFilePath12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	/*
	 * String imageFilePath setter
	 */

	@Test
	public void testSetImageFilePath1() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "漢字";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath2() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "bbb";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath3() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｂｂｂ";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath4() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "111";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath5() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "１１１";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath6() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "あああ";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath7() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "%-_@.*!<>\\\"\'/~|()=&$#{}[];:";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath8() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "ｱｱｱ";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath9() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "アアア";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath10() {
		PaymentDTO dto = new PaymentDTO();
		String expected = " ¥n　";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath11() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}
	@Test
	public void testSetImageFilePath12() {
		PaymentDTO dto = new PaymentDTO();
		String expected = "null";
		dto.setImageFilePath(expected);
		assertEquals(expected, dto.getImageFilePath());
	}

	/*
	 * int userId getter
	 */

	// 0
	@Test
	public void testGetTotalPrice1() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 0;
		dto.setUserID(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	// 最大値
	@Test
	public void testGetTotalPrice2() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 2147483647;
		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	// 最小値
	@Test
	public void testGetTotalPrice3() {
		PaymentDTO dto = new PaymentDTO();
		int expected = -2147483648;
		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	// 最大値以上
	@Test
	public void testGetTotalPrice4() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setUserID(expected);
			assertEquals(expected, dto.getTotalPrice());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	// 最小値以下
	@Test
	public void testGetTotalPrice5() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setUserID(expected);
			assertEquals(expected, dto.getTotalPrice());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/*
	 * int userId setter
	 */

	// 0
	@Test
	public void testSetTotalPrice1() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 0;
		dto.setUserID(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	// 最大値
	@Test
	public void testSetTotalPrice2() {
		PaymentDTO dto = new PaymentDTO();
		int expected = 2147483647;
		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	// 最小値
	@Test
	public void testSetTotalPrice3() {
		PaymentDTO dto = new PaymentDTO();
		int expected = -2147483648;
		dto.setTotalPrice(expected);
		assertEquals(expected, dto.getTotalPrice());
	}

	// 最大値以上
	@Test
	public void testSetTotalPrice4() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("2147483648");
			dto.setUserID(expected);
			assertEquals(expected, dto.getTotalPrice());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	// 最小値以下
	@Test
	public void testSetTotalPrice5() {
		PaymentDTO dto = new PaymentDTO();
		try {
			int expected = Integer.parseInt("-2147483649");
			dto.setUserID(expected);
			assertEquals(expected, dto.getTotalPrice());
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


}
