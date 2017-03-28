package com.elte.converter1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

public class JsonSchemaGenerator {

	 public static void main(String[] args) throws JsonProcessingException {
	  ObjectMapper mapper = new ObjectMapper();
	        SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
	        mapper.acceptJsonFormatVisitor(Author.class, visitor);
	        JsonSchema schema = visitor.finalSchema();
	        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));

	 }

	}
