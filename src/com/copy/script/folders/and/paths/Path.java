/**
 * 
 */
package com.copy.script.folders.and.paths;

/**
 * @author Korisnik
 * @since 23.3.2020. 18:37
 * <blockquote>CLass which will be used for parsing source and directory from default json file. 
 * Will contain source and destination string actually.</blockquote>
 *
 */
public class Path {
	private String source;
	private String destination;
	
	public Path() {
		this.source="";
		this.destination="";
	}
	public Path(String source, String destination) {
		this.source=source;
		this.destination=destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Path: source=" + getSource() + ", destination=" + getDestination() + "";
	}
	

}
