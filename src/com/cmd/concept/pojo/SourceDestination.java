package com.cmd.concept.pojo;
//will be used by jackson to parse json file 
public class SourceDestination {
	String sourceDirectory;
	String destinationDirectory;
	
	public SourceDestination() {
		
	}
	public SourceDestination(String sourceDirectory, String destinationDirectory) {
		this.sourceDirectory = sourceDirectory+"/";
		this.destinationDirectory = destinationDirectory+"/";
	}
	public String getSourceDirectory() {
		return sourceDirectory;
	}
	public void setSourceDirectory(String sourceDirectory) {
		this.sourceDirectory = sourceDirectory+"/";
	}
	public String getDestinationDirectory() {
		return destinationDirectory;
	}
	public void setDestinationDirectory(String destinationDirectory) {
		this.destinationDirectory = destinationDirectory+"/";
	}
	@Override
	public String toString() {
		return "SourceDestination [sourceDirectory=" + sourceDirectory + ", destinationDirectory="
				+ destinationDirectory + "]";
	}
	
	

}
