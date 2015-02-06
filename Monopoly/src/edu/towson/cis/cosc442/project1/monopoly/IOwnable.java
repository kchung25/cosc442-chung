package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	public abstract Player getTheOwner();

	public abstract int getPrice();

	public abstract void setTheOwner(Player owner);

}