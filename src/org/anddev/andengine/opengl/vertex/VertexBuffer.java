package org.anddev.andengine.opengl.vertex;

import java.nio.ByteBuffer;

import org.anddev.andengine.opengl.BaseBuffer;
/**
 * @author Nicolas Gramlich
 * @since 12:16:18 - 09.03.2010
 */
public class VertexBuffer extends BaseBuffer {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public VertexBuffer() {
		super();
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public void update(final float pX, final float pY, final float pWidth, final float pHeight) {
		final ByteBuffer buffer = this.getByteBuffer();
		buffer.position(0);
		
		buffer.putFloat(pX);
		buffer.putFloat(pY);
		
		buffer.putFloat(pX + pWidth);
		buffer.putFloat(pY);
		
		buffer.putFloat(pX);
		buffer.putFloat(pY + pHeight);
		
		buffer.putFloat(pX + pWidth);
		buffer.putFloat(pY + pHeight);
		
		buffer.position(0);
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
