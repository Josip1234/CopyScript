package com.cmd.concept.interfaces;

import java.util.List;

import com.cmd.concept.pojo.SourceDestination;

public interface DirectoryOperations {
 List<String> printSourceDirectoryFiles(SourceDestination source);
 String returnFileNameInDestinationDirectory(SourceDestination destination, String file);

}
