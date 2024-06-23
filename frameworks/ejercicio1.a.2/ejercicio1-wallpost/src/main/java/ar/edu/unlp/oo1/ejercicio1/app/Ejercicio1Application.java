package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.logging.JSONFormatter;
import ar.edu.unlp.oo1.ejercicio1.logging.UpperCaseFormatter;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger modelLogger = Logger.getLogger("main.model");
		Handler modelLoggerHandler = new FileHandler("model.log.json");
		modelLoggerHandler.setFormatter(new JSONFormatter());
		modelLogger.addHandler(modelLoggerHandler);
		modelLogger.setLevel(Level.WARNING);

		Logger uiLogger = Logger.getLogger("main.ui");
		Handler uiLoggerHandler = new FileHandler("ui.log.json");
		uiLoggerHandler.setFormatter(new JSONFormatter());
		uiLogger.addHandler(uiLoggerHandler);
		uiLogger.setLevel(Level.INFO);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
