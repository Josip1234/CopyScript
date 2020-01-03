package com.cmd.concept.interfaces;

import java.io.IOException;
import java.util.Map;

import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface FileOperations {
SourceDestination returnLastSavedLinks(String file) throws JsonParseException, JsonMappingException, IOException;
void createFile(SourceDestination sourceDestination, String file);
void moveFile(SourceDestination sourceDestination, String file);
void saveLastEnteredSourceAndDestinationToFile(SourceDestination sourceDestination);
//Map<String, String> removeDoubleValueFromString(SourceDestination sourceDestination);
//String returnCleanedString(String string);
}
