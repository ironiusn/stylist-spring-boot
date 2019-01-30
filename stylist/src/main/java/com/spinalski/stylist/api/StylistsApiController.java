package com.spinalski.stylist.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spinalski.stylist.data.entities.StylistEntity;
import com.spinalski.stylist.data.repository.StylistRepository;
import com.spinalski.stylist.model.Stylist;

@Controller
public class StylistsApiController implements StylistsApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private StylistRepository stylistRepository;

	@Autowired
	private Converter<StylistEntity, Stylist> stylistConverter;
	
	@Autowired
	private Converter<Stylist, StylistEntity> stylistToEntityConverter;

	@org.springframework.beans.factory.annotation.Autowired
	public StylistsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Override
	public ResponseEntity<List<Stylist>> getStylists() {

		List<Stylist> stylists = new ArrayList<>();
		stylists = stylistRepository.findAll().stream().map(s -> stylistConverter.convert(s))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(stylists);
	}
	
	@Override
	public ResponseEntity<Long> addStylist(Stylist stylist) {
		
		StylistEntity stylistEntity = stylistToEntityConverter.convert(stylist);
		StylistEntity saved = stylistRepository.save(stylistEntity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(saved.getId());
	}
	
}
