package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Data used for decoding a line of characters.<br>
 * <i>native declaration : recog.h:165</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Rdid extends Structure {
	/**
	 * clone of pix to be decoded<br>
	 * C type : Pix*
	 */
	public net.sourceforge.lept4j.Pix.ByReference pixs;
	/**
	 * count array for each averaged template<br>
	 * C type : l_int32**
	 */
	public PointerByReference counta;
	/**
	 * best y-shift array per averaged template<br>
	 * C type : l_int32**
	 */
	public PointerByReference delya;
	/**
	 * number of averaged templates<br>
	 * C type : l_int32
	 */
	public int narray;
	/**
	 * size of count array (width of pixs)<br>
	 * C type : l_int32
	 */
	public int size;
	/**
	 * setwidths for each template<br>
	 * C type : l_int32*
	 */
	public IntByReference setwidth;
	/**
	 * pixel count in pixs by column<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nasum;
	/**
	 * first moment of pixels in pixs by column<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference namoment;
	/**
	 * 1 if full arrays are made; 0 otherwise<br>
	 * C type : l_int32
	 */
	public int fullarrays;
	/**
	 * channel coeffs for template fg term<br>
	 * C type : l_float32*
	 */
	public FloatByReference beta;
	/**
	 * channel coeffs for bit-and term<br>
	 * C type : l_float32*
	 */
	public FloatByReference gamma;
	/**
	 * score on trellis<br>
	 * C type : l_float32*
	 */
	public FloatByReference trellisscore;
	/**
	 * template on trellis (for backtrack)<br>
	 * C type : l_int32*
	 */
	public IntByReference trellistempl;
	/**
	 * indices of best path templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference natempl;
	/**
	 * x locations of best path templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference naxloc;
	/**
	 * y locations of best path templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nadely;
	/**
	 * widths of best path templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nawidth;
	/**
	 * correlation scores: best path templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nascore;
	/**
	 * indices of best rescored templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference natempl_r;
	/**
	 * x locations of best rescoredtemplates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference naxloc_r;
	/**
	 * y locations of best rescoredtemplates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nadely_r;
	/**
	 * widths of best rescoredtemplates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nawidth_r;
	/**
	 * correlation scores: rescored templates<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nascore_r;
	public L_Rdid() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pixs", "counta", "delya", "narray", "size", "setwidth", "nasum", "namoment", "fullarrays", "beta", "gamma", "trellisscore", "trellistempl", "natempl", "naxloc", "nadely", "nawidth", "nascore", "natempl_r", "naxloc_r", "nadely_r", "nawidth_r", "nascore_r");
	}
	public L_Rdid(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends L_Rdid implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Rdid implements Structure.ByValue {
		
	};
}
