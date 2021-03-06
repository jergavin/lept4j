package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : pix.h:110</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Boxa extends Structure {
	/**
	 * number of box in ptr array<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * number of box ptrs allocated<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * reference count (1 if no clones)<br>
	 * C type : l_uint32
	 */
	public int refcount;
	/**
	 * box ptr array<br>
	 * C type : Box**
	 */
	public PointerByReference box;
	public Boxa() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("n", "nalloc", "refcount", "box");
	}
	/**
	 * @param n number of box in ptr array<br>
	 * C type : l_int32<br>
	 * @param nalloc number of box ptrs allocated<br>
	 * C type : l_int32<br>
	 * @param refcount reference count (1 if no clones)<br>
	 * C type : l_uint32<br>
	 * @param box box ptr array<br>
	 * C type : Box**
	 */
	public Boxa(int n, int nalloc, int refcount, PointerByReference box) {
		super();
		this.n = n;
		this.nalloc = nalloc;
		this.refcount = refcount;
//		if ((box.length != this.box.length)) 
//			throw new IllegalArgumentException("Wrong array size !");
		this.box = box;
	}
	public Boxa(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends Boxa implements Structure.ByReference {
		
	};
	public static class ByValue extends Boxa implements Structure.ByValue {
		
	};
}
