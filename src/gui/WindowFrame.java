package gui;

import javax.swing.*;

import manager.FlightManager;

public class WindowFrame extends JFrame {
	FlightManager flightManager;
	
	MenuSelection menuSelection;
	FlightUploader flightUploader;
	FlightRemover flightRemover;
	FlightEditor flightEditor;
	AllFlightViewer allViewer;
	FlightSearcher flightSearcher;
	
	public WindowFrame(FlightManager flightManager) {
		this.flightManager = flightManager;
		
		this.menuSelection = new MenuSelection(this);
		this.flightUploader = new FlightUploader(this);
		this.flightRemover = new FlightRemover(this);
		this.flightEditor = new FlightEditor(this);
		this.allViewer = new AllFlightViewer(this, this.flightManager);
		this.flightSearcher = new FlightSearcher(this);
		
		this.setSize(700, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setupPanel(menuSelection);
		this.setTitle("Flight Management");
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public void setupSize(int width, int height) {
		this.setSize(width, height);
	}
	
	public void setupTitle(String title) {
		this.setTitle(title);
	}

	public FlightManager getFlightManager() {
		return flightManager;
	}

	public void setFlightManager(FlightManager flightManager) {
		this.flightManager = flightManager;
	}

	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public FlightUploader getFlightUploader() {
		return flightUploader;
	}

	public void setFlightUploader(FlightUploader flightUploader) {
		this.flightUploader = flightUploader;
	}

	public FlightRemover getFlightRemover() {
		return flightRemover;
	}

	public void setFlightRemover(FlightRemover flightRemover) {
		this.flightRemover = flightRemover;
	}

	public FlightEditor getFlightEditor() {
		return flightEditor;
	}

	public void setFlightEditor(FlightEditor flightEditor) {
		this.flightEditor = flightEditor;
	}

	public AllFlightViewer getAllViewer() {
		return allViewer;
	}

	public void setAllViewer(AllFlightViewer allViewer) {
		this.allViewer = allViewer;
	}

	public FlightSearcher getFlightSearcher() {
		return flightSearcher;
	}

	public void setFlightSearcher(FlightSearcher flightSearcher) {
		this.flightSearcher = flightSearcher;
	}
}
