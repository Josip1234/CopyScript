package com.cmd.concept.interfaces;

import java.io.IOException;

import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface FileOperations {
SourceDestination returnLastSavedLinks(String file) throws JsonParseException, JsonMappingException, IOException;
}
