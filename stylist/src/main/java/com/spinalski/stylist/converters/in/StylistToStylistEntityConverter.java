package com.spinalski.stylist.converters.in;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.spinalski.stylist.data.entities.StylistEntity;
import com.spinalski.stylist.model.Stylist;

@Component
public class StylistToStylistEntityConverter implements Converter<Stylist, StylistEntity> {

	@Override
	public StylistEntity convert(Stylist source) {
		if (source == null) {
			return null;
		}
		StylistEntity stylist = new StylistEntity(source.getName(), source.getEmail());
		if (source.getId() != null) {
			stylist.setId(source.getId());
		}
		return stylist;
	}

}
