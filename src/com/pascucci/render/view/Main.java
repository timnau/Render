/*
 * All rights reserved by the author.
 * Unauthorized distribution is prohibited.
 */

package com.pascucci.render.view;

import java.awt.Frame;

import javax.swing.JFrame;

/**
 * Instantiates a new instance of the application, providing the starting point
 * for the rendering application.
 * 
 * @author Nick Pascucci <nick@kestrelrobotics.com>
 */

public class Main {
	public static void main(String[] args) {
		RenderInterface ri = new RenderInterface();
		ri.setSize(800, 600);

		// Niceties
		ri.setTitle("Renderer");

		ri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ri.setVisible(true);
		ri.setExtendedState(Frame.MAXIMIZED_BOTH);
	}
}
