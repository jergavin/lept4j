package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : bmf.h:19</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Bmf extends Structure {
	/**
	 * pixa of bitmaps for 93 characters<br>
	 * C type : Pixa*
	 */
	public net.sourceforge.lept4j.Pixa.ByReference pixa;
	/**
	 * font size (in points at 300 ppi)<br>
	 * C type : l_int32
	 */
	public int size;
	/**
	 * directory containing font bitmaps<br>
	 * C type : char*
	 */
	public Pointer directory;
	/**
	 * baseline offset for ascii 33 - 57<br>
	 * C type : l_int32
	 */
	public int baseline1;
	/**
	 * baseline offset for ascii 58 - 91<br>
	 * C type : l_int32
	 */
	public int baseline2;
	/**
	 * baseline offset for ascii 93 - 126<br>
	 * C type : l_int32
	 */
	public int baseline3;
	/**
	 * max height of line of chars<br>
	 * C type : l_int32
	 */
	public int lineheight;
	/**
	 * pixel dist between char bitmaps<br>
	 * C type : l_int32
	 */
	public int kernwidth;
	/**
	 * pixel dist between word bitmaps<br>
	 * C type : l_int32
	 */
	public int spacewidth;
	/**
	 * extra vertical space between text lines<br>
	 * C type : l_int32
	 */
	public int vertlinesep;
	/**
	 * table mapping ascii --> font index<br>
	 * C type : l_int32*
	 */
	public IntByReference fonttab;
	/**
	 * table mapping ascii --> baseline offset<br>
	 * C type : l_int32*
	 */
	public IntByReference baselinetab;
	/**
	 * table mapping ascii --> char width<br>
	 * C type : l_int32*
	 */
	public IntByReference widthtab;
	public L_Bmf() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pixa", "size", "directory", "baseline1", "baseline2", "baseline3", "lineheight", "kernwidth", "spacewidth", "vertlinesep", "fonttab", "baselinetab", "widthtab");
	}
	public L_Bmf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends L_Bmf implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Bmf implements Structure.ByValue {
		
	};
}