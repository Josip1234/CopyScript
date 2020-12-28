package com.copy.script.test.data;

import com.copy.script.parsing.classes.TvShow;

/***
 * 
 * @author Korisnik
 * @category TestData
 * @version 1.0
 * @since 28.12.2020. 21:34
 */
public class TestPojo {
	private Integer identity;
	private TvShow show;
	
	/**
	 * @author Korisnik
	 * @since 28.12.2020. 21:35
	 * @param identity set new identity
	 * @param show set new tv show object
	 */
	public TestPojo(Integer identity, TvShow show) {
		this.identity = identity;
		this.show = show;
	}

	/***
	 * @author Korisnik
	 * @since 28.12.2020. 21:36
	 * @return identity number
	 */
	public Integer getIdentity() {
		return identity;
	}
/**
 *  @author Korisnik
 *  @since 28.12.2020. 21:36
 * @param identity set new identity number
 */
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
/**
 *  @author Korisnik
 *  @since 28.12.2020. 21:36
 * @return tv show
 */
	public TvShow getShow() {
		return show;
	}
/***
 *  @author Korisnik
 *  @since 28.12.2020. 21:36
 * @param show set new tv show
 */
	public void setShow(TvShow show) {
		this.show = show;
	}
	
	
	
	

}