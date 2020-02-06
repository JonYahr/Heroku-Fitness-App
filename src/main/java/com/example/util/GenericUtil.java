package com.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class GenericUtil {

	public static String objectToJson(Object object) {
		ObjectWriter ow = new ObjectMapper().writer();
		String json = "";
		try {
			json = ow.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			json = "GenericUtil(Object object) method failed to generate valid JSON.";
		}
		return json;
	}
}