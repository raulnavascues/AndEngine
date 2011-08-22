package org.anddev.andengine.opengl.shader;

import java.util.ArrayList;

import org.anddev.andengine.opengl.shader.util.constants.ShaderPrograms;


/**
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:55:26 - 11.08.2011
 */
public class ShaderProgramManager {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final ArrayList<ShaderProgram> mShaderProgramsManaged = new ArrayList<ShaderProgram>();

	// ===========================================================
	// Constructors
	// ===========================================================

	public ShaderProgramManager() {
		this.loadShaderProgram(ShaderPrograms.SHADERPROGRAM_POSITION_COLOR_TEXTURECOORDINATES);
		this.loadShaderProgram(ShaderPrograms.SHADERPROGRAM_POSITION_TEXTURECOORDINATES);
		this.loadShaderProgram(ShaderPrograms.SHADERPROGRAM_POSITION_COLOR);
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

	public synchronized void clear() {
		this.mShaderProgramsManaged.clear();
	}

	public synchronized void loadShaderProgram(final ShaderProgram pShaderProgram) {
		if(pShaderProgram == null) {
			throw new IllegalArgumentException("pShaderProgram must not be null!");
		}
		this.mShaderProgramsManaged.add(pShaderProgram);
	}

	public void loadShaderPrograms(final ShaderProgram ... pShaderPrograms) {
		for(int i = pShaderPrograms.length - 1; i >= 0; i--) {
			this.loadShaderProgram(pShaderPrograms[i]);
		}
	}

	public synchronized void reloadShaderPrograms() {
		final ArrayList<ShaderProgram> managedShaderPrograms = this.mShaderProgramsManaged;
		for(int i = managedShaderPrograms.size() - 1; i >= 0; i--) {
			managedShaderPrograms.get(i).setCompiled(false);
		}
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}