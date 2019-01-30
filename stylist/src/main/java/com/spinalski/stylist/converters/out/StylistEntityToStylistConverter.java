package com.spinalski.stylist.converters.out;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.spinalski.stylist.data.entities.StylistEntity;
import com.spinalski.stylist.model.Stylist;

@Component
public class StylistEntityToStylistConverter implements Converter<StylistEntity, Stylist> {

	@Override
	public Stylist convert(StylistEntity source) {
		Stylist stylist = new Stylist();
		stylist.setEmail(source.getEmail());
		stylist.setId(source.getId());
		stylist.setName(source.getName());
		return stylist;
	}

}
