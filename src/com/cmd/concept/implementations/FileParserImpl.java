package com.cmd.concept.implementations;

import java.io.IOException;

import com.cmd.concept.files.FileParser;
import com.cmd.concept.interfaces.FileOperations;
import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class FileParserImpl implements FileOperations {

	@Override
	public SourceDestination returnLastSavedLinks(String file) throws JsonParseException, JsonMappingException, IOException {
		FileParser fileParser=new FileParser(file);
		return fileParser.getSourceDestination();
	}

}
