package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : pix.h:190</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class FPixa extends Structure {
	/**
	 * number of fpix in ptr array<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * number of fpix ptrs allocated<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	public int refcount;
	/**
	 * the array of ptrs to fpix<br>
	 * C type : FPix**
	 */
	public net.sourceforge.lept4j.FPix.ByReference[] fpix;
	public FPixa() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("n", "nalloc", "refcount", "fpix");
	}
	/**
	 * @param n number of fpix in ptr array<br>
	 * C type : l_int32<br>
	 * @param nalloc number of fpix ptrs allocated<br>
	 * C type : l_int32<br>
	 * @param refcount reference count (1 if no clones)<br>
	 * C type : l_uint32<br>
	 * @param fpix the array of ptrs to fpix<br>
	 * C type : FPix**
	 */
	public FPixa(int n, int nalloc, int refcount, net.sourceforge.lept4j.FPix.ByReference fpix[]) {
		super();
		this.n = n;
		this.nalloc = nalloc;
		this.refcount = refcount;
		if ((fpix.length != this.fpix.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.fpix = fpix;
	}
	public FPixa(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FPixa implements Structure.ByReference {
		
	};
	public static class ByValue extends FPixa implements Structure.ByValue {
		
	};
}