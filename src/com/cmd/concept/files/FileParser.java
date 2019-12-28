package com.cmd.concept.files;

import java.io.File;
import java.io.IOException;

import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileParser {
	ObjectMapper mapper;
	String lastFile;
	SourceDestination sourceDestination;
	
	public FileParser(String lastFile) throws JsonParseException, JsonMappingException, IOException {
		this.mapper=new ObjectMapper();
		this.lastFile=lastFile;
		this.sourceDestination=this.mapper.readValue(new File(this.lastFile), SourceDestination.class);
		
	}

	public String getLastFile() {
		return lastFile;
	}

	public void setLastFile(String lastFile) {
		this.lastFile = lastFile;
	}

	public SourceDestination getSourceDestination() {
		return sourceDestination;
	}

	public void setSourceDestination(SourceDestination sourceDestination) {
		this.sourceDestination = sourceDestination;
	}



}
