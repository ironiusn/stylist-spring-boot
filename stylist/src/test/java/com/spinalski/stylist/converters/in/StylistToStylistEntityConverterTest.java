package com.spinalski.stylist.converters.in;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import com.spinalski.stylist.data.entities.StylistEntity;
import com.spinalski.stylist.model.Stylist;

public class StylistToStylistEntityConverterTest {

	@Test
	public void testConvertEmpty() {
		StylistToStylistEntityConverter converter = new StylistToStylistEntityConverter();
		Stylist source = null;
		StylistEntity convert = converter.convert(source );
		assertNull(convert);
	}
	
	@Test
	public void testConvert() {
		StylistToStylistEntityConverter converter = new StylistToStylistEntityConverter();
		Stylist source = new Stylist();
		source.setName("Test Name");
		source.setEmail("test@email.com");
		
		StylistEntity convert = converter.convert(source );
		assertNotNull(convert);
		assertEquals(source.getName(), convert.getName());
		assertEquals(source.getEmail(), convert.getEmail());
	}

}
